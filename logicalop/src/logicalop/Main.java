package logicalop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// && and
		// || or
		// ! not
		
		/* int temp = 25;
		if(temp>30) {
			System.out.println("hot");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("warm");
		}
		else {
			System.out.println("cold");
		}
		*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("press q");
		String r =scanner.next();
		if(r.equals("q")|| r.equals("Q")) {
			System.out.println("bye bye");
		}
		else {
			System.out.println("what are you doing?");
			
		}*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("press q");
		String r =scanner.next();
		if(!r.equals("q") && !r.equals("Q")) {
			System.out.println("what are you doing?");
			
		}
		else {
			System.out.println("bye bye");
			
		}
		
		

	}

}
