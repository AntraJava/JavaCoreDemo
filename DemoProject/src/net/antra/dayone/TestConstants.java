package net.antra.dayone;

public class TestConstants {
//	final int i;
//	static int j;
//	final static int PI;
	public static void main(String[] args) {
		TestConstants tc = new TestConstants();
		//tc.i = 2;
		//tc.j = 1;
		tc.castDemo();
	}
	
	public void castDemo(){
		int i = 1;
		double j = i;
		int k = (int)j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		int l = (int)(k/j);
		System.out.println(l);
		System.out.println(1/0f);
		//System.out.println(0/0f);
		//System.out.println(0/0);
	}
}
