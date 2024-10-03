import java.util.ArrayList;
// 1.b
class Team {
	//1.c
	String teamName;
	// 1.d
	int teamRank;
	// 1.e
	ArrayList<String> playerNames = new ArrayList<String>();

	// 1.f
	public Team(String teamName) {
		this.teamName = teamName;
	}

	// 1.h
	public void setRank(int n) {
		this.teamRank = n;
	}

	// 1.l
	public void addPlayer(String player) {
		playerNames.add(player);

	}

	// i.j og i.m
	public String toString() {
		String team = ("Hold: " + this.teamName + " Rang: " + this.teamRank
		+ " Hold spillere: " + this.playerNames);
		return team;
	}

}