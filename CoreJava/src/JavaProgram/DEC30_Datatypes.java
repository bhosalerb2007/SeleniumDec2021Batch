package JavaProgram;

public class DEC30_Datatypes {

	public static void main(String[] args) {
		// Integer primitive data types
		// Integer indicate complete number
		
		// byte b = 100; // b is a byte type of data and size is 8 bit 
		short c = 10000, k=1100; // size is 16 bit
		int a = 100; //a is an int type of data and size is 32 bit
		int a1 = 3, b1;
		b1 = 253;
		System.out.println(b1);
		System.out.println("a1"+a1);
		 
		// operators + * -
        int f = a1 + b1;
        System.out.println("Addition is " +f);
        
        int g = b1 - a1;
        System.out.println("Subtraction is " +g);
        
        int h = a1 * b1;
        System.out.println("Multiplication is " +h);
        
        int i= a1 / a;
        System.out.println("Division is " +i);
              
        long r = c + k;
        System.out.println(r);
        
        char first = '1';
        System.out.println(first);		
        
        float fl1;
        fl1 = (float)b1/a1;
        System.out.println(fl1);
        
        double db1 = (double) b1/a1;
        System.out.println(db1);
        int e = first;
        System.out.println(e);
        
        int p1 = 128; // gives -ve value only for 128 and onwards..0 to 127 it gives +ve nums
        int p = (byte)p1;
        System.out.println(p);
        
        int s = (200000 * 200000 / 200000);
        System.out.println(s);
	}

}
