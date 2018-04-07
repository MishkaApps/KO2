package mishka.ko.workelements.chronometer;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;

import mishka.ko.R;
import mishka.ko.controller.MVPController;
import mishka.ko.view.implementation.ViewImplementation;
import mishka.ko.workelements.WorkElementView;


public class SimpleChronometerView extends WorkElementView implements ChronometerView {
    private Button reset, startStop;
    private android.widget.Chronometer chronometer;

    public SimpleChronometerView(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {
        reset = view.findViewById(R.id.reset);
        startStop = view.findViewById(R.id.start_stop);
        chronometer = view.findViewById(R.id.chronometer);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ChronometerController)controller).onResetClick();
            }
        });
        startStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ChronometerController)controller).onStartStopClick();
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.chronometer_view;
    }

    @Override
    public void setChronometerBase(long base) {
        chronometer.setBase(base);
    }

    @Override
    public void start() {
        chronometer.start();
    }

    @Override
    public void stop() {
        chronometer.stop();
    }

    @Override
    public long getChronometerBase() {
        return chronometer.getBase();
    }

}
