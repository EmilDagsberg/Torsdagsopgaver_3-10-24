import java.util.ArrayList;
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


}