package models.innings;


import java.util.ArrayList;

public class BallDetails {
    public BallDetails(int ballNumber, BallType ballType, RunType runType, PlayerDetails playedBy, PlayerDetails bowledBy, Wicket wicket, List<ScoreUpdaterObserver> scoreUpdaterObserverList) {
        this.ballNumber = ballNumber;
        this.ballType = ballType;
        this.runType = runType;
        this.playedBy = playedBy;
        this.bowledBy = bowledBy;
        this.wicket = wicket;
        this.scoreUpdaterObserverList = scoreUpdaterObserverList;
    }

    private int ballNumber;
    private BallType ballType;
    private RunType runType;
    private PlayerDetails playedBy;
    private PlayerDetails bowledBy;
    public Wicket wicket;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList = new ArrayList<>();
}
