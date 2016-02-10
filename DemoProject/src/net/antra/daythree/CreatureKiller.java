package net.antra.daythree;

import java.util.Scanner;

public class CreatureKiller {
	public static void kill(Creature aCreature){
		System.out.println("a " + aCreature.getClass() + " is killed.");  
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int i = Integer.parseInt(s);
		
		if(s == null){
			System.out.println("123");
		}
	}
}
