package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public final class PrimeGame {
    public static final int MAX_ROUNDS_COUNT = 3;
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] questionsAndAnswers = new String[MAX_ROUNDS_COUNT][2];
        for (int i = 0; i < MAX_ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int number = GameUtils.getRandomInt(2, MAX_NUMBER);

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        String answer = isPrime ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }
}
