package mishka.ko.workelements.chronometer;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.controller.MVPController;
import mishka.ko.workelements.WorkElement;
import mishka.ko.workelements.WorkElementController;
import mishka.ko.workelements.WorkElementView;

public class ChronometerController extends WorkElementController {
    private boolean isChronometerRunning, isChronometerPaused;
    private int chronometerPausedAt;

    public ChronometerController(WorkElement model, LayoutInflater inflater) {
        super(model, inflater);
    }


    @Override
    public View getView() {
        return view.getView();
    }


    void onStartStopClick() {
        if (isChronometerRunning)
            stopChronometer();
        else startChronometer();
    }


    void startChronometer() {
        if (isChronometerPaused)
            ((ChronometerView)view).setChronometerBase(SystemClock.elapsedRealtime() - chronometerPausedAt);
        else ((ChronometerView)view).setChronometerBase(SystemClock.elapsedRealtime());

        ((ChronometerView)view).start();
        isChronometerRunning = true;
        isChronometerPaused = false;
    }

    void stopChronometer() {
        ((ChronometerView)view).stop();
        chronometerPausedAt = (int)(SystemClock.elapsedRealtime() - ((ChronometerView)view).getChronometerBase());
        ((ChronometerView)view).setChronometerBase(SystemClock.elapsedRealtime() - chronometerPausedAt);
        ((SimpleChronometer)model).setPausedAtTime(chronometerPausedAt/1000);
        isChronometerPaused = true;
        isChronometerRunning = false;
    }

    void onResetClick() {
        ((ChronometerView)view).stop();
        ((ChronometerView)view).setChronometerBase(SystemClock.elapsedRealtime());
        isChronometerPaused = false;
        isChronometerRunning = false;
    }

    @Override
    protected WorkElementView inflateView(LayoutInflater inflater) {
        return new SimpleChronometerView(this, inflater);
    }
}
