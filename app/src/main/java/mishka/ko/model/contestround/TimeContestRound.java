package mishka.ko.model.contestround;

public class TimeContestRound extends ContestRound {
    private int timeInSeconds;
    public TimeContestRound(int competitorNumber) {
        super(competitorNumber);
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public int getTime() {
        return timeInSeconds;
    }
}
