package JavaProgram;

import java.util.Scanner;

public class Jan04_SwitchCase {

	public static void main(String[] args) {
		int a=10, b=20, choice=1;
		switch(choice) {
		case 1: 
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a/b);
			break;
		case 4:
			System.out.println(a*b);
			break;
		default:
			System.out.println("Wrong Choice");
		}
		
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println("I have taken d= "+d);
	}

}
