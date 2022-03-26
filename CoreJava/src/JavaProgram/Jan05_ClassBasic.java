package JavaProgram;

public class Jan05_ClassBasic {

	//Declare instance variable of class
	int marks1; //32 bit
	int marks2; //32 bit
	short marks3; //16 bit
	
	public static void main(String[] args) {
		Jan05_ClassBasic stud1; //created a reference
		stud1 = new Jan05_ClassBasic(); //allocate memory here 80 bit
		
		Jan05_ClassBasic stud2 = new Jan05_ClassBasic(); //create ref and allocate a memory
		
		// assign values to instance variable for student 1
		// objname.instanceVariableName = value
		stud1.marks1=70;
		stud1.marks2=72;
		stud1.marks3=76;
		
		// operation like printing total marks
		System.out.println(stud1.marks1+stud1.marks2+stud1.marks3);
		
		// assign values to instance variable student 2
		stud2.marks1=80;
		stud2.marks2=81;
		stud2.marks3=87;
		
		System.out.println(stud1.marks1);
		System.out.println(stud2.marks1);
	}

}
