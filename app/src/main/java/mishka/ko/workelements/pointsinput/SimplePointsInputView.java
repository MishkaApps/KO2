package mishka.ko.workelements.pointsinput;

import android.view.LayoutInflater;

import mishka.ko.controller.MVPController;
import mishka.ko.workelements.WorkElementView;

public class SimplePointsInputView extends WorkElementView implements PointsInput{
    public SimplePointsInputView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected int getLayoutResource() {
        return 0;
    }
}
