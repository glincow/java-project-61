package hexlet.code.games;

import hexlet.code.Cli;

public final class EvenGame implements Game {

    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    @Override
    public String[] generateQuestionAndAnswer() {
        int number = Cli.getRandomInt(1, MAX_NUMBER);
        String answer = number % 2 == 0 ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}