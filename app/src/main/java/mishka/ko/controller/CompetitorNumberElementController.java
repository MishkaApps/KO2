package mishka.ko.controller;

import android.view.LayoutInflater;

import mishka.ko.view.CompetitorNumberView;
import mishka.ko.view.ContestQueueElementView;
import mishka.ko.view.implementation.CompetitorNumberViewImplementation;

public class CompetitorNumberElementController extends ContestQueueElementController {

    @Override
    protected ContestQueueElementView getConcreteView(LayoutInflater inflater) {
        return new CompetitorNumberViewImplementation(this, inflater);
    }

    public int getCompetitorNumber(){
        return ((CompetitorNumberView)view).getCompetitorNumber();
    }

}
