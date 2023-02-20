package loops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (name.isBlank()) {
			System.out.println("your name: ");
			name = scanner.nextLine();
		}
		System.out.println("hi "+name);
		
		// same thing:
		/*
		 * do{System.out.println("your name: ");
			name = scanner.nextLine();
			}
			while (name.isBlank())
		
		*/

	}

}
