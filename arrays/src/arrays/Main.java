package arrays;

public class Main {

	public static void main(String[] args) {
		//used to store multiple values in single var
		
		String[] cars= {"camaro","Corvette","Tesla"};//be careful with data type
		
		System.out.println(cars[0]);
		
		cars[0] = "bmw";
		
		System.out.println(cars[0]);
		
		/* 
		 *  another way to make arrays
		String[] cars = new String[3];

		cars[0] = "camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		*/
		
		for(int i =0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		

	}

}
