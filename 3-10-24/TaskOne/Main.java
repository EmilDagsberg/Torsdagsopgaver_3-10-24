// 1.a
class Main {

	public static void main(String[] args) {
		// 1.g
		Team team1 = new Team("Jesus Disciple");
		// 1.k
		Team team2 = new Team("De Utrolige");
		Team team3 = new Team("Gutterne");
		Team team4 = new Team("Jespers Disciple");
		Team team5 = new Team("Det Fantastiske Hold B");
		Team team6 = new Team("Tess og Jesper");

		// 1.i
		team1.setRank(5);

		// 1.l
		team1.addPlayer("Johannes");
		team2.addPlayer("Hr. Utrolig");
		team3.addPlayer("Emil");
		team4.addPlayer("Jesper");
		team5.addPlayer("Alle");
		team6.addPlayer("Tess og Jesper");


		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);



	}
}