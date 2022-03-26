package JavaProgram;

public class Swapping {

	public static void main(String[] args) {
		
		int a=100, b=200;
		System.out.println("a= " +a+ " b="+b);
		
		/*//Program for swapping using third variable
		int temp = a; //copied value of a
		a=b; // copied value of b
		b=temp; //copied value of temp
		System.out.println("After swapping: a= " +a+ " b="+b);
		*/
		
		//Program for swapping without using third variables
		a=a+b; // 100+200=300
		b=a-b; // 300-200=100  //first swapped
		a=a-b; // 300-100=200  //second swapped
		System.out.println("a= " +a+ " b= "+b);
	}

}
