package net.antra.daytwo;

public class TestCommandLine {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Need at least three parameters to execute!");
			return;
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}
