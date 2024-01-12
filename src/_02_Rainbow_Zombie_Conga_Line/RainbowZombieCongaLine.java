package _02_Rainbow_Zombie_Conga_Line;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {

	/*
	 * You are hosting a rainbow zombie conga dance party! Zombies are not very
	 * smart(maybe that's why they crave brains) and need your help to direct them
	 * through the choreography.
	 * 
	 * Each method is a dance move you will need to implement.
	 * 
	 * When you think you've gotten your zombies trained well enough you can start
	 * the party by running the main method in RainbowZombieDanceParty and typing
	 * how many rounds you want in the console to see if they followed your
	 * choreography correctly.
	 * 
	 * Note: The party will always start with a rainbow brains and every 5 rounds
	 * the head and tail of the dance line will be removed.
	 */

	private LinkedList<Zombie> congaLine;
	private ZombieHatColor[] zombieHats;
	Node<Zombie> currentZombie;

	public RainbowZombieCongaLine() {

		congaLine = new LinkedList<Zombie>();
		zombieHats = ZombieHatColor.values();

	}

	// Make the passed in zombie the first Zombie in the conga line!
	public void engine(Zombie dancer) {
		congaLine.add(dancer);
		congaLine.getTail().setNext(congaLine.getHead());
		congaLine.getHead().setPrev(congaLine.getTail());
	}

	// Make the passed in zombie the last Zombie in the conga line!
	public void caboose(Zombie dancer) {
		congaLine.add(dancer);
	}

	// Place the zombie at the designated position in the conga line!
	public void jumpInTheLine(Zombie dancer, int position) {
		currentZombie = congaLine.getHead();
		congaLine.add(dancer);
		for (int i = 0; i < position; i++) {
			currentZombie = currentZombie.getNext();
		}
		congaLine.getTail().setNext(currentZombie);
		currentZombie.setPrev(congaLine.getTail());
	}

	/*
	 * Remove all zombies with the same hat color as the passed in zombie from the
	 * conga line!
	 */
	public void everyoneOut(Zombie dancer) {
		currentZombie = congaLine.getHead();
		for (int i = 0; i < congaLine.size(); i++) {
			for (int j = 0; j < congaLine.size(); j++) {
				currentZombie = currentZombie.getNext();
				if (dancer.getZombieHatColor().equals(currentZombie.getValue().getZombieHatColor())) {
					congaLine.remove(j);
				}
			}
		}
		congaLine.add(dancer);
	}

	/*
	 * Remove the first zombie with the same hat color as the passed in zombie from
	 * the conga line!
	 */
	public void youAreDone(Zombie dancer) {
		int currentLine = congaLine.size();
		int counter = 0;
		currentZombie = congaLine.getHead();
		while (congaLine.size() == currentLine) {
			if (dancer.getZombieHatColor().equals(currentZombie.getValue().getZombieHatColor())) {
				congaLine.remove(counter);
			} else {
				counter += 1;
				currentZombie = currentZombie.getNext();
			}
		}
		congaLine.add(dancer);
	}

	/*
	 * Make two more zombies with the same hat color as the passed in zombie and add
	 * one to the front, one to the end and one in the middle.
	 */
	public void brains(Zombie dancer) {

	}

	/*
	 * Add the passed in zombie to the front and then add one zombie of each hat
	 * color to the end of the line.
	 */
	public void rainbowBrains(Zombie dancer) {
		congaLine.add(dancer);
		congaLine.getTail().setNext(congaLine.getHead());
		congaLine.getHead().setPrev(congaLine.getTail());
		//for (int i = 0; i < zombieHats.length; i++) {
		////	congaLine.add(value);
		}
	}

	public LinkedList<Zombie> getCongaLine() {
		return congaLine;
	}
}
