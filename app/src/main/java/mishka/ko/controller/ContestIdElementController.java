package mishka.ko.controller;


import android.view.LayoutInflater;

import mishka.ko.view.ContestIdView;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.implementation.ContestIdViewImplementation;

public class ContestIdElementController extends ContestQueueElementController {
    @Override
    protected ContestQueueElementView getConcreteView(LayoutInflater inflater) {
        return new ContestIdViewImplementation(this, inflater);
    }

    public int getContestId() {
        return ((ContestIdView)view).getContestId();
    }
}
