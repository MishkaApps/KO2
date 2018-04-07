package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mishka.ko.R;
import mishka.ko.controller.ContestIdElementController;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.MVPController;
import mishka.ko.view.ContestIdView;


public class ContestIdViewImplementation extends ViewImplementation implements ContestIdView {
    private EditText contestId;

    public ContestIdViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {
        contestId = view.findViewById(R.id.contest_id);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_contest_id_controller;
    }

    @Override
    public int getContestId() {
        return Integer.parseInt(contestId.getText().toString());
    }
}
