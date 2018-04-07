package mishka.ko.model.contestqueue.element;

import mishka.ko.controller.CompetitorNumberElementController;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestround.ContestRound;

public class CompetitorNumberElement extends ContestQueueElement {

    public CompetitorNumberElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return new CompetitorNumberElementController();
    }

    @Override
    public void saveData() {
        int competitorNumber = ((CompetitorNumberElementController)controller).getCompetitorNumber();
        ContestRound round = contestData.getRoundInstance(competitorNumber);
        contestData.addRound(round);
    }

    @Override
    public void prepare() {

    }
}
