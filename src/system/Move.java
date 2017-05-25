package system;

import status.*;
import field.Creature;
import system.Util;
import java.util.*;

public class Move extends Util {
	private final int id;
	private final int power;
	private final double accuracy;
	private Status status = null;
	private final String name;
	private boolean isAHit = false;

	public Move(int i, String n, int p, double a) { //no status
		id = i;
		power = p;
		accuracy = a;
		name = n;
	}

	public Move(int i, String n, int p, double a, int sid) { //with status
		id = i;
		power = p;
		accuracy = a;
		name = n;

		switch (sid) {
		case 0:
			status = new Burn();
			break;
		case 1:
			status = new Freeze();
			break;
		case 2:
			status = new Paralysis();
			break;
		case 3:
			status = new Poison();
			break;
		case 4:
			status = new Sleep();
			break;
		}
	}

	public void doMove(Creature target) {
		if (Math.random() <= accuracy) {	 //check to see if it hits
			doDamage(target.getHp(), power); //deal damage when hit
			status.doEffect(target);		 //apply effect if there is one
		}
	}

	public int getId() {
		return id;
	}

	public int getPower() {
		return power;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public Status getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public boolean isAHit() {
		return isAHit;
	}
}

class MoveList {
	public static Map<String, Move> moveList = new HashMap<String, Move>();
	public MoveList() {
		moveList.put("Tackle", new Move(0, "Tackle", 40, 1));
		moveList.put("Will-o-Wisp", new Move(1, "Will-o-Wisp", 0, 0.85, 1));
		moveList.put("Toxic", new Move(2, "Toxic", 0, 0.9, 3));
		moveList.put("Powder Snow", new Move(3, "Powder Snow", 40, 1, 2));
		
	}
}
