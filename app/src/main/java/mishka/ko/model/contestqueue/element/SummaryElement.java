package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.SummaryController;
import mishka.ko.controller.SummaryTimeContestController;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestround.ContestRound;

public abstract class SummaryElement extends ContestQueueElement {
    public SummaryElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    public void saveData() {
        contestData.getContestId();
    }

    @Override
    public void prepare() {
        ((SummaryController)controller).displaySummary();
    }

    public ContestRound getCurrentRound(){
        return contestData.getCurrentRound();
    }

    @Override
    public ContestQueueElementController getController() {
        return super.getController();
    }
}
