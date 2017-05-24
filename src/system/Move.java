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
	private final int type;

	public Move(int i, String n, int p, float a, int t) { //no status
		id = i;
		power = p;
		accuracy = a;
		name = n;
		type = t;
	}

	public Move(int i, String n, int p, float a, int t, int sid) { //with status
		id = i;
		power = p;
		accuracy = a;
		name = n;
		type = t;

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

	public float getAccuracy() {
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

	public int getType() {
		return type;
	}
	
	

}
