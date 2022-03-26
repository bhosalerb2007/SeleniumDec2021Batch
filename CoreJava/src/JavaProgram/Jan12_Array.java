package JavaProgram;

public class Jan12_Array {
	
	int a[]=new int[10];
	int marks[]=new int[5];
	
	public static void main(String[] args) {
		Jan12_Array obj=new Jan12_Array();
		obj.marks[0]=21;
		obj.marks[1]=31;
		obj.marks[2]=41;
		obj.marks[3]=51;
		obj.marks[4]=61;
		System.out.println(obj.marks[2]);
		int total=obj.marks[0]+obj.marks[1]+obj.marks[2]+obj.marks[3]+obj.marks[4];
		System.out.println(total);
	}
	
	int totalmarks(int marks[]) {
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		return total;
	}

}
