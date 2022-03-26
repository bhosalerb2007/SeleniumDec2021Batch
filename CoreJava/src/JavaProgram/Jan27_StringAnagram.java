package JavaProgram;

public class Jan27_StringAnagram {

	public static void main(String[] args) {
		String s1 = "army", s2 = "maro";
		boolean result = true;
		
		if (s1.length() == s2.length())
		{
			for(int i=0; i<s1.length();)
			{
				char ch = s1.charAt(i);
				s1 = s2.replaceAll(ch+"","");
				s2 = s2.replaceAll(ch+"", "");
				if(s1.length() != s2.length())
				{
					System.out.println("Not Anagram");
					result = false;
					break;
				}
			}
			if(result == true)
			{
				System.out.println("Anagram");
			}
		}

	}

}
