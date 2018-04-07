package mishka.ko.view.implementation;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import mishka.ko.R;
import mishka.ko.controller.MVPController;
import mishka.ko.view.TimeContestWorkView;


//public class TimeContestWorkViewImplementation extends DoOrNotWorkView implements TimeContestWorkView {
//    private View workView;
//    private Button reset, startStop;
//    private Chronometer chronometer;
//    private boolean isChronometerRunning, isChronometerPaused;
//    private long chronometerPausedAt;
//
//    public TimeContestWorkViewImplementation(MVPController controller, LayoutInflater inflater) {
//        super(controller, inflater);
//    }
//
//    @Override
//    protected void setConcreteController(MVPController controller) {
//
//    }
//
//    @Override
//    protected View getWorkView(LayoutInflater inflater) {
//        workView = inflater.inflate(R.layout.chronometer_view, null, false);
//        return workView;
//    }
//
//    @Override
//    public void initializeWorkViewElements() {
//        reset = workView.findViewById(R.id.reset);
//        startStop = workView.findViewById(R.id.start_stop);
//        chronometer = workView.findViewById(R.id.chronometer);
//        isChronometerRunning = false;
//        isChronometerPaused = false;
//
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onResetClick();
//            }
//        });
//        startStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onStartStopClick();
//            }
//        });
//    }
//
//    private void onStartStopClick() {
//        if (isChronometerRunning)
//            stopChronometer();
//        else startChronometer();
//    }
//
//    private void startChronometer() {
//        if (isChronometerPaused)
//            chronometer.setBase(SystemClock.elapsedRealtime() - chronometerPausedAt);
//        else chronometer.setBase(SystemClock.elapsedRealtime());
//
//        chronometer.start();
//        isChronometerRunning = true;
//        isChronometerPaused = false;
//    }
//
//    private void stopChronometer() {
//        chronometerPausedAt = SystemClock.elapsedRealtime() - chronometer.getBase();
//        chronometer.stop();
//        isChronometerPaused = true;
//        isChronometerRunning = false;
//    }
//
//
//    private void onResetClick() {
//        chronometer.stop();
//        chronometer.setBase(SystemClock.elapsedRealtime());
//        isChronometerPaused = false;
//        isChronometerRunning = false;
//    }
//
//    @Override
//    public int getTimeInSeconds() {
//        return 0;
//    }
//
//    @Override
//    public void setChronometerView(View chronometer) {
//
//    }
//}
