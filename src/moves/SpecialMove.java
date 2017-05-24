package moves;

import system.*;
import java.util.*;

public class SpecialMove extends Move {
	
	//special = 1
	public SpecialMove(int i, String n, int p, float a) {
		super(i, n, p, a, 1);
	}
	public SpecialMove(int i, String n, int p, float a, int sid) {
		super(i, n, p, a, 1, sid);
	}

}

class SpecMoveList {
	public static Map<Integer, SpecialMove> spec = new HashMap<Integer, SpecialMove>();
	//Integer = id
	//PM = the move itself
	
	public SpecMoveList() {
		spec.put(3, new SpecialMove(3, "Powder Snow", 40, 1, 1));
	}
}