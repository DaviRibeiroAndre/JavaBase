package statickword;

public class Friend {

	String name;
	
	static int nof; // with out static, it's dont work
	
	Friend(String name){
		this.name=name;
		nof++;}
	
	static void df() {
		
		System.out.println("you have "+nof+"friendos");
		
		
	}
	
	

}
