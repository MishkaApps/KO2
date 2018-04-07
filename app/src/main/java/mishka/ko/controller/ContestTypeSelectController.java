package mishka.ko.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mishka.ko.model.Contest;
import mishka.ko.model.ContestData;
import mishka.ko.model.ContestTypeSelect;
import mishka.ko.view.ContestTypeSelectView;
import mishka.ko.view.implementation.ContestTypeViewImplementation;

public class ContestTypeSelectController extends AppCompatActivity implements ContestTypeSelectView.ContestTypeViewListener, MVPController{
    private ContestTypeSelectView view;
    private ContestTypeSelect model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = new ContestTypeSelect();
        view = new ContestTypeViewImplementation(this, getLayoutInflater());
        view.setListener(this);
        setContentView(view.getView());
        onContestSelected(ContestData.ContestType.TIME);
    }

    @Override
    public void onContestSelected(ContestData.ContestType contestType) {
        model.onTypeSelected(contestType, this);
    }

    @Override
    public View getView() {
        return view.getView();
    }
}
