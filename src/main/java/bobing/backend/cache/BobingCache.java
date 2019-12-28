package bobing.backend.cache;

import bobing.backend.model.DianShu;

import javax.annotation.PostConstruct;

public interface BobingCache {

    DianShu get(Long key);

    void put(Long key, DianShu value);
}
