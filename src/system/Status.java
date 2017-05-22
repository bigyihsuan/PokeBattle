package system;

import field.Creature;

public abstract class Status extends Util{
	private String name;
	private int id;
	
	public Status(int id) {
		id = this.id;
		
		switch (id) {
		case 0:
			name = "Burn";
			break;
		case 1:
			name = "Freeze";
			break;
		case 2:
			name = "Paralysis";
			break;
		case 3:
			name = "Poison";
			break;
		case 4:
			name = "Sleep";
			break;
		}
	}

	public String getName() { return name; }
	public int getID() { return id; }
	
	public abstract void doEffect(Creature target);
	
}
