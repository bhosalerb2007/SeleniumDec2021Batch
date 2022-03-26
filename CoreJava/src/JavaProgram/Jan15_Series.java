package JavaProgram;

public class Jan15_Series {

	public static void main(String[] args) {
		//a=1 b=1
		//Series 1 1 2 3 5 8 		
		//Lets print series upto 15 numbers
		int a=1, b=1, count=13; //count set to 13 as a and b don't need to be printed
		System.out.println(a+" "+b); 
		
		while(count>0) {
			int temp=a; //Copy the number in temp
			a=b;
			b=temp+a;
			System.out.print(" " +b);
			count--;
					
		}
	}

}
