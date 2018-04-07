package mishka.ko.controller;

import android.view.LayoutInflater;

import mishka.ko.model.contestqueue.element.SummaryElement;
import mishka.ko.model.contestround.ContestRound;
import mishka.ko.model.contestround.TimeContestRound;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.implementation.SummaryTimeContestViewImplementation;
import mishka.ko.view.implementation.SummaryViewImplementation;

public class SummaryTimeContestController extends SummaryController {

    @Override
    protected SummaryViewImplementation getConcreteSummaryView(LayoutInflater inflater) {
        return new SummaryTimeContestViewImplementation(this, inflater);
    }

    @Override
    public void displaySummary() {
        SummaryTimeContestViewImplementation view = (SummaryTimeContestViewImplementation) super.view;
        TimeContestRound currentRound = (TimeContestRound) ((SummaryElement)model).getCurrentRound();
        view.setCompetitorTime(currentRound.getTime());
    }
}
