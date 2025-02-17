package hexlet.code.games;

import hexlet.code.Cli;

public class PrimeGame implements Game {

    public static final String DESCRIPTION  = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public String[] generateQuestionAndAnswer() {
        int number = Cli.getRandomInt(2, 100);

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

    public String getDescription() {
        return DESCRIPTION;
    }
}
