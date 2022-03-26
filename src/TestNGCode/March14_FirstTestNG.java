package TestNGCode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class March14_FirstTestNG {
	@Test(priority = 1)
	public void f() {
		System.out.println("function f");
	}

	@Test(groups = {"basic"})
	public void Hello() {
		System.out.println("function hello");
	}

	@Test(priority = 2)
	public void gone() {
		System.out.println("function gone");
	}

	@Test(priority = -4,enabled = false)
	public void by() {
		System.out.println("function byy");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Before any method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After any method");
	}
}
