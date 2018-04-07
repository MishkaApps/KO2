package mishka.ko.model;

import mishka.ko.controller.ContestController;
import mishka.ko.model.contestqueue.ContestQueue;
import mishka.ko.model.contestqueue.TimeContestQueue;
import mishka.ko.model.contestqueue.element.ContestQueueElement;

public class Contest implements ContestDataChangeListener {
    private ContestData contestData;
    private ContestQueue contestQueue;
    private ContestController controller;
    private ContestQueueElement currentElement;

    public Contest(ContestData contestData, ContestController controller) {
        this.contestData = contestData;
        contestData.setContestDataChangeListener(this);
        switch(contestData.getType()){
            case TIME:
                contestQueue = new TimeContestQueue(contestData);
        }
        this.controller = controller;
        controller.addAndHideAllElements(contestQueue.getElements());
        showFirstElement();
    }

    private void showFirstElement() {
        showNextElement();
    }

    public void showNextElement() {
        currentElement = contestQueue.next();
        controller.setNextElement(currentElement);
    }

    public void onNextClick() {
        currentElement.saveData();
        showNextElement();
    }

    @Override
    public void onContestIdSet(int id) {
        controller.displayContestId(contestData.getContestId());
    }

    @Override
    public void onCurrentCompetitorNumberChanged(int number) {
        controller.displayCurrentCompetitorNumber(number);
    }

    @Override
    public void onTotalRoundNumberChanged(int number) {

    }
}
