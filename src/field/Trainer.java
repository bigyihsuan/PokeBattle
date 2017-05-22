package field;

public class Trainer {
	
	private Creature[] creatureList = new Creature[6];
	
	public Trainer(Creature[] cl) {
		for (int i = 0; i < creatureList.length; i++) {
			creatureList[i] = cl[i];
		}
	}
}
