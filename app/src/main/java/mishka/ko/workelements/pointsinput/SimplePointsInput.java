package mishka.ko.workelements.pointsinput;

import android.view.LayoutInflater;

import mishka.ko.workelements.WorkElement;

public class SimplePointsInput extends WorkElement implements PointsInput {
    public void createController(LayoutInflater inflater) {
        controller = new PointsInputController(this, inflater);
    }
}
