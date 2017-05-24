package system;

import status.*;
import field.Creature;
import system.Util;

public class Move extends Util {
	private final int id;
	private final int power;
	private final float accuracy;
	private Status status = null;
	private final String name;
	private boolean isAHit = false;

	public Move(int i, String n, int p, float a) { //no status
		id = i;
		power = p;
		accuracy = a;
		name = n;
	}

	public Move(int i, String n, int p, float a, int sid) { //with status
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

}
