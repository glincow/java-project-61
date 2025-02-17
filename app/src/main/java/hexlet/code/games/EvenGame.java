package hexlet.code.games;

public class EvenGame implements Game {

    public static final String DESCRIPTION  = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public String[] generateQuestionAndAnswer() {
        int number = (int) (Math.random() * 100 + 1);
        String answer = number % 2 == 0 ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
