package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                6 - Prime
                5 - Progression
                4 - GCD
                3 - Calc
                2 - Even
                1 - Greet
                0 - Exit
                Your choice: """);
        Scanner scanner = new Scanner(System.in);
        try {
            int userMenuChoice = scanner.nextInt();
            switch (userMenuChoice) {
                case GREET:
                    Cli.greetUser();
                    break;
                case EVEN:
                    EvenGame.run();
                    break;
                case CALC:
                    CalcGame.run();
                    break;
                case GCD:
                    GCDGame.run();
                    break;
                case PROGRESSION:
                    ProgressionGame.run();
                    break;
                case PRIME:
                    PrimeGame.run();
                    break;
                case EXIT:
                    Cli.byeUser();
                    break;
                default:
                    System.out.println("This command is not supported...");
            }
        } catch (InputMismatchException e) {
            System.out.println("This command is not supported...");
        }
    }
}
