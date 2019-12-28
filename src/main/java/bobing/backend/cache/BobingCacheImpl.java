package bobing.backend.cache;

import bobing.backend.model.DianShu;
import bobing.backend.repository.DianShuRepository;
import bobing.backend.service.WriteBehindCacheWriter;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;

public class BobingCacheImpl implements BobingCache {

    private static final Logger logger = LoggerFactory.getLogger(BobingCacheImpl.class);
    private LoadingCache<Long, DianShu> cache;

    @Autowired
    private DianShuRepository dianShuRepository;

    @PostConstruct
    public void startUp() {

        cache = Caffeine.newBuilder()
                .maximumSize(300)
                .expireAfterAccess(5, TimeUnit.MINUTES)
                .writer(new WriteBehindCacheWriter.Builder<Long, DianShu>()
                        .bufferTime(3, TimeUnit.MINUTES) // write to db in 3 mins
                        .coalesce(BinaryOperator.maxBy(DianShu::compareTo))
                        .writeAction(entries -> entries.entrySet().stream().forEach(
                                x -> dianShuRepository.save(x.getValue())
                        )).build())
                .build(key -> dianShuRepository.getOne(key));

    }

    @Override
    public DianShu get(Long key) {
        try {
            return cache.get(key);
        } catch (Exception e) {
            logger.info("get cache exception, key = " + key + " not in cache.");
        }
        return null;
    }

    @Override
    public void put(Long key, DianShu value) {
        cache.put(key, value);
    }

}
