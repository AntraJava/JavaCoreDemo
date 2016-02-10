package net.antra.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		
		Hero superman = new Hero("kal-el","male",100000);
		Hero batman = new Hero("Bruce Wayne","male",200000);
		Hero ironman = new Hero("Tony Stark","male",99999999);
		Hero skye = new Hero("Daisy Johnson","female",150000);
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(skye);
		heros.add(superman);
		heros.add(batman);
		heros.add(ironman);
		System.out.println("Original :" + heros);
		
		//using comparable interface  
		Collections.sort(heros);
		System.out.println("After Sort:" + heros);
		
		//using comparator
		//create inner class, anonymous inner class
		Collections.sort(heros,new Comparator<Hero>(){
			@Override
			public int compare(Hero o1, Hero o2) {
				return o1.getSalary() > o2.getSalary()?1:-1;
			}});
		System.out.println("After Sort by salary:" + heros);
		
		//using named comparator
		Comparator<Hero> genderNameComparator =new Comparator<Hero>(){
			@Override
			public int compare(Hero o1, Hero o2) {
				int i = o1.getGender().compareTo(o2.getGender());
				if(i == 0){
					i = o1.getName().compareToIgnoreCase(o2.getName());
				}
				return i;
			}};
			
		Collections.sort(heros, genderNameComparator);
		System.out.println("After Sort by gender and name:" + heros);
	}
}
