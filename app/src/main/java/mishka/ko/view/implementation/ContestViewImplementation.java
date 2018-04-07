package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mishka.ko.R;
import mishka.ko.controller.ContestController;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.MVPController;
import mishka.ko.view.ContestView;

public class ContestViewImplementation extends ViewImplementation implements ContestView {
    private Button next;
    private TextView contestId, currentCompetitorNumber;

    public ContestViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }



    @Override
    protected void initialize() {
        next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ContestController)controller).onNextClick();
            }
        });

        contestId = view.findViewById(R.id.contest_id);
        currentCompetitorNumber = view.findViewById(R.id.current_competitor_id);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_contest_controller;
    }

    @Override
    public int getContestElementContainerId() {
        return R.id.contest_queue_element;
    }

    @Override
    public void setContestId(int id) {
        contestId.setText(String.valueOf(id));
    }

    @Override
    public void setCompetitorNumber(int number) {
        currentCompetitorNumber.setText(String.valueOf(number));
    }
}
