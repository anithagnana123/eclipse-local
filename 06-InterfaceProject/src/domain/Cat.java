package domain;

public class Cat extends Animal implements Pet{
	
	private String name;

	public Cat(String n) {
		super(4);
		name = n;
		
	}

	public Cat() {
		this("");
		
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
	  name = n;	
	}

	@Override
	public void play() {
		System.out.println(name + " likes to play");
		
	}

	@Override
	public void eat() {
		System.out.println(name + "likes to eat spider and mice");
		
	}

}
