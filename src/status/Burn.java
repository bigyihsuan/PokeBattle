package status;

import field.Creature;
import system.*;

//-1/16 health per turn
//1/2 attack

public class Burn extends Status{
	
	public Burn() {
		super(0);
	}

	@Override
	public void doEffect(Creature target) {
		int hp = target.getHp();
		int atk = target.getAtk();
		doDamage(hp, 1/16 * hp);	//deal 1/16 hp when doEffect() called
		target.setPhysAtk(atk/2);	//halve physical attack
	}
	
}
