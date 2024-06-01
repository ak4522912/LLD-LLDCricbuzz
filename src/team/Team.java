package team;

public class Team {
    private String teamName;
    private Queue<PlayerDetails> playing11;

    private List<PlayerDetails> bench;

    public Team(String teamName, Queue<PlayerDetails> playing11, List<PlayerDetails> bench) {
        this.teamName = teamName;
        this.playing11 = playing11;
        this.bench = bench;
    }


}
