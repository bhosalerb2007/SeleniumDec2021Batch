package JavaProgram;

public class Assign2 {

	// Program to print a solid square
	
	public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<6;i++) // 0 1 2 3 4 5 6
		{
			for(j=0;j<6;j++) // 0 1 2 3 4 5 6 
			{
				System.out.print("*" + " ");	
			}
		System.out.println();	
		}
		System.out.println();	
		
	// Program to print a hollow square
		
		int v=6;
		for(i=1;i<=v;i++) // 0
		{
			for(j=1;j<=v;j++) 
			{
				if(i==1 || j==1 || i==v || j==v)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			 System.out.println();	
		}
		System.out.println();
		
	//Program for hollow triangle
		for(i=1;i<=v;i++) 
		{
			for(j=1;j<=i;j++) 
			{
				if(i==1 || j==1 || i==v || j==i)
					System.out.print("*"+" ");
				else
					System.out.print("  ");
			}
			 System.out.println();	
		}
		System.out.println();
		
	//Program for hollow diamond
	
		
	}

}
