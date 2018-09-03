
public class StringArrays {

	// two different loops through a string array

	private static String[] first = { "you", "we", "I" };

	private static String[] second = { "have seen it", "have heard it", "have felt it" };
	
	public static void main(String[] args) {

		for (String s : first) {

			System.out.println("The world as " + (s) + " know it.");

		}
		for (int i = 0; i < first.length; i++) {
			System.out.println("what's next for " + first[i] + " ?");
		}
		for(String t: second) {
			System.out.println("The world as " + (t)+".");
			System.out.println("This is a bsic output change");
		} 
	}

}
