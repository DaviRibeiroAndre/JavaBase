package overloadedconstru;

public class Main {

	public static void main(String[] args) {
		
Pizza pizza = new Pizza("thicc crust","tomato","mozzerella");//if there's more items, the constructor change
		
		System.out.println("pizza ingredients: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
