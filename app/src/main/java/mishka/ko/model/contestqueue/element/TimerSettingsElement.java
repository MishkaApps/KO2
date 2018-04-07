package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.model.ContestData;

public class TimerSettingsElement extends ContestQueueElement {
    public TimerSettingsElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return null;
    }

    @Override
    public void saveData() {

    }

    @Override
    public void prepare() {

    }
}
