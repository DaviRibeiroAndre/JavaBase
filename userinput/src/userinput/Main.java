package userinput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what's your name?");
		String name = scanner.nextLine(); // the data type is very importan
		System.out.println("hi "+name);
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		System.out.println("so, you have "+age);
		
	}

}
