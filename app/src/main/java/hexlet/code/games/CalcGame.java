package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public final class CalcGame {
    public static final int MAX_ROUNDS_COUNT = 3;
    public static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_OPERATION_INDEX = 2;

    public static void run() {
        String[][] questionsAndAnswers = new String[MAX_ROUNDS_COUNT][2];
        for (int i = 0; i < MAX_ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int firstNumber = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        int secondNumber = GameUtils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
        String operation = OPERATIONS[GameUtils.getRandomInt(0, MAX_OPERATION_INDEX)];
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
}
