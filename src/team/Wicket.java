package team;

import enums.WicketType;

public class Wicket {
private WicketType wicketType;
private Player takenBy;
private Over over;
private Ball ball;

    public Wicket(WicketType wicketType, Player takenBy, Over over,Ball ball) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.over = over;
        this.ball = ball;
    }
}
