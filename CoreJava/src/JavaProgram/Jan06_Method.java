package JavaProgram;

public class Jan06_Method {
	int a=10, b=20;
	public static void main(String[] args) {
		Jan06_Method obj1=new Jan06_Method();
		obj1.printData();
		obj1.add(10,20);
		int e = obj1.sub(20,30);
		System.out.println("Subtraction is "+e);
		obj1.div(25,5);
		//System.out.println("Division is " +d1);
		int f = obj1.mul(12,4);
		System.out.println("Multiplication is " +f);
		}
	
	//return-type Name(parameters){
	//		body (1 or more statements)
	//		return return_type_value
	//}
	//return type may be void , any premitive data type or other

	void printData() {		// without parameter
		System.out.println("Simple void method without parameter");
		System.out.println(a);
		}
	
	void add(int x,int z) {		//
		System.out.println("Addition is " +(x+z));
	} 
	
	int sub(int x,int z) {		// with return
		int c = x-z;
		//System.out.println("Subtraction is " +c);
		return c; // returns (x-z)
	}
	
	void div(int x,int y) {
		int d = x/y;
		int m = x%y;
		System.out.println("Normal Division is " +d);
		System.out.println("Modulus Division is " +m);
	}
	
	int mul(int x,int y) {
		int p = x*y;
		return p;
	}

}
