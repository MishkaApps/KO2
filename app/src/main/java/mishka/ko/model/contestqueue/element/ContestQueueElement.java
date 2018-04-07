package mishka.ko.model.contestqueue.element;

import android.content.Context;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestqueue.ContestQueue;
import mishka.ko.model.contestround.ContestRound;
import mishka.ko.model.contestround.TimeContestRound;

public abstract class ContestQueueElement {
    protected ContestQueueElementController controller;
    protected ContestData contestData;

    public ContestQueueElement(ContestData contestData) {
        this.contestData = contestData;
        controller = getConcreteController();
        controller.setModel(this);
    }

    protected abstract ContestQueueElementController getConcreteController();

    public ContestQueueElementController getController(){
        return controller;
    }

    public abstract void saveData();

    public abstract void prepare();
}
