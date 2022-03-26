package JavaProgram;

public class Jan18_NestedClass {

	private int a;
	int b;
	
	class Example1 {
		//Example 1 is nested1 in Jan18_NestedClass
		//It is independently available
		int member;
		private void disp() {
			System.out.println(this.member);
		}
	}
	public static void main(String[] args) {
		Jan18_NestedClass.Example1 outer=new Jan18_NestedClass.Example1();
		outer.disp();

	}

}
