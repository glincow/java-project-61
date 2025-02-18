package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {

    public static void runGame(Game game) {
        String userName = Cli.greetUser();
        int roundCount = 0;
        while (roundCount < Game.MAX_ROUNDS_COUNT) {
            String[] questionAndAnswerArray = game.generateQuestionAndAnswer();
            String question = questionAndAnswerArray[0];
            String answer = questionAndAnswerArray[1];

            System.out.println(game.getDescription());
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
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

        if (roundCount == Game.MAX_ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
