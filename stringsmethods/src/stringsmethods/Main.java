package stringsmethods;

public class Main {

	public static void main(String[] args) {
		
		
		String name ="da";
		
		/* boolean result = name.equals("da"); //case sensitive
		int result = name.length();
		char result = name.charAt(1);
		int result = name.indexOf("a");
		boolean result = name.isEmpty();
		String result = name.toLowerCase();
		String result = name.toUpperCase();
		String result = name.trim();*/
		String result = name.replace('a', 'o');
		
	
		
		System.out.println(result);

	}

}
