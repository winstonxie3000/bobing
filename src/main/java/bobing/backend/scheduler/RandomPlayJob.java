package bobing.backend.scheduler;

import bobing.backend.util.DianShuGenerator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RandomPlayJob {

    @Scheduled(fixedRate = 5000)
    public void process() {
        System.out.println(DianShuGenerator.randomDianShu());
    }
}
