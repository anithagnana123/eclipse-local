package domain;

public class Fish extends Animal implements Pet{
	
	private String name;

	public Fish() {
		super(0);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		this.name = n;
		
	}

	@Override
	public void play() {
		System.out.println("Fish swims in the tank all day");
	}

	@Override
	public void eat() {
		System.out.println("Fish likes to eat pond scum");
		
	}
	
	public void walk () {
		super.walk();
		System.out.println("Fish can't walk, they can only swim in water");
		
	}

}
