package status;

import field.Creature;
import system.*;

//block move
//20% chance to thaw out

public class Freeze extends Status{
	
	public Freeze() {
		super(1);
	}

	@Override
	public void doEffect(Creature target) {
		target.setCanMove(false);;
		if (Math.random() < 0.2) {
			target.setHasStatus(false);;
			target.setStatusObj(null);
		}
	}
	
}
