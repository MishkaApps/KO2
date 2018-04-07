package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import mishka.ko.R;
import mishka.ko.controller.MVPController;
import mishka.ko.view.ContestQueueElementView;

public abstract class DoOrNotWorkView extends ViewImplementation implements ContestQueueElementView {
    private ViewGroup workElementsContainer;

    public DoOrNotWorkView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
        initializeWorkViewElements();
    }

    protected void addWorkViews(List<View> view){
    }

    @Override
    protected void initialize() {
        workElementsContainer = view.findViewById(R.id.work_elements_container);
    }

    public abstract void initializeWorkViewElements();

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_do_or_not_controller;
    }
}
