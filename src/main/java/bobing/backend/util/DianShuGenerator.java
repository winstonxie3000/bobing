package bobing.backend.util;

import java.util.Random;

public class DianShuGenerator {

    public static String randomDianShu() {

        String result = "";
        for (int i = 0; i < 6; i++) {
            result += String.valueOf(getRandomNumberInRange(1,6));
        }

        return result;
    }

    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
}
