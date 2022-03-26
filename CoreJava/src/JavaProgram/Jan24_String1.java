package JavaProgram;

public class Jan24_String1 {

	public static void main(String[] args) {
	char ch[] = {'H','E','L','L','O'}; // array of characters is declared
	String s1=new String(ch); // array is converted into a char string
	System.out.println(s1);
	
	String s11=new String(ch,0,4); // array is converted into a char string from index 0 to 3 leaving 4
	System.out.println(s11);
	
	String s2="HOW ARE YOU?"; // String is declared
	System.out.println(s2); // prints as it is 
	
	s2 = " I AM FINE "; //Strings are immutable i.e., non-changeable
	System.out.println(s2);
	
	String s3="WelCome";
	System.out.println(s3.length()); // For arrays is a function but for strings its an attribute 
	
	String s4 =""+1+5; //Integers 1 and 5 are treated as Strings
	String s5 = 1+5+""; // addition of integers is done first
	System.out.println(s4);
	System.out.println(s5);
	
	System.out.println(s1+s2+s3); // Concatenation
	String s12 = s1.concat(s2); // Using concat function
	System.out.println(s12);
	
	System.out.println(s2.charAt(6)); // to get the character at a particular index
	char ch1[] = new char [7];
	s3.getChars(0, 4, ch1, 0); // To get the characters within a range
	System.out.println(ch1);
	
	}

}
