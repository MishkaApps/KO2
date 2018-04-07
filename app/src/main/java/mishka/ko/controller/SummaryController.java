package mishka.ko.controller;

import android.view.LayoutInflater;

import mishka.ko.model.contestround.ContestRound;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.implementation.SummaryTimeContestViewImplementation;
import mishka.ko.view.implementation.SummaryViewImplementation;

public abstract class SummaryController extends ContestQueueElementController {
    @Override
    protected ContestQueueElementView getConcreteView(LayoutInflater inflater) {
        return view = getConcreteSummaryView(inflater);
    }

    protected abstract SummaryViewImplementation getConcreteSummaryView(LayoutInflater inflater);

  public abstract void displaySummary();


}
