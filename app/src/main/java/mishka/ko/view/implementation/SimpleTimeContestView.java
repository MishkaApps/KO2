package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.controller.MVPController;
import mishka.ko.view.TimeContestWorkView;


public class SimpleTimeContestView extends DoOrNotWorkView implements TimeContestWorkView {

    public SimpleTimeContestView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }


    @Override
    public int getTimeInSeconds() {
        return 0;
    }

    @Override
    public void setChronometerView(View chronometer) {
        addWorkViews(chronometer);
    }

    @Override
    public void initializeWorkViewElements() {

    }
}
