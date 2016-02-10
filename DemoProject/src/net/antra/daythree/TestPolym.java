package net.antra.daythree;

public class TestPolym {
	public static void main(String[] args) {
		Creature aCreature = new Frog();
		CanSwim aCreatureCanSwim = new Frog();
		CanSwim bCreatureCanSwim = new Fish();
		CanSwim humanCanSwim = new Human();
		Pool p = new Pool();
		p.swimInside(aCreatureCanSwim);
		p.swimInside(bCreatureCanSwim);
		p.swimInside(humanCanSwim);
		
		Creature creatureTobeKilled = (Creature)aCreatureCanSwim;
		CreatureKiller.kill(creatureTobeKilled);
	}
	
	
}
