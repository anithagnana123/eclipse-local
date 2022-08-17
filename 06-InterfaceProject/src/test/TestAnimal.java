package test;

import domain.Animal;
import domain.Cat;
import domain.Fish;
import domain.Pet;
import domain.Spider;

public class TestAnimal {

	public static void main(String[] args) {
		
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		
	//	Animal a  = new Animal(); compile error , because Animal is an abstract class
		Animal f1 = new Fish();
		Animal c1 = new Cat("Kitty");
		Animal s1 = new Spider();
		
		Pet p = new Cat("SAM");
		
		p.play();
		c.play();
		f.play();
		
		f1.eat();
		c1.eat();
		s1.eat();
		
		f1.walk();
		c1.walk();
		
	}
}
