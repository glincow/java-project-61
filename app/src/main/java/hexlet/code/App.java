package hexlet.code;


import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
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
                case 1:
                    Cli.greetUser();
                    break;
                case 2:
                    Engine.runGame(new EvenGame());
                    break;
                case 3:
                    Engine.runGame(new CalcGame());
                    break;
                case 4:
                    Engine.runGame(new GCDGame());
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
