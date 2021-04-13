package ro.ase.csie.cts.g1092.dp.adapter.disney;



public class DonaldDuck implements DisneyActions{

	String name;
	int lifePoints;
	
	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Is moving to a new location");
		
	}
	

	public DonaldDuck(int lifePoints) {
		super();
		this.name = "Donald Duck";
		this.lifePoints = lifePoints;
	}


	@Override
	public void isWounded(int lostLifePoints) {
		System.out.println(String.format("%s lost %d points",name, lostLifePoints));
		
	}

	@Override
	public void isHealing(int recoverredPoints) {
		System.out.println(String.format("%s recovered %d points",name, recoverredPoints));
		
	}


	@Override
	public String getName() {
		
		return this.name;
	}


	@Override
	public int getPower() {
		return this.lifePoints;
	}

}