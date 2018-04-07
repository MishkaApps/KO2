package mishka.ko.controller;

import android.view.LayoutInflater;

import mishka.ko.model.contestqueue.element.TimeAndPointsContestElement;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.implementation.SimpleTimeAndPointsView;

public class TimeAndPointsContestController extends DoOrNotElementController {
    @Override
    protected ContestQueueElementView getConcreteView(LayoutInflater inflater) {
        SimpleTimeAndPointsView timeAndPointsView = new SimpleTimeAndPointsView(this, inflater);
        TimeAndPointsContestElement model = (TimeAndPointsContestElement)super.model;
        model.createPointsInput(inflater);
        model.createChronometer(inflater);
        timeAndPointsView.initializeWorkViewElements();
        return timeAndPointsView;
    }
}
