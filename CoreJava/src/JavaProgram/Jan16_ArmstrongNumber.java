package JavaProgram;

public class Jan16_ArmstrongNumber {

	public static void main(String[] args) {
	
		//Armstrong number: sum of cube of every digit
		int num=154,num1=154;
		int sum=0,remainder;
		while(num>0) 
		{
			remainder=num%10;
			sum=sum+(remainder*remainder*remainder);
			num=num/10;
		}
		if(num1==sum) 
		{
			System.out.println(num1+ " is an Armstrong number");
		}	
			else
				System.out.println(num1+ " is not an Armstrong number");
			
	
	}

}
