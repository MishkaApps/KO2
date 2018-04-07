package mishka.ko.view.implementation;

import android.view.LayoutInflater;

import mishka.ko.R;
import mishka.ko.controller.MVPController;
import mishka.ko.controller.SummaryController;
import mishka.ko.view.SummaryView;


public abstract class SummaryViewImplementation extends ViewImplementation implements SummaryView {
    public SummaryViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_summary_controller;
    }
}
