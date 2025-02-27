package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void byeUser() {
        System.out.println("Goodbye!");
    }

    public static void printUnexistingCommandMessage() {
        System.out.println("This command is not supported...");
    }
}
