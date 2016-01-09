import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class busted {
	public static void main(String[] args) {
		new busted().run();
	}

	void run() {
		ArrayList<String> bustedGhosts = new ArrayList<String>();
		HashMap<String, String> ghosts = new HashMap<String, String>();
		addGhosts(ghosts);
		String job = JOptionPane
				.showInputDialog("All the ghosts with a specific occupation must be busted! Enter the occupation now!");
		busting(bustedGhosts, ghosts, job);
	}

	private void busting(ArrayList<String> bustedGhosts,
			HashMap<String, String> ghosts, String job) {
		for (String name : ghosts.keySet()) {
			if (ghosts.get(name).equalsIgnoreCase(job)) {
				bustedGhosts.add("" + name);
			}
		}
		for (int i = 0; i < bustedGhosts.size(); i++) {
			JOptionPane.showMessageDialog(null, bustedGhosts.get(i)
					+ " is busted!");
		}
	}

	private void addGhosts(HashMap<String, String> ghosts) {
		ghosts.put("Billy Bob Joe", "Hillbilly");
		ghosts.put("Robertil", "Doctor");
		ghosts.put("Harem", "Baker");
		ghosts.put("Ellie", "Elephant");
		ghosts.put("Mario", "Plumber");
		ghosts.put("Colin", "Doctor");
		ghosts.put("Sharon", "Doctor");
		ghosts.put("Sharan", "Cheerleader");
		ghosts.put("Hallie", "Lawyer");
		ghosts.put("Barack", "President");
		ghosts.put("Lance", "Lawyer");
		ghosts.put("Adoo", "Clown");
		ghosts.put("*Anonymous*", "CIA Agent");
		ghosts.put("Mister", "Valet");
		ghosts.put("James", "Butler");
		ghosts.put("Anita", "TV Show Writer");
		ghosts.put("Danyell", "Baker");
		ghosts.put("Shuri", "Kung Fu Fighter");
		ghosts.put("Alie", "Elephant");
		ghosts.put("Dave \"Bozo\"", "Clown");
		ghosts.put("Conan", "TV Show Writer");
		ghosts.put("Elisa", "Butler");
		ghosts.put("A", "CIA Agent");
		ghosts.put("Morch", "Cheerleader");
		ghosts.put("Presidentia", "Clown");
		ghosts.put("Li", "Kung Fu Fighter");
		ghosts.put("Bobby Joey Bob", "Hillbilly");
		ghosts.put("Mitch", "Kung Fu Fighter");
		ghosts.put("Laurel", "Valet");
		ghosts.put("George", "President");
		ghosts.put("Carol", "Day Care Person");
		ghosts.put("Chandler", "Day Care Person");
		ghosts.put("Fred", "Video Game Guy");
		ghosts.put("Satashi", "Video Game Guy");
		ghosts.put("Luigi", "Plumber");
		ghosts.put("G", "Spy");
		ghosts.put("James", "Spy");
		ghosts.put("Htimskcalb", "Blacksmith");
		ghosts.put("Man", "Blacksmith");
	}
}
