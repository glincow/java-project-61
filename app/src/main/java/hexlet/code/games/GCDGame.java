package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.GameUtils;

public final class GCDGame {
    public static final int MAX_ROUNDS_COUNT = 3;
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] questionsAndAnswers = new String[MAX_ROUNDS_COUNT][2];
        for (int i = 0; i < MAX_ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int firstNumber = GameUtils.getRandomInt(1, MAX_NUMBER);
        int secondNumber = GameUtils.getRandomInt(1, MAX_NUMBER);
        String question = firstNumber + " " + secondNumber;

        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }
        String answer = String.valueOf(firstNumber + secondNumber);

        return new String[]{question, answer};
    }
}
