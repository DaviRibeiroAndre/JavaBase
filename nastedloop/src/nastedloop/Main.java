package nastedloop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int colums;
		String symbol ="";
		System.out.println("rows: ");
		rows = scanner.nextInt();
		System.out.println("collums: ");
		colums = scanner.nextInt();
		System.out.println("symbol: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			 for(int j =1; j<=colums;j++) {
				System.out.println(symbol);
			}
		}

	}

}
