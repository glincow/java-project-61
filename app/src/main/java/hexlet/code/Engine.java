package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_ROUNDS_COUNT = 3;

    public static void runGame(String mainQuestion, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        int roundCount = 0;
        while (roundCount < MAX_ROUNDS_COUNT) {
            String question = questionsAndAnswers[roundCount][0];
            String answer = questionsAndAnswers[roundCount][1];

            System.out.println(mainQuestion);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                roundCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'");
                System.out.println("Let's try again, " + userName + '!');
                break;
            }
        }

        if (roundCount == MAX_ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
