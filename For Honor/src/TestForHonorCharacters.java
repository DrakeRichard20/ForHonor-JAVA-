
public class TestForHonorCharacters {

	public static void main(String[] args) {
		
		// Damage and stats for Warden
		ForHonorCharacters Warden = new ForHonorCharacters();
		Warden.setHealth(130);
		Warden.setStamina(120);
		Warden.setTopHeavy(40);
		Warden.setSideHeavy(30);
		Warden.setUnblockableHeavy(40);
		Warden.setDodgeHeavy(20);
		Warden.setTopLight(15);
		Warden.setSideLight(12);
		Warden.setZone(20);
		Warden.setBash();
		
		ForHonorCharacters Conqueror = new ForHonorCharacters();
		Conqueror.setHealth(140);
		Conqueror.setStamina(120);
		Conqueror.setTopHeavy(33);
		Conqueror.setSideHeavy(30);
		Conqueror.setUnblockableHeavy(44);
		Conqueror.setTopLight(13);
		Conqueror.setSideLight(13);
		Conqueror.setZone(10);
		Conqueror.setBash();
		
		System.out.print("Does Conqueror's top heavy do more damage than wardens? "+  (Conqueror.getTopHeavy()>Warden.getTopHeavy()));

		
		
		
		
	}

}
