package moves;

import system.*;
import java.util.*;

public class StatusMove extends Move {
	
	//status = 2
	public StatusMove(int i, String n, int p, float a) {
		super(i, n, p, a, 2);
	}
	public StatusMove(int i, String n, int p, float a, int sid) {
		super(i, n, p, a, 2, sid);
	}

}