package oop;

public class Main {

	public static void main(String[] args) {
		

		cars c1 = new cars();
		cars c2 = new cars();
		

		System.out.println(c1.make);
		System.out.println(c1.model);
		
		System.out.println(c2.make);
		System.out.println(c2.model);

		c1.drive();
		c1.brake();

	}

}
