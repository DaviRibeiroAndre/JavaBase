package arraylist;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 2d arraylist, a list of list
		
		ArrayList<ArrayList<String>> Listt = new ArrayList();
		
		ArrayList<String> bList = new ArrayList();
		bList.add("pasta");
		bList.add("garlic bread");
		bList.add("donuts");
		
		ArrayList<String> pList = new ArrayList();
		pList.add("tomatoes");
		pList.add("zucchini");
		pList.add("peppers");
		
		ArrayList<String> dList = new ArrayList();
		dList.add("soda");
		dList.add("coffee");
		
		Listt.add(bList);
		Listt.add(pList);
		Listt.add(dList);
		
		// System.out.println(Listt);
		
		System.out.println(Listt.get(0).get(1));//a specific term
		
		
			
		
		
	}

}
