package JavaProgram;

public class Jan27_StringReverseSentence {

	public static void main(String[] args) {
		String str = "Hello, how are you?";
		 int start=0, end=0;
		  
		 for(int i=start;i<=str.length();i++) //for whole sentence 
		 { 
			 end = str.indexOf(' ' ,i+1); //find location of spacebar in line
			 for(int j=end-1;j>=start;j--) // working on one word at a time
			 {
				 System.out.print(str.charAt(j));
				 
			 }
			 start=end+1;
			 System.out.println(" ");
		 }
		 
		 

	}

}
