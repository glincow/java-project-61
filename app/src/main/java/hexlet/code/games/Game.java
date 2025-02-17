package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public interface Game {
    static final int MAX_ROUNDS_COUNT = 3;

    String[] generateQuestionAndAnswer();

    String getDescription();
}
