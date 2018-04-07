package mishka.ko.workelements;

import android.view.LayoutInflater;

import mishka.ko.controller.MVPController;
import mishka.ko.view.implementation.ViewImplementation;

public abstract class WorkElementView extends ViewImplementation {
    public WorkElementView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }
}
