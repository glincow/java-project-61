package hexlet.code.games;

import hexlet.code.Cli;

public final class PrimeGame implements Game {

    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    @Override
    public String[] generateQuestionAndAnswer() {
        int number = Cli.getRandomInt(2, MAX_NUMBER);

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        String answer = isPrime ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}