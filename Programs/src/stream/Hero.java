package stream;

public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("I can act");
	}

	@Override
	public void speak() {
		System.out.println("I can speak");
	}

	public void comedy() {
		System.out.println("I can make ppl laugh");
	}
	
	
}
