package TestNGCode;

import org.testng.annotations.Test;

public class Inhiritedclass extends March17_InheritedDependencies{
			@Test(dependsOnMethods = {"f"})
		  public void f1() {
			System.out.println("IN inherited class");
		  }
	

}
