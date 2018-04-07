package mishka.ko.model.contestround;

public abstract class ContestRound {
    private int competitorNumber;

    public ContestRound(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    public int getCompetitorNumber() {
        return competitorNumber;
    }
}
