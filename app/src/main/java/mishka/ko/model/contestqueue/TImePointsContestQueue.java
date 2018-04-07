package mishka.ko.model.contestqueue;

import mishka.ko.model.ContestData;
import mishka.ko.model.contestqueue.element.CompetitorNumberElement;
import mishka.ko.model.contestqueue.element.SummaryTimeContestElement;
import mishka.ko.model.contestqueue.element.TimeAndPointsContestElement;

public class TImePointsContestQueue extends ContestQueue {
    public TImePointsContestQueue(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected void addConcreteElements() {
        addElement(new CompetitorNumberElement(contestData));
        addElement(new TimeAndPointsContestElement(contestData));
        addElement(new SummaryTimeContestElement(contestData));
    }
}
