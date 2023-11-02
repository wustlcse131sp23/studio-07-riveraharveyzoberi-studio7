package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private boolean rightHanded;
    private boolean canShootEitherWay;
    private int goals;
    private int assists;
    private int gamesPlayed;

    public HockeyPlayer(String name, int jerseyNumber, boolean rightHanded, boolean canShootEitherWay) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.rightHanded = rightHanded;
        this.canShootEitherWay = canShootEitherWay;
        this.goals = 0;
        this.assists = 0;
        this.gamesPlayed = 0;
    }

    public void completeGame(int goals, int assists) {
        this.goals += goals;
        this.assists += assists;
        this.gamesPlayed++;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPoints() {
        return goals + assists;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    @Override
    public String toString() {
        String handedness = rightHanded ? "Right-Handed" : "Left-Handed";
        if (canShootEitherWay) {
            handedness += " (Can Shoot Either Way)";
        }
        return "Name: " + name + ", Jersey Number: " + jerseyNumber + ", Handedness: " + handedness +
               ", Goals: " + goals + ", Assists: " + assists + ", Points: " + getPoints() +
               ", Games Played: " + gamesPlayed;
    }

    public static void main(String[] args) {
        HockeyPlayer player1 = new HockeyPlayer("John Doe", 10, true, false);
        HockeyPlayer player2 = new HockeyPlayer("Jane Smith", 20, false, true);

        player1.completeGame(2, 1);
        player2.completeGame(1, 3);

        System.out.println(player1);
        System.out.println(player2);
    }
}
