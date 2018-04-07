package mishka.ko.view.implementation;

import android.view.LayoutInflater;

import mishka.ko.controller.MVPController;
import mishka.ko.view.TimeAndPointsWorkView;
import mishka.ko.view.implementation.DoOrNotWorkView;
import mishka.ko.view.implementation.ViewImplementation;

public class SimpleTimeAndPointsView extends SimpleTimeContestView implements TimeAndPointsWorkView {

    public SimpleTimeAndPointsView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    public void initializeWorkViewElements() {

    }


}
