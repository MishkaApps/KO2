package mishka.ko.workelements;


import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.controller.MVPController;

public abstract class WorkElementController implements MVPController {
    protected WorkElement model;
    protected WorkElementView view;
    public WorkElementController(WorkElement model, LayoutInflater inflater) {
        this.model = model;
        view = inflateView(inflater);
    }

    protected abstract WorkElementView inflateView(LayoutInflater inflater);
}
