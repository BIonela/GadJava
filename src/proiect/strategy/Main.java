package proiect.strategy;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Small Target Click Score: ");
        scoreBoard.scoreBrain = new SmallTarget();
        scoreBoard.showScore(10);

        System.out.print("Medium Target Click Score: ");
        scoreBoard.scoreBrain = new MediumTarget();
        scoreBoard.showScore(10);

        System.out.print("Large Target Click Score: ");
        scoreBoard.scoreBrain = new LargeTarget();
        scoreBoard.showScore(10);
    }
}
