package net.antra.dayone;

public class TestString {
	public static void main(String[] args) {
		TestString ts = new TestString();
		ts.stringDemo();
	}
	public void stringDemo(){
		String str = "JavaEE";
		System.out.println(str);
		System.out.println(str + " Training"+" Class" + 1);
		System.out.println(str + " Training"+" Class" + 1 + 1);
		System.out.println(str + " Training"+" Class" + (1 + 1));
		
		String numericStr = "abc";
//		String numericStr = "1.6E3";
		try{
//			int aInt = Integer.parseInt(numericStr);
//			System.out.println(aInt);
			double aDouble = Double.parseDouble(numericStr);
			System.out.println(aDouble);
		}catch(Exception e){
			System.out.println("fail");
		}
	}
}
