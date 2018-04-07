package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import mishka.ko.R;
import mishka.ko.controller.ContestQueueElementController;
import mishka.ko.controller.ContestTypeSelectController;
import mishka.ko.controller.MVPController;
import mishka.ko.model.Contest;
import mishka.ko.model.ContestData;
import mishka.ko.view.ContestTypeSelectView;

public class ContestTypeViewImplementation extends ViewImplementation implements ContestTypeSelectView {
    private ContestTypeViewListener listener;

    public ContestTypeViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {
        Button timeContest = view.findViewById(R.id.time);
        timeContest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notifyListener();
            }
        });
    }

    private void notifyListener() {
        listener.onContestSelected(ContestData.ContestType.TIME);
    }

    @Override
    public void setListener(ContestTypeViewListener listener) {
        this.listener = listener;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_contest_type;
    }


}
