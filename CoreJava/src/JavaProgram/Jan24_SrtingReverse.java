package JavaProgram;

public class Jan24_SrtingReverse {

	public static void main(String[] args) {
		int i;
		char a[] = {'W','E','L','C','O','M','E'};
	
		String s1 = new String(a,0,7);
		System.out.println("String before reversing = " +s1);
		String s2="";
		
		for(i=a.length-1;i>=0;i--) {       // i=6 5 4 3 2 1 0
			 
			 s2=s2+s1.charAt(i);			// E M O C L E W s2 is added to s2 with the charAt(i) 
		}
	
		
		System.out.println("String after reversing = " +s2);
		
		
		

	}

}
