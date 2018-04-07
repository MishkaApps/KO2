package mishka.ko.model.contestqueue;

import mishka.ko.model.ContestData;
import mishka.ko.model.contestqueue.element.CompetitorNumberElement;
import mishka.ko.model.contestqueue.element.DoOrNotElement;
import mishka.ko.model.contestqueue.element.SummaryElement;
import mishka.ko.model.contestqueue.element.SummaryTimeContestElement;
import mishka.ko.model.contestqueue.element.TimeContestElement;

public class TimeContestQueue extends ContestQueue {

    public TimeContestQueue(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected void addConcreteElements() {
        addElement(new CompetitorNumberElement(contestData));
        addElement(new TimeContestElement(contestData));
        addElement(new SummaryTimeContestElement(contestData));
    }
}
