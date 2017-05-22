package status;

import field.Creature;
import system.*;

//-1/16 * [turns had] HP per turn

public class Poison extends Status{
	
	private int turns = 1;	//initialize at 1 so that it can do 1/16 by default
	
	public Poison() {
		super(3);
	}

	@Override
	public void doEffect(Creature target) {
		int hp = target.getHp();
		doDamage(hp, 1/16 * turns * hp); //deal damage based on turns had
		turns++;	//make sure to increment turns
	}
	
}
