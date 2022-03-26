package JavaProgram;

public class Jan03_Assign {

	public static void main(String[] args) {
		int i, j;
		i = 2;
	//While loop
		System.out.println("Using While loop");
		
		while (i <= 10) {
			System.out.println();
			j = 1;
			while (j<=10) {
				System.out.print(i*j +" ");			
				j++; //next value
				}
				i++; // next value
				System.out.println();
			}
				
				
	//For loop			
		System.out.println("Using For loop");
		
		for(i=2; i<=10; i++) {
			System.out.println();
			for (j=1; j<=10; j++) {
				System.out.print(i*j +" ");	
				}
			System.out.println();
			}
		
	//For loop for two variables	
		System.out.println("Using For loop");
		
		for(i=1,j=1; i<=10 && j<=10; i++,j++) {
			System.out.println(i*j);
		}
		System.out.println();
		
	// Do while loop		
		System.out.println("Using Do..while loop");
		
		i=2;
		do {
			System.out.println();
			j=1;
			do {
				System.out.print(i*j +" ");		
				j++;
			}while(j<=10);
		i++;
		   }while(i<=10);
        System.out.println();
        
    // If... else.. to find greatest of two numbers
        System.out.println("For greatest of two numbers");
        
        int a = 23;
        int b = 25;
        if(a > b) {
        	System.out.println(a +"greater than" + b);
        	}
        else {
        	System.out.println(b + "greater than" + a);
        	}
	}
}
   
	

