package net.antra.dayfour;

import java.io.IOException;

public class TestExceptionHandling2 {
	public static void main(String[] args) {
		TestExceptionHandling2 test = new TestExceptionHandling2();
		try {
			test.methodDemo(2);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void methodDemo(int i) throws NullPointerException, IOException, ArrayIndexOutOfBoundsException{
		switch(i){
		case 1:
			throw new NullPointerException();
		case 2:
			throw new IOException();
		case 3:
			throw new ArrayIndexOutOfBoundsException();
		default:
			throw new RuntimeException();
		}
	}
}
