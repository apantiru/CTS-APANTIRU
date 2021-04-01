package ro.ase.csie.cts.g1093.dp.builder;

import ro.ase.csie.cts.g1093.dp.prototype.SuperPowerInterface;
import ro.ase.csie.cts.g1093.dp.prototype.WeaponInterface;


public class SuperHero {
	
	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	WeaponInterface  rightWeapon;
	WeaponInterface  leftWeapon;

	SuperPowerInterface superPower;
	SuperPowerInterface superSuperPower;
	public SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, WeaponInterface rightWeapon,
			WeaponInterface leftWeapon, SuperPowerInterface superPower, SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	
	
	

}
