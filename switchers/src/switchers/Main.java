package switchers;

public class Main {

	public static void main(String[] args) {
		
		String day = "Tuesday";//case is sensitive
		switch(day) {
		case "Sunday": System.out.println("today is Sunday");
		break;
		case "Monday": System.out.println("today is Monday");
		break;
		case "Tuesday": System.out.println("today is Tuesday");
		break;
		case "Wednesday": System.out.println("today is Wednesday");
		break;
		case "Thursday": System.out.println("today is Thursday");
		break;
		case "Friday": System.out.println("today is Friday");
		break;
		case "Saturday": System.out.println("today is Saturday");
		break;
		default: System.out.println("not a day");
		}
	}

}
