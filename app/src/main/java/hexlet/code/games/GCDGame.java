package hexlet.code.games;

import hexlet.code.Cli;

public final class GCDGame implements Game {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    @Override
    public String[] generateQuestionAndAnswer() {
        int firstNumber = Cli.getRandomInt(1, MAX_NUMBER);
        int secondNumber = Cli.getRandomInt(1, MAX_NUMBER);
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

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}