package net.antra.dayfour;

import java.util.Scanner;

public class TestExceptionHandling3 {
	public static void main(String[] args) {
		TestExceptionHandling3 test3 = new TestExceptionHandling3();
		test3.methodDemo();
	}

	private void methodDemo() {
		try(Scanner scanner = new Scanner(System.in)){
			while(true){
				String str = scanner.next();
				try {
					checkInput(str);
				} catch (InputInvalidException e) {
					System.out.println("Input is invalid number : " + e.getSomeVariable());
					continue;
				}
				System.out.println("Input is : " + str);
			}
		}
	}

	private void checkInput(String str) throws InputInvalidException {
		try{
			double d = Double.parseDouble(str);
			if(d < 10 || d > 100){
				InputInvalidException e = new InputInvalidException();
				e.setSomeVariable(""+d);
				throw e;
			}
		}catch(Exception e){
			InputInvalidException e1 = new InputInvalidException();
			e1.setSomeVariable(str);
			throw e1;
		}
	}
}
