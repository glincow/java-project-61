package hexlet.code;

import java.util.Random;

public class GameUtils {
    public static int getRandomInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
