package mishka.ko.view.implementation;

import android.view.LayoutInflater;
import android.view.View;

import mishka.ko.view.MVPView;
import mishka.ko.controller.MVPController;


abstract public class ViewImplementation implements MVPView {
    protected View view;
    protected MVPController controller;

    public ViewImplementation(MVPController controller, LayoutInflater inflater) {
        view = inflater.inflate(getLayoutResource(), null, false);
        this.controller = controller;
        initialize();
    }


    protected abstract void initialize();

    abstract protected int getLayoutResource();

    @Override
    public View getView() {
        return view;
    }
}
