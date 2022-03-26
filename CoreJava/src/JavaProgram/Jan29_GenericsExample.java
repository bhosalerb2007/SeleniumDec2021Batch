package JavaProgram;

public class Jan29_GenericsExample {
	X obj;
	Jan29_GenericsExample(X obj) {
		this.obj=ob;
	}
	void add(X obj1,X obj2) {
		System.out.println(obj1+ " " +obj2);
	}
	
	public static void main(String[] args) {
		Jan29_GenericsExample<Integer> o1 = new Jan29_GenericsExample<Integer>(123);
		Jan29_GenericsExample<Double> o2 = new Jan29_GenericsExample<Double>(123.123);
		Jan29_GenericsExample<String> o3 = new Jan29_GenericsExample<String>("123");
		
	}

}
