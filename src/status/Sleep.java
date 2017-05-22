package status;

import field.Creature;
import system.*;

//block moves for 1-3 turns

public class Sleep extends Status{
	
	private int turns = (int) Math.random() * 2 + 1; //at least 1, at most 3, so range of 2
	
	public Sleep() {
		super(4);
	}

	@Override
	public void doEffect(Creature target) {
		if (turns > 0) {
			target.setCanMove(false);	//block moves
			turns--;	//decrement turns
		} else {
			target.setCanMove(true);
		}
		
	}
	
}
