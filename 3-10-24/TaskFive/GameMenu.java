import java.util.ArrayList;
import java.util.Scanner;
// 4.a
class GameMenu {
	// 4.b
	private ArrayList<String> actions = new ArrayList<String>();

	// 4.c
	GameMenu(ArrayList<String> actions) {
		// 4.d
		this.actions = actions;
	}

	// 4.h
	public void display() {
		for(int e = 0; e < actions.size(); e++) {
			System.out.println(actions.get(e));
		}
	}

	// 5.a
	public String getAction() {
		System.out.println("Type a number to choose an action");
		this.display();
		// 5.b
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		// 5.c
		return choice;

	}


}