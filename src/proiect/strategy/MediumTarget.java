package proiect.strategy;

public class MediumTarget extends ScoreBrain {
    @Override
    public int calculateScore(int clicks) {
        return (clicks * 5) - 20;
    }
}
