package moves;

import system.*;
import java.util.*;

public class PhysicalMove extends Move {
	
	//physical = 0
	public PhysicalMove(int i, String n, int p, float a) {
		super(i, n, p, a, 0);
	}
	public PhysicalMove(int i, String n, int p, float a, int sid) {
		super(i, n, p, a, 0, sid);
	}

}

class PhysMoveList {
	public static Map<Integer, PhysicalMove> phys = new HashMap<Integer, PhysicalMove>();
	//Integer = id
	//PM = the move itself
	public PhysMoveList() {
		phys.put(0, new PhysicalMove(0, "Tackle", 40, 1));
	}
}