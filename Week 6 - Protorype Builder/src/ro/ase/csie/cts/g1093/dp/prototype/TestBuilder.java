package ro.ase.csie.cts.g1093.dp.prototype;

import ro.ase.csie.cts.g1093.dp.builder.SuperHero;
import ro.ase.csie.cts.g1093.dp.builder.Weapon;

public class TestBuilder {

	public static void main(String[] args) {
		//1. create the object
		SuperHero superHero = new SuperHero(null, 0, false, false, null, null, null, null);
		//2.init it
		//TO DO: dont' forget
		
		SuperHero superHero2 = 
				new SuperHero("Superman", 100, false, false, new Weapon(), null, new Flying(), null);
	}

}
