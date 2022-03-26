package JavaProgram;

public class Jan07_Constructors {
	int roll_no;
	// Default constructor
	//It does not have any parameter
	// By default it is available
	Jan07_Constructors(){
		this.roll_no = 1;
	}
	
	Jan07_Constructors(int a){
		this.roll_no = 2;
	}
	

	public static void main(String[] args) {
		Jan07_Constructors first=new Jan07_Constructors();
		System.out.println(first.roll_no);
		
		Jan07_Constructors second=new Jan07_Constructors(22);
		System.out.println(second.roll_no);

	}

}
