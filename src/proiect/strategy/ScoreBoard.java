package proiect.strategy;

public class ScoreBoard {
    public ScoreBrain scoreBrain;

    public void showScore(int clicks) {
        System.out.println(scoreBrain.calculateScore(clicks));
    }
}
