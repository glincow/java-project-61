package hexlet.code.games;

import hexlet.code.Cli;

public class GCDGame implements Game {
    public static final String DESCRIPTION  = "Find the greatest common divisor of given numbers.";

    public String[] generateQuestionAndAnswer() {
        int firstNumber = Cli.getRandomInt(1, 100);
        int secondNumber = Cli.getRandomInt(1, 100);
        String question = firstNumber + " " + secondNumber;

        while (firstNumber != 0 & secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }
        String answer = String.valueOf(firstNumber + secondNumber);

        return new String[]{question, answer};
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
