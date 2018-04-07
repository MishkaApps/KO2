package mishka.ko.model.contestqueue.element;

import android.view.LayoutInflater;

import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.TimeAndPointsContestController;
import mishka.ko.model.ContestData;
import mishka.ko.workelements.chronometer.Chronometer;
import mishka.ko.workelements.chronometer.SimpleChronometer;
import mishka.ko.workelements.pointsinput.PointsInput;
import mishka.ko.workelements.pointsinput.SimplePointsInput;

public class TimeAndPointsContestElement extends DoOrNotElement {
    private Chronometer chronometer;
    private PointsInput pointsInput;

    public TimeAndPointsContestElement(ContestData contestData) {
        super(contestData);
    }

    @Override
    protected ContestQueueElementController getConcreteController() {
        return new TimeAndPointsContestController();
    }

    @Override
    public void saveData() {

    }

    @Override
    public void prepare() {

    }

    public void createPointsInput(LayoutInflater inflater) {
        pointsInput = new SimplePointsInput();
        ((SimplePointsInput)pointsInput).createController(inflater);
    }

    public void createChronometer(LayoutInflater inflater) {
        chronometer = new SimpleChronometer();
        ((SimpleChronometer) chronometer).createController(inflater);
    }
}
