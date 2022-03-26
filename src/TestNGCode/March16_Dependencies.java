package TestNGCode;

import org.testng.annotations.Test;

public class March16_Dependencies {
	int x=100,y=200;
  @Test(groups = {"basic"})
  public void add() {
	  System.out.println("Addition is "+(x+y));
  }
  
  @Test(groups = {"basic"})
  public void mul() {
	  System.out.println("Multiplication is "+(x*y));
  }
  
  @Test(groups = {"basic"})
  public void div() {
	  System.out.println("Division is "+(x/y));
  }
  
  @Test(groups = {"basic"})
  public void sub() {
	  System.out.println("Subtraction is "+(x-y));
  }
  
  @Test(groups = {"Area"})
  public void SqrArea() {
	  System.out.println("Square area is "+(x*x));
  }
  
  @Test(groups = {"Area"})
  public void RectArea() {
	  System.out.println("Rectangle area is "+(x*y));
  }
}
