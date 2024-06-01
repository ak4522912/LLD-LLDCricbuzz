package Players;

public class Player {
private Person person;
private PlayerType playerType;
private BattingScoreCard battingScoreCard;
private BowlingScoreCard bowlingScoreCard;

    public Player(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
    }
}
