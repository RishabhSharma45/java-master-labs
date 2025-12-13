package tractor_rental_service;

public class Farmer {
	
	private String Name;
	private Tractor tractor;
	
	
	public Farmer(String name, Tractor tractor) {
		super();
		Name = name;
		this.tractor = tractor;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public Tractor getTractor() {
		return tractor;
	}



	public void setTractor(Tractor tractor) {
		this.tractor = tractor;
	}



	public boolean requestTractor() {
		
		System.out.println("request is made to access tractor of - " + getName());
		return true;
	}

}
