package JavaProgram;

public class Jan03_If {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i +" Number is even");
			}
			else {
				System.out.println(i +" Number is odd");
			}
		}
		System.out.println();
		
		
        /**if(condition) {
        	Executes only if condition is true
        }
        */
		
		
		// 1:add  2:sub  3:div  4:multi
		int a = 10, b = 20;
		int choice = 0;
		
		if (choice==1) {
			System.out.println(a+b);
		}
		else if (choice==2) {
			System.out.println(b-a);
		}
		else if (choice==3) {
			System.out.println(b/a);
		}
		else {
			System.out.println(a*b);
		}
		
		
		/*if condition(){
		  execute only when condition is true
		  }
		  else if(condition){
		  }
		  else if(condition){
		  }
		  else if(condition){
		  }
		*/
		
		// nested if else
		if (choice==1) {
			System.out.println(a+b);
		}
		else {
			if (choice==2) {
				System.out.println(b-a);
			}
			else {
				if (choice==3) {
					System.out.println(b/a);
				}
				else {
					System.out.println(a*b);
				}
			}
		}
		
		}
	}


