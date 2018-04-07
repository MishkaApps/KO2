package mishka.ko.view;

import android.view.View;

public interface TimeContestWorkView extends ContestQueueElementView {
    int getTimeInSeconds();
    void setChronometerView(View chronometer);
}
