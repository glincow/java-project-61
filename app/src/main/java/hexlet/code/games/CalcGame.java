package hexlet.code.games;

import hexlet.code.Cli;

public class CalcGame implements Game {
    public static final String DESCRIPTION  = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public String[] generateQuestionAndAnswer() {
        int firstNumber = Cli.getRandomInt(1, 100);
        int secondNumber = Cli.getRandomInt(1, 100);
        String operation = OPERATIONS[Cli.getRandomInt(0, 2)];
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

    public String getDescription() {
        return DESCRIPTION;
    }
}
