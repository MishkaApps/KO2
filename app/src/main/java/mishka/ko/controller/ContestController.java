package mishka.ko.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import mishka.ko.model.Contest;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestqueue.element.ContestQueueElement;
import mishka.ko.view.ContestView;
import mishka.ko.view.implementation.ContestViewImplementation;

public class ContestController extends AppCompatActivity implements MVPController {
    private ContestView view;
    private Contest model;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new ContestViewImplementation(this, getLayoutInflater());
        setContentView(view.getView());
        fragmentManager = getSupportFragmentManager();
        model = new Contest((ContestData) getIntent().getSerializableExtra("contest_type"), this);
    }

    public void setNextElement(ContestQueueElement nextElement) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hidePreviousElement(fragmentTransaction);
        
        nextElement.prepare();
        fragmentTransaction.show(nextElement.getController());
        fragmentTransaction.commit();
    }

    public void hidePreviousElement(FragmentTransaction fragmentTransaction) {
        for (Fragment element : fragmentManager.getFragments())
            if (element.isVisible())
                fragmentTransaction.hide(element);

    }

    public void addAndHideAllElements(List<ContestQueueElement> elements) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (final ContestQueueElement element : elements) {
            fragmentTransaction.add(view.getContestElementContainerId(), element.getController());
            fragmentTransaction.hide(element.getController());
        }
        fragmentTransaction.commit();
    }



    public void onNextClick() {
        model.onNextClick();
    }

    public void displayContestId(int id) {
        view.setContestId(id);
    }

    public void displayCurrentCompetitorNumber(int number) {
        view.setCompetitorNumber(number);
    }

    @Override
    public View getView() {
        return view.getView();
    }
}
