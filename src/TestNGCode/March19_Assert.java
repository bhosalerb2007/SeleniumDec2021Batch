package TestNGCode;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class March19_Assert {
  @Test(dataProvider = "dp")
  public void hard(Integer n, Integer m, Integer o) {
	  Integer add=n+m;
	  System.out.println("Hard****** n= "+n+" m= "+m+" O="+o);
	  Assert.assertEquals(add, o);
	  System.out.println("Just after Hard assert");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 11, 2,3 },
      new Object[] { 2, 4,6 },
      new Object[] { 2, 7,6 },
      new Object[] { 22, 4,26 },
      new Object[] { 21, 2,3 },
      new Object[] { 22, 4,6 },
      new Object[] { 32, 7,6 },
      new Object[] { 32, 4,26 },
      new Object[] { 41, 2,3 },
      new Object[] { 42, 4,6 },
      new Object[] { 52, 7,6 },
      new Object[] { 52, 4,26 },
    };
  }
  
  @Test(dataProvider = "dp")
  public void soft(Integer n, Integer m, Integer o) {
	  Integer add=n+m;
	  System.out.println("Soft::: n= "+n+" m= "+m+" O="+o);
	  SoftAssert as=new SoftAssert();
	  as.assertEquals(add, o);
	  System.out.println("Just after Soft assert");
  }
}
