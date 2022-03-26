package JavaProgram;

public class Assign3 {

	// Program for Half Pyram
	public static void main(String[] args) {
		int v=5;
		for(int i=1;i<=v;i++) 
		{
			for(int j=1;j<=v;j++) 
			{
				System.out.print(j+" ");
			}
			 System.out.println();	
		}
		System.out.println();
	
	// Program for hollow square
		for(int i=1;i<=v;i++) 
		{
			for(int j=1;j<=v;j++) 
			{
				if(i==1 || j==1 || i==v || j==v)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			 System.out.println();	
		}
		System.out.println();
		
	// Program for hollow triangle
		for(int i=1;i<=v;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if(i==1 || j==1 || i==v || j==i)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			 System.out.println();	
		}
		System.out.println();
	}
	
}
