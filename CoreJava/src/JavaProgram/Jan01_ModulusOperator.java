package JavaProgram;

public class Jan01_ModulusOperator {

	public static void main(String[] args) {
		int num = 12345; // 1+2+3+4+5
		int mod;
		mod = num / 10;
		System.out.println(mod);
		
	    int mod1 = mod / 10; // quotient 1234
	    System.out.println(mod1);
	    
	    int mod2 = mod1 / 10; // quotient 123
	    System.out.println(mod2);
		
	    int mod3 = mod2 / 10; // quotient 12
	    System.out.println(mod3);
	    
	    int mod4 = mod3 / 10; // quotient 1
	    System.out.println(mod4);
	    
	    int mod5 = mod4 / 10; // quotient 0
	    System.out.println(mod5);
	    
	    System.out.println(mod1+mod2+mod3+mod4+mod5);
	    
	    int mod6 = mod + 1; //can also be written as mod = +1
	    System.out.println(mod6);
	    
	    int mod7 = mod - 1; // can be written as mod = -1
	    System.out.println(mod7);
        
	    mod = 10;
	    System.out.println(mod++); // first gives the output and then increments
	    System.out.println(mod);
	    System.out.println(++mod); // first increments and then gives the output
	    System.out.println(mod--); // first gives output and then decrements
	    System.out.println(mod);
	    System.out.println(--mod); // first decrements and then gives output

	}

}
