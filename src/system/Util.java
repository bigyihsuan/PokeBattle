package system;

public abstract class Util {
	public int doDamage(int hp, float damage) {
		return hp - (int)damage;
	}
	
	/* Returns stat changed.
	 * Stat change multiplier is based on stage amount.
	 * This is called when a move or ability changes a stat.
	 */
	public int changeStat(int stat, int stage) {
		int num = 2; int den = 2;
		
		if (stage > 0) {
			num += stage;
		} else if (stage < 0) {
			den += stage;
		}
		
		return stat * (num / den);
	}
	
	
}
