package net.antra.daytwo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestCreateObject {
	static String fileName="/Users/daweizhuang/Desktop/apple.data";
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
		//new keyword
		Apple apple1 = new Apple();
		Apple a2 = new Apple();
//		apple1.color = "pink";
//		System.out.println("Apple #1 "+ apple1.color);
//		//Class.forName
//		Apple apple2 = (Apple)Class.forName("net.antra.daytwo.Apple").newInstance();
//		apple2.color = "red";
//		System.out.println("Apple #2 "+ apple2.color);
//		//Clone
//		Apple apple3 = (Apple)apple2.clone();
//		System.out.println("Apple #3 "+ apple3.color);
//		//Serialization
//		TestCreateObject tco = new TestCreateObject();
//		tco.writeAppleToFile(apple2);
//		Apple apple4 = tco.readAppleFromFile(fileName);
//		System.out.println("Apple #4 "+ apple4.color);
	}
	

	public void writeAppleToFile(Apple apple) throws IOException{
		try(OutputStream os = new FileOutputStream(fileName);
				ObjectOutputStream objectOut = new ObjectOutputStream(os);){
			objectOut.writeObject(apple);
		};
	}

	private Apple readAppleFromFile(String fileName) throws IOException, ClassNotFoundException {
		try(InputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fileInputStream);){
			return (Apple)ois.readObject();
		}
	}
}
