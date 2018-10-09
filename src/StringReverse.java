import java.util.Scanner;

public class StringReverse {

	
	
	
	public static void reverse() {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string you want reversed: ");
		String input = scan.nextLine();
		
		System.out.print("Your string reversed is: ");
		for(int i = input.length()-1; i>=0; i-- ) {
		     
			char reverse = input.charAt(i);	
			 System.out.print(reverse);
		}
	}

	public static double average(int...list) {
		double result = 0.0;
		
		if(list.length !=0) {
			int sum = 0;
			for(int num : list) {
				sum+=num;
				result = (double)sum / list.length;
				
			}
			
		}
		return result;
	}// end of average method


	
	public static void main(String[] args) {

		
		System.out.println(average(23,25));
		
		//reverse();
		
			
	}

}
