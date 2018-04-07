package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.SummaryTimeContestController;
import mishka.ko.model.ContestData;

public class SummaryTimeContestElement extends SummaryElement {
    public SummaryTimeContestElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return new SummaryTimeContestController();
    }
}
