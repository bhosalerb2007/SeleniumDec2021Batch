package JavaProgram;

public class JAN01_WhileLoop {
	public static void main(String[] args) {
		
		/* While Loop
		 * initialization
		 * while(condition){
		 * statement/statements
		 * next value statement
		 * }*/
		
		int i;
		i = 1;
		while (i <= 10) {
			System.out.println(i);			
			i++; // next value
		}System.out.println();
		
		
		/* For loop
		 * For loop (initialization; condition; next value){
		 * one or more statement
		 * }*/
		
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}System.out.println();
		
		//do-while
		//initialization
		/*do {
			one or more statements
			next value
			}while(condition);*/
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println();
		
	}
}
