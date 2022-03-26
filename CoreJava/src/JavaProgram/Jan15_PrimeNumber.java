package JavaProgram;

public class Jan15_PrimeNumber {

	public static void main(String[] args) {
		
		//Prime Number: Number divisible by 1 and itself 
		
		int num=7; 
		int start=2;
		while(start<num) {
			if (num%start==0)  //shows the remainder 
			{ 
				System.out.println("This is not a Prime number");
				break;
			}
			start++; //will increment till the num itself and loop will kp on executing
		}
		if(start==num) 
		{
			System.out.println("This is a Prime number");	
		}
	
		// Prog for prime number but a bigger one
		int num1=57757577; 
		int start1=2;
		while(start1<(num1/2)) {
			if (num1%start1==0)  //shows the remainder 
			{ 
				System.out.println("This is not a Prime number");
				break;
			}
			start1++; //will increment till the num itself and loop will kp on executing
		}
		if(start1==(num1/2)) 
		{
			System.out.println("This is a Prime number");	
		}
		
	}

}
