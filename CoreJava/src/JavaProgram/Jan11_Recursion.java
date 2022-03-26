package JavaProgram;

public class Jan11_Recursion {

	public static void main(String[] args) {
		int num=5, out =1;
		for(int i=num;i>=1;i--) {
			out = out*i;
		}
		System.out.println("Factorial of " +num+ " is " +out);
		
		Jan11_Recursion obj1=new Jan11_Recursion();
		//out=obj.factorial(num);
		System.out.println("Factorial of "+num+ " is "+out);
	}

	//we can convert it into function
	int factorial(int i) {
		if(i==1) {
			return 1;
		}
		return i*factorial(--i);
	}
}
