package mishka.ko.workelements.pointsinput;

import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.controller.MVPController;
import mishka.ko.workelements.WorkElement;
import mishka.ko.workelements.WorkElementController;
import mishka.ko.workelements.WorkElementView;

public class PointsInputController extends WorkElementController {

    public PointsInputController(WorkElement model, LayoutInflater inflater) {
        super(model, inflater);
    }

    @Override
    public View getView() {
        return null;
    }

    @Override
    protected WorkElementView inflateView(LayoutInflater inflater) {
        return new SimplePointsInputView(this, inflater);
    }
}
