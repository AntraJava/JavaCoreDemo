package net.antra.daytwo;

public class TestString {
	public static void main(String[] args) {
		TestString ts = new TestString();
		ts.stringDemo();
	}
	public void stringDemo(){
		String str = "JavaEE";
		String str2 = "JavaEE";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		String str3 = new String("JavaEE");
		System.out.println(str == str3);
		System.out.println(str.equals(str3));
	}
}
