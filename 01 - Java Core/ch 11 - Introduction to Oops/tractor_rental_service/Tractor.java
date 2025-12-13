package tractor_rental_service;

import java.time.LocalTime;

public class Tractor extends Vehicle {
	
   private String Name;
   private int hp;
   private float fuel;
   
	public float getFuel() {
	return fuel;
}
public void setFuel(float fuel) {
	this.fuel = fuel;
}
	public String getName() {
	return Name;
    }
public void setName(String name) {
	Name = name;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}


	public LocalTime start() {
		System.out.println("Tractor starting");
		LocalTime t1 = LocalTime.now();
        System.out.println("started at - " + t1);
		return t1;
	}
	
	public LocalTime stop() {
		System.out.println("Tractor Stopping");
		LocalTime t1 = LocalTime.now();
        System.out.println("stops at - " + t1);
		return t1;	
	}
	
	public float checkFuel() {
		return getFuel();
	}
	
	@Override
	public float milage() {
		int hplocal = getHp();
		if(hplocal<=20) {
			return (float) 1.2;
		}
		else if(hplocal<=30 && hplocal>20) {
			return (float) 1.5;
		}
		else if(hplocal<=40 && hplocal>30) {
			return (float) 2.0;
		}
		else if(hplocal<=50 && hplocal>40) {
			return (float) 2.5;
		}
		else if(hplocal<=60 && hplocal>50) {
			return (float) 3.0;
		}
		return (float)3.5;
		
	}
	public Tractor(String name, int hp, float fuel) {
		super();
		Name = name;
		this.hp = hp;
		this.fuel = fuel;
	}

}
