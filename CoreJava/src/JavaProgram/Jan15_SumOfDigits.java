package JavaProgram;

public class Jan15_SumOfDigits {

	public static void main(String[] args) {
		
		// for num 12345 print 1+2+3+4+5
		
		int num=12345;
		int sum=0; 			//initialise to 0
		int remainder;		
		while(num>0) 
		{
			remainder=num%10; 	// gives the remainder 5 
			sum=sum+remainder; 	// added to sum  5
			num=num/10; 		// 1234/10
		}
		System.out.println(sum);
		
		/*
		 * num		remainder		sum				new num
		 * 12345=>		5			5				1234
		 * 1234 =>		4			5+4=9				123
		 * 123  =>		3			5+4+3=12			12
		 * 12   =>		2			5+4+3+2=14			1
		 * 1    =>		1			5+4+3+2+1=15		0
		 */
		
		//To print the reverse of the num
		
		int num1=12345;
		int sum1=0; 			//initialise to 0
		int remainder1;		
		while(num1>0) 
		{
			remainder1=num1%10; 	// gives the remainder 5 
			sum1=sum1*10+remainder1; 	// added to sum  5
			num1=num1/10; 		// 1234/10
		}
		System.out.println(sum1);
		
		
	}
	

}


