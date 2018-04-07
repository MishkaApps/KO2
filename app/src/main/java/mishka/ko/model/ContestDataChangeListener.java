package mishka.ko.model;

interface ContestDataChangeListener {
    void onContestIdSet(int id);
    void onCurrentCompetitorNumberChanged(int number);
    void onTotalRoundNumberChanged(int number);
}
