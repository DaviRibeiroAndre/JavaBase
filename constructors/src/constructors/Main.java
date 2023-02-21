package constructors;

public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("some",65,70);
		Human human2 = new Human("one",16,50);
		
		System.out.println("Hi "+human1.name+human2.name);
			
		human1.drink();
		human2.eat();

	}

}
