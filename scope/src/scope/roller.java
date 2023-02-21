package scope;

import java.util.Random;

public class roller {
	 Random random;//global
	 int number;
	 
	  roller(){
	  random = new Random();
	  roll();
	 }
	 
	 void roll() {
	  number = random.nextInt(6)+1;
	  System.out.println(number);
	 }
	 
	// roller(){ local
		// Random random = new Random();
		// int number = 0;
		// roll()}
	

}
