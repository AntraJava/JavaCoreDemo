package net.antra.dayfour;

public class TestExceptionHandling {

	public static void main(String[] args) {
		TestExceptionHandling test = new TestExceptionHandling();
		try {
			test.methodDemo();
			System.out.println("If there is exception, this line won't be shown");
		} catch (Exception e) {
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
	}
	
	public void methodDemo() throws Exception{
		int i = 1;
		if(1 + i == 2){
			throw new Exception("World end");
		}
	}
}
