package mishka.ko.view;


import mishka.ko.model.ContestData;

public interface ContestTypeSelectView extends MVPView {
    interface ContestTypeViewListener{
        void onContestSelected(ContestData.ContestType contestType);
    }
    void setListener(ContestTypeViewListener listener);
}
