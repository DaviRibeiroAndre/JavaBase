package arrays2d;

public class Main {

	public static void main(String[] args) {
		// 2d array= array of arrays, it1's basically a math matrix
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "camaro";
		cars[0][1] = "bmw";
		cars[0][2] = "tesla";
		cars[1][0] = "mustang";
		cars[1][1] = "ranger";
		cars[1][2] = "lambo";
		cars[2][0] = "ferrari";
		cars[2][1] = "uno";
		cars[2][2] = "corvette";
		
		for(int i=0; i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.println(cars[i][j]+" ");
				
			}
		}
		/* same thing
		 String[][] cars ={
		 {"camaro","bmw","tesla"},
		 {"mustang","ranger","lambo"},
		 {"ferrari","uno","corvette"}
		 };
		 */
		

	}

}
