package models.innings;

import java.util.ArrayList;

public class InningDetails {
    Team battingTeam;
    Team bowlingTeam;
    MatchType matchtype;
    List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchtype) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchtype = matchtype;
        overs = new ArrayList<>();
    }
}
