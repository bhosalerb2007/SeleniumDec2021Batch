package TestNGCode;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class march17_ParameterForAdd {
  @Test
  @Parameters({"num1","num2"})
  public void f(int n1,int n2) {
	  System.out.println("Addidtion is "+(n1+n2));
  }
}
