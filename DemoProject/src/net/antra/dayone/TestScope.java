package net.antra.dayone;

import javax.swing.event.AncestorEvent;

public class TestScope {
	//Class/static variable
	private static String classVar; //default to null;
	
	//instance variable
	private int instanceVar; //default to 0
	
	public void aMethod(final int i){//i is parameter, available inside the method
		int localVar;//local variable, no default value
		if(i < 0){
			String anotherLocalVar; //this one only valid inside the block{}
		}
	}
}
