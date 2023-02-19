package random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();//true random numbers don't exist, ever is a pseudo random number ;-;
		//int x = random.nextInt(6)+1;
		//double x = random.nextDouble(3);
		boolean x  = random.nextBoolean();
		
		System.out.println(x);
	}

}
