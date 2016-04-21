package net.antra.daythree;

public class Fish extends Creature implements CanSwim{

	@Override
	public void swim() {
		System.out.println("Fish swim..");
	}
	
}
