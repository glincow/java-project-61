package hexlet.code.games;

import hexlet.code.Cli;

public final class ProgressionGame implements Game {

    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_START = 1;
    private static final int MAX_PROGRESSION_START = 10;
    private static final int MIN_PROGRESSION_BASE = 1;
    private static final int MAX_PROGRESSION_BASE = 10;

    @Override
    public String[] generateQuestionAndAnswer() {
        int progressionLength = Cli.getRandomInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int progressionStart = Cli.getRandomInt(MIN_PROGRESSION_START, MAX_PROGRESSION_START);
        int progressionBase = Cli.getRandomInt(MIN_PROGRESSION_BASE, MAX_PROGRESSION_BASE);
        int progressionHiddenIndex = Cli.getRandomInt(0, progressionLength - 1);

        StringBuilder question = new StringBuilder();
        int answer = progressionStart + progressionHiddenIndex * progressionBase;

        for (int i = 0; i < progressionLength; i++) {
            if (i == progressionHiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progressionStart + progressionBase * i).append(" ");
            }
        }

        return new String[]{question.toString().trim(), String.valueOf(answer)};
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
