package proiect.strategy;

public class SmallTarget extends ScoreBrain{
    @Override
    public int calculateScore(int clicks) {
        return (clicks * 5);
    }
}
