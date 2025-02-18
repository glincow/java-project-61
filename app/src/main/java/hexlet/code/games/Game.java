package hexlet.code.games;

public interface Game {
    int MAX_ROUNDS_COUNT = 3;

    String[] generateQuestionAndAnswer();

    String getDescription();
}
