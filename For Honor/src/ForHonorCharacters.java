public class ForHonorCharacters {

	private int topHeavy = 0;
	int topLight = 0;
	int sideHeavy = 0;
	int sideLight = 0;
	int health = 0;
	int bleed = 0;
	int stamina = 0;
	int unblockableHeavy = 0;
	int zone = 0;
	boolean bash = false;
	int dodgeHeavy = 0;
	int dodgeLight = 0;
	double speed = 0;
	
	public ForHonorCharacters() {
	}
	
	public void setStamina(int newStamina) {
		if(newStamina >= 120 && newStamina <= 160)
			stamina = newStamina;
	}
	
	public void setHealth(int newHealth) {
		if(newHealth >= 110 && newHealth < 140 )
			health = newHealth;
	}
	
	public void setTopHeavy(int newTopHeavy) {
		if(newTopHeavy >= 23 && newTopHeavy <= 45)
			topHeavy = newTopHeavy;
	}
	
	public int getTopHeavy() {
		return topHeavy;
	}
	
	public void setSideHeavy(int newSideHeavy) {
		if(newSideHeavy >= 20 && newSideHeavy <= 40)
			sideHeavy = newSideHeavy;
	}
	
	public void setUnblockableHeavy(int newUnblockableHeavy) {
		if(newUnblockableHeavy >= 30 && newUnblockableHeavy <= 45)
			unblockableHeavy = newUnblockableHeavy;
	}
	public void setDodgeHeavy(int newDodgeHeavy) {
		if(newDodgeHeavy >= 14 && newDodgeHeavy <= 35)
			dodgeHeavy = newDodgeHeavy;
	}
	
	public void setTopLight(int newTopLight) {
		if(newTopLight >= 10 && newTopLight <= 22)
			topLight = newTopLight;
	}
	
	public void setSideLight(int newSideLight) {
		if(newSideLight >= 5 && newSideLight <= 20)
			sideLight = newSideLight;
	}
	
	public void setDodgeLight(int newDodgeLight) {
		if(newDodgeLight >= 14 && newDodgeLight <= 22)
			dodgeLight = newDodgeLight;
	}
	
	public void setBleed(int newBleed) {
		if(newBleed >= 8 && newBleed <= 25)
			bleed = newBleed;
	}
	
	public void setZone(int newZone) {
		if(newZone >= 5 && newZone <= 44)
			zone = newZone;
	}
	
	public void setBash() {
		bash = true;
	}
	
}