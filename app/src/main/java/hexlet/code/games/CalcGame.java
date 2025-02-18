package hexlet.code.games;

import hexlet.code.Cli;

public final class CalcGame implements Game {
    public static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_OPERATION_INDEX = 2;

    @Override
    public String[] generateQuestionAndAnswer() {
        int firstNumber = Cli.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        int secondNumber = Cli.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        String operation = OPERATIONS[Cli.getRandomInt(0, MAX_OPERATION_INDEX)];
        String question = firstNumber + " " + operation + " " + secondNumber;

        int answer;
        switch (operation) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Something went wrong...");
                return null;
        }
        return new String[]{question, String.valueOf(answer)};
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
