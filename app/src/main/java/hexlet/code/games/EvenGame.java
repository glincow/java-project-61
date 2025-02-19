package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public final class EvenGame {
    public static final int MAX_ROUNDS_COUNT = 3;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] questionsAndAnswers = new String[MAX_ROUNDS_COUNT][2];
        for (int i = 0; i < MAX_ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int number = GameUtils.getRandomInt(1, MAX_NUMBER);
        String answer = number % 2 == 0 ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }
}
