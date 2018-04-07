package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.widget.TextView;

import mishka.ko.R;
import mishka.ko.controller.MVPController;

public class SummaryTimeContestViewImplementation extends SummaryViewImplementation {
    private TextView time;
    public SummaryTimeContestViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {
        time = view.findViewById(R.id.time);
    }

    public void setCompetitorTime(int time) {
        this.time.setText(String.valueOf(time));
    }
}
