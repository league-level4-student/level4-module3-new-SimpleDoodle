package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		ArrayList<String> suspects = new ArrayList<>();
		Node<TrainCar> tempHead = train.getHead();
		HashMap<String, Integer> suspicion = new HashMap<>();
		for (int i = 0; i < clues.length; i++) {
			System.out.println(clues[i]);
		}
		while (tempHead != null) {
			for (int i = 0; i < clues.length; i++) {
				if (tempHead.getValue().questionPassenger().contains(clues[i])) {
					// System.out.println(tempHead.getValue().questionPassenger());
					// suspects.add(tempHead.getValue().questionPassenger().split("Nice to meet you.
					// My name is ", 1));
					String[] impostor = tempHead.getValue().questionPassenger().split(" ");
					// System.out.println(impostor[13]);
					suspects.add(impostor[13]);
				}
			}

			// System.out.println(tempHead.getValue().questionPassenger());
			tempHead = tempHead.getNext();
		}
		// String[] suspect = new String[train.size()];
		for (int j = 0; j < suspects.size(); j++) {
			System.out.println(suspects.get(j));
			if (suspicion.containsKey(suspects.get(j))) {
				suspicion.put(suspects.get(j), suspicion.get(suspects.get(j)) + 1);
			} else {
				suspicion.put(suspects.get(j), 1);
			}
		}
		int matchingClues = 0;
		String spy = "";
		for (int i = 0; i < suspicion.size(); i++) {
			if (suspicion.get(suspicion.keySet().toArray()[i]) > matchingClues) {
				matchingClues = suspicion.get(suspicion.keySet().toArray()[i]);
				spy = suspicion.keySet().toArray()[i].toString();
			}
		}

		return spy;

	}

}
