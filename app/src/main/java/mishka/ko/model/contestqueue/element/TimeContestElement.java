package mishka.ko.model.contestqueue.element;

import android.view.LayoutInflater;

import mishka.ko.workelements.chronometer.Chronometer;
import mishka.ko.workelements.chronometer.SimpleChronometer;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.TimeContestElementController;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestround.TimeContestRound;


public class TimeContestElement extends DoOrNotElement {
    private Chronometer chronometer;

    public TimeContestElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return new TimeContestElementController();
    }

    @Override
    public void saveData() {
        TimeContestRound timeContestRound = (TimeContestRound) contestData.getCurrentRound();
        timeContestRound.setTimeInSeconds(chronometer.getElapsedSeconds());
    }

    @Override
    public void prepare() {

    }

    public Chronometer getChronometer() {
        return chronometer;
    }

    public void createChronometer(LayoutInflater inflater) {
        chronometer = new SimpleChronometer();
        ((SimpleChronometer) chronometer).createController(inflater);

    }
}
