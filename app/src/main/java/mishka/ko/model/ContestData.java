package mishka.ko.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mishka.ko.model.contestround.ContestRound;
import mishka.ko.model.contestround.TimeContestRound;

public class    ContestData implements Serializable {
    private ContestType type;
    private int contestId;
    private List<ContestRound> rounds;
    private ContestDataChangeListener contestDataChangeListener;

    public ContestData(ContestType type) {
        this.type = type;
        rounds = new ArrayList<>();
    }

    public ContestType getType() {
        return type;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
        contestDataChangeListener.onContestIdSet(contestId);
    }

    public int getContestId() {
        return contestId;
    }

    public void addRound(ContestRound round) {
        rounds.add(round);
        contestDataChangeListener.onCurrentCompetitorNumberChanged(round.getCompetitorNumber());
    }

    public void setContestDataChangeListener(ContestDataChangeListener listener) {
        this.contestDataChangeListener = listener;
    }

    public ContestRound getCurrentRound() {
        return rounds.get(rounds.size() - 1);
    }

    public ContestRound getRoundInstance(int competitorNumber) {
        switch (type){
            case TIME:
                return new TimeContestRound(competitorNumber);
        }
        return null;
    }


    public enum ContestType {
        TIME_AND_POINTS, TIME, RESULT, DO_OR_NOT, MOOSE_RACES;
    }
}
