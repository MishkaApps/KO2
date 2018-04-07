package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.ContestIdElementController;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.model.ContestData;

public class ContestIdElement extends ContestQueueElement {


    public ContestIdElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return new ContestIdElementController();
    }

    @Override
    public void saveData() {
        int id = ((ContestIdElementController)controller).getContestId();
        contestData.setContestId(id);
    }

    @Override
    public void prepare() {

    }
}
