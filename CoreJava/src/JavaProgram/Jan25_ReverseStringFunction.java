package JavaProgram;

public class Jan25_ReverseStringFunction {

	public static void main(String[] args) {
		String first="GoodDay";
		
		ReverseString obj = new ReverseString();
		String second = obj.doReverse(first);
		System.out.println();
		
	}
	
	String doReverse(String first)();
	int len = first.length();
	char ch;
	String reverse = "";
	for(int i= len-1;i>=0,i--) 
	{
		ch = first,charAt(i);
		reverse = reverse+ch;
		
	}
		return reverse;
	}

}
