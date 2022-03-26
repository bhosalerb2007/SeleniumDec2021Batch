package JavaProgram;

public class Jan25_StringRepeatedChar {

	public static void main(String[] args) {
		String inp = "Hello";
		int len=inp.length();
		System.out.println(inp.substring(len));
		
		for(int i=0; i<inp.length();i++) {
			char ch = inp.charAt(i);
			if (inp.indexOf(ch) == inp.lastIndexOf(ch)) {
				System.out.println(ch+ " is not repeated");
				}
			else { 
				System.out.println(ch+ " is repeated");
				}
			inp=inp.replaceAll(ch+"", "");
			i--;
		}
		
	}

}
