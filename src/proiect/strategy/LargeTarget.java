package proiect.strategy;

public class LargeTarget extends ScoreBrain{
    @Override
    public int calculateScore(int clicks) {
        return (clicks * 5) - 40;
    }
}
