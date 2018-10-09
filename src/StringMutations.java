
public class StringMutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String one = "The best things in life are free!";
String two = one.replace("free", "costly");
String three = two.concat(" So you better save now.");
String four = one.substring(0,one.length()-5)+"free!";
String five = four.toUpperCase();


System.out.println(one);
System.out.println(two);
System.out.println(three);
System.out.println(four);
System.out.println(five);

System.out.println();

if(one.equalsIgnoreCase(five)) {
	System.out.println("Yep, Strings one and five are the same");
	
}
/*
for(int column=0;column<=5;column++) {
	for (int row= 0; row<=column;row++) {
		System.out.print("*boob*");
		
	}
	System.out.println();
	
}
*/
	}

}
