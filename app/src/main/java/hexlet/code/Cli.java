package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Cli {
    private static String name = "";

    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public String getName() {
        return name;
    }

    public static void byeUser() {
        String byeName = name.isBlank() ? "hero" : name;
        System.out.println("Goodbye, " + byeName + "!");
    }

    public static void printUnexistingCommandMessage() {
        System.out.println("This command is not supported...");
    }

    public static int getRandomInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
