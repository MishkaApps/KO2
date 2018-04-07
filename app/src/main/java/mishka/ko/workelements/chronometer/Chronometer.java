package mishka.ko.workelements.chronometer;

import android.view.View;

import mishka.ko.controller.MVPController;

public interface Chronometer {
    int getElapsedSeconds();
    MVPController getController();
}
