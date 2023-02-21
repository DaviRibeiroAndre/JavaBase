package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// resizable array
		
		ArrayList <String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hot dog");
		food.add("hamburguer");
		
		food.set(0,"suchi");
		food.remove(2);
		food.clear();
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
			
		
		
	}

}
