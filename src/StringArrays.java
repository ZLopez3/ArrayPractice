import java.util.*;

public class StringArrays {

	// two different loops through a string array

	private static String[] first = { "you", "we", "I" };

	private static String[] second = { "have seen it", "have heard it", "have felt it" };
	
	public static int add(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Type your name");
		 String l = scan.nextLine();
		 
		for (String s : first) {

			System.out.println("The world as " + (s) + " know it, according to "+ (l) );

		}
		for (int i = 0; i < first.length; i++) {
			System.out.println("what's next for " + first[i] + " ?");
		}
		for(String t: second) {
			System.out.println("The world as " + (t)+".");
			System.out.println("This is a basic output change");
		} 
		
		System.out.println(add(21,45));
		scan.close();
	}

}
