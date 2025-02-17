package hexlet.code.games;

public class EvenGame implements Game {

    public static final String DESCRIPTION  = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public String[] generateQuestionAndAnswer() {
        String[] result = new String[2];
        int number = (int) (Math.random() * 100 + 1);
        String answer = number % 2 == 0 ? "yes" : "no";

        result[0] = String.valueOf(number);
        result[1] = answer;

        return result;
    }

    public String getDescription() {
        return DESCRIPTION;
    }
}
