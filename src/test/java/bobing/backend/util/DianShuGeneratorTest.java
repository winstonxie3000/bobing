package bobing.backend.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DianShuGeneratorTest {

    @Test
    void randomDianShu() {

        String result;
        for (int i = 1; i < 10000; i++) {
            result = DianShuGenerator.randomDianShu();
            System.out.println(result);
            Assertions.assertEquals(result.length(), 6);
        }
    }

    @Test
    void getRandomNumberInRange() {

        for (int i = 1; i < 10000; i++) {
            Assertions.assertTrue(DianShuGenerator.getRandomNumberInRange(i, 2 * i) >= i);
            Assertions.assertTrue(DianShuGenerator.getRandomNumberInRange(i, 2 * i) <= 2 * i);
        }
    }
}