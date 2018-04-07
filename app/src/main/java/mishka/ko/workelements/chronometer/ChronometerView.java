package mishka.ko.workelements.chronometer;

import mishka.ko.view.MVPView;

public interface ChronometerView extends MVPView {

    void setChronometerBase(long l);

    void start();

    void stop();

    long getChronometerBase();
}
