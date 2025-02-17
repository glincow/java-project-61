package hexlet.code;

import java.util.Scanner;

public class Game {

    public static void runGameEven() {
        String userName = Cli.greetUser();
        int maxRounds = 3;
        int roundCount = 0;
        while (roundCount < maxRounds) {
            int number =  (int) (Math.random() * 100 + 1);
            String answer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                roundCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }

        if (roundCount == maxRounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }


}
