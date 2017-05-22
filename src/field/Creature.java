package field;

import system.*;
import status.*;

public class Creature {
	private int hp;
	private int physAtk;
	private int physDef;
	private int specAtk;
	private int specDef;
	private int spd;
	private int[] moves = new int[4];
	private Status status = null;
	private boolean hasStatus = false;
	private boolean canMove = true;
	
	public Creature(int h, int a, int d, int sa, int sd, int sp, int[]ids) {
		h = hp;
		a = physAtk;
		d = physDef;
		sa = specAtk;
		sd = specDef;
		sp = spd;
		
		//move ids
		for (int i = 0; i < moves.length; i++) { ids[i] = moves[i]; }
	}

	public int getHp() {
		return hp;
	}
	
	public int getPhysAtk() {
		return physAtk;
	}
	
	public int getPhysDef() {
		return physDef;
	}
	
	public int getSpecAtk() {
		return specAtk;
	}
	
	public int getSpecDef() {
		return specDef;
	}
	
	public int getSpd() {
		return spd;
	}
	
	public int[] getMoves() {
		return moves;
	}
	
	public boolean canMove() {
		return canMove;
	}
	
	public boolean hasStatus() {
		return hasStatus;
	}
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPhysAtk(int physAtk) {
		this.physAtk = physAtk;
	}

	public void setPhysDef(int physDef) {
		this.physDef = physDef;
	}

	public void setSpecAtk(int specAtk) {
		this.specAtk = specAtk;
	}

	public void setSpecDef(int specDef) {
		this.specDef = specDef;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setMoves(int[] moves) {
		this.moves = moves;
	}
	
	public void setStatusObj(Status status) {
		setStatusID(status.getID());
	}

	public void setStatusID(int id) {
		switch (id) {
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
		hasStatus = true;
		
	}
	
	public void setCanMove(boolean a) {
		canMove = a;
	}
	
	public void setHasStatus(boolean b) {
		hasStatus = b;
	}
}
