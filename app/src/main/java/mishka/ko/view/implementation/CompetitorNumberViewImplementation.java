package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import mishka.ko.R;
import mishka.ko.controller.CompetitorNumberElementController;
import mishka.ko.controller.MVPController;
import mishka.ko.view.CompetitorNumberView;

public class CompetitorNumberViewImplementation extends ViewImplementation implements CompetitorNumberView {
    private EditText competitorNumber;

    public CompetitorNumberViewImplementation(MVPController controller, LayoutInflater inflater) {
        super(controller, inflater);
    }

    @Override
    protected void initialize() {
        competitorNumber = view.findViewById(R.id.competitor_number);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_competitor_number_controller;
    }

    @Override
    public int getCompetitorNumber() {
        return Integer.parseInt(competitorNumber.getText().toString());
    }
}
