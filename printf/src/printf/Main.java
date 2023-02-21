package printf;

public class Main {

	public static void main(String[] args) {
		

	
				
		boolean Boo = true;
		char C = '@';
		String str = "Da";
		int n1 = 50;
		double d1 = 4.0;
		
		System.out.printf("some %d text",21);
			
	
		System.out.printf("this is %b",Boo);/*
		System.out.printf("this is %s",C);
		System.out.printf("this is %s",str);
		System.out.printf("this is%d",n1);
		System.out.printf("this is%f",d1);
		*/
		
	
		System.out.printf("Hello %10s",str);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		//System.out.printf("You have this much money %,f",myDouble);

	}

}
