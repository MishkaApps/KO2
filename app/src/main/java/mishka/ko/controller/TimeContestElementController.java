package mishka.ko.controller;

import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.model.contestqueue.element.TimeContestElement;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.TimeContestWorkView;
import mishka.ko.view.implementation.SimpleTimeContestView;

public class TimeContestElementController extends DoOrNotElementController {
    @Override
    protected ContestQueueElementView getConcreteView(LayoutInflater inflater) {
        TimeContestWorkView timeContestView = new SimpleTimeContestView(this, inflater);
        TimeContestElement model = (TimeContestElement) super.model;
        model.createChronometer(inflater);
        timeContestView.setChronometerView(model.getChronometer().getController().getView());
        return timeContestView;
    }
}
