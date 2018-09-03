import java.util.*;

public class StringArrays {

	// two different loops through a string array

	private static String[] first = { "you", "we", "I" };

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
	}

}
