package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameUtils;

public final class ProgressionGame {
    public static final int MAX_ROUNDS_COUNT = 3;
    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_START = 1;
    private static final int MAX_PROGRESSION_START = 10;
    private static final int MIN_PROGRESSION_BASE = 1;
    private static final int MAX_PROGRESSION_BASE = 10;

    public static void run() {
        String[][] questionsAndAnswers = new String[MAX_ROUNDS_COUNT][2];
        for (int i = 0; i < MAX_ROUNDS_COUNT; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int progressionLength = GameUtils.getRandomInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int progressionStart = GameUtils.getRandomInt(MIN_PROGRESSION_START, MAX_PROGRESSION_START);
        int progressionBase = GameUtils.getRandomInt(MIN_PROGRESSION_BASE, MAX_PROGRESSION_BASE);
        int progressionHiddenIndex = GameUtils.getRandomInt(0, progressionLength - 1);

        String question = getProgression(progressionLength, progressionHiddenIndex, progressionStart, progressionBase);
        int answer = progressionStart + progressionHiddenIndex * progressionBase;

        return new String[]{question, String.valueOf(answer)};
    }

    private static String getProgression(int progressionLength, int progressionHiddenIndex, int progressionStart, int progressionBase) {
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progressionLength; i++) {
            if (i == progressionHiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progressionStart + progressionBase * i).append(" ");
            }
        }
        return question.toString().trim();
    }
}
