package JavaProgram;

public class Jan16_PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome number is where original and reverse are same
		int num=0123210;
		int rev=0,num1=num;
		int remainder;
		while(num>0) 
		{
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		if(num1==rev)
			System.out.println(num1 +"is an Palindrome number");
		else
			System.out.println(num1 +"is not an Palindrome number");
	}

}
