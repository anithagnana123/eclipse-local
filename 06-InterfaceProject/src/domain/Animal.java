package domain;

public abstract class Animal {
	
	//instance variables
	protected int legs;
	
	//constructor
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	//abstract methods
	public abstract void eat();
	
	//concrete method
	public void walk() {
		System.out.println("The animal walks on "+legs+ " legs");
	}

	

}
