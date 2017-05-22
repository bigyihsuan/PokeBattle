package system;

import status.*;

public abstract class Move {
	 private int power;
	 private float accuracy;
	 private Status status;
	 private String name;
	 
	 public Move(int p, float a, String n) { //no status
		 power = p;
		 accuracy = a;
		 name = n;
	 }
	 
	 public Move(int p, float a, String n, int id) { //with status
		 power = p;
		 accuracy = a;
		 name = n;
		 
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
	 }
	 
}
