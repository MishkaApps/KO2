package mishka.ko.workelements.chronometer;

import android.view.LayoutInflater;
import mishka.ko.controller.MVPController;
import mishka.ko.workelements.WorkElement;

public class SimpleChronometer extends WorkElement implements Chronometer {
    private int pausedAt;

    public SimpleChronometer() {
    }

    @Override
    public int getElapsedSeconds() {
        return pausedAt;
    }


    @Override
    public MVPController getController() {
        return controller;
    }

    public void createController(LayoutInflater inflater) {
        controller = new ChronometerController(this, inflater);
    }

    public void setPausedAtTime(int pausedAt) {
        this.pausedAt = pausedAt;
    }
}
