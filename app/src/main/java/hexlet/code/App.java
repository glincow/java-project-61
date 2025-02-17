package hexlet.code;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                2 - Even
                1 - Greet
                0 - Exit
                Your choice: """);
        Scanner scanner = new Scanner(System.in);
        try {
            int userMenuChoice = scanner.nextInt();
            switch (userMenuChoice) {
                case 1:
                    Cli.greetUser();
                    break;
                case 2:
                    Game.runGameEven();
                    break;
                case 0:
                    Cli.byeUser();
                    break;
                default:
                    Cli.printUnexistingCommandMessage();
            }
        } catch (InputMismatchException e) {
            Cli.printUnexistingCommandMessage();
        }



    }
}
