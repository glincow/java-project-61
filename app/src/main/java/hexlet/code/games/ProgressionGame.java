package hexlet.code.games;

import hexlet.code.Cli;

public class ProgressionGame implements Game {

    public static final String DESCRIPTION  = "What number is missing in the progression?";

    public String[] generateQuestionAndAnswer() {
        int progressionLength = Cli.getRandomInt(5, 10);
        int progressionStart = Cli.getRandomInt(1, 10);
        int progressionBase = Cli.getRandomInt(1, 10);
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

    public String getDescription() {
        return DESCRIPTION;
    }
}
