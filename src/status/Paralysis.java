package status;

import field.Creature;
import system.*;

//25% chance to block move
//1/2 speed

public class Paralysis extends Status{
	
	public Paralysis() {
		super(2);
	}

	@Override
	public void doEffect(Creature target) {
		target.setHasStatus(true);
		target.setCanMove(true);			//reset the ability to move each turn
		target.setSpd(target.getSpd()/2);	//halve speed
		if (Math.random() < 0.25) {
			target.setCanMove(false);		//25% chance to do a move
		}
	}
	
}
