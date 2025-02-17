package hexlet.code.games;

import hexlet.code.Cli;

public class EvenGame implements Game {

    public static final String DESCRIPTION  = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public String[] generateQuestionAndAnswer() {
        int number = Cli.getRandomInt(1, 100);
        String answer = number % 2 == 0 ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
