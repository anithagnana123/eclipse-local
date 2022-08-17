package domain;

public class Spider extends Animal {

	public Spider() {
		super(8);//invoke super class Animal constructor
		
	}
	
	//define an abstract method
	public void eat() {
		System.out.println("The Spider likes to eat insects");
	}
}
