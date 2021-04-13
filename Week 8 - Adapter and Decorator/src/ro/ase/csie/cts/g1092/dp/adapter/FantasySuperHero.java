package ro.ase.csie.cts.g1092.dp.adapter;

public class FantasySuperHero extends SuperHeroCharacter{
	
	boolean canFly;
	
	public FantasySuperHero(String name, int power, boolean canFly) {
		super(name, power);
		this.canFly = canFly;
	}



	@Override
	public void move() {
		if(this.canFly) {
			System.out.println("Is Flying");
		}
		else
		{
			System.out.println("Is moving fast");
		}
		
	}

	@Override
	public void crouch() {
		if(this.canFly) {
			System.out.println("Not able ti crouch");
		}
		else
		{
			System.out.println("Is getting close to the ground");
		}
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(String.format("%s took a hit of %d points", name, points));
		this.power -= points;
		
	}

	@Override
	public void heal(int points) {
		System.out.println(String.format("%s is healling %d points", name, points));
		this.power += points;
		
	}

}
