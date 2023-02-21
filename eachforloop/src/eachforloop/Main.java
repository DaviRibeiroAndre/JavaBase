package eachforloop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
				//a loop for interact with arrays. less steps, more readable, less flexible
				
		
				ArrayList<String> animals = new ArrayList<String>();
				
				animals.add("cat");
				animals.add("dog");
				animals.add("rat");
				animals.add("bird");
				
				for(String i : animals) {
					System.out.println(i);
				}

	}

}
