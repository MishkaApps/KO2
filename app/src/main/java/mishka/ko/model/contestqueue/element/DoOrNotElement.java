package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.DoOrNotElementController;
import mishka.ko.model.ContestData;

public abstract class DoOrNotElement extends ContestQueueElement {
    public DoOrNotElement(ContestData contestData) {
        super(contestData);
    }
}
