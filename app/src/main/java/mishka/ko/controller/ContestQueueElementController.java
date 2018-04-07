package mishka.ko.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mishka.ko.model.contestqueue.ContestQueue;
import mishka.ko.model.contestqueue.element.ContestQueueElement;
import mishka.ko.view.ContestQueueElementView;

public abstract class ContestQueueElementController extends Fragment implements MVPController{
    protected ContestQueueElementView view;
    protected ContestQueueElement model;

    public ContestQueueElementController() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = getConcreteView(inflater);
        return view.getView();
    }

    protected abstract ContestQueueElementView getConcreteView(LayoutInflater inflater);

    public void setModel(ContestQueueElement model) {
        this.model = model;
    }

}
