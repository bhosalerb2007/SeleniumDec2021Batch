package TestNGCode;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class March19_DP {
	WebDriver driver=null;
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
  @Test(dataProvider = "dp")
  public void add(String s) {
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys(s);
	driver.findElement(By.xpath("//*[@name='q']")).submit();
	Assert.assertTrue(driver.getTitle().contains(s));
	System.out.println("If hard assert used then in case of failure it will not execute");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Selenium" },
      new Object[] { "Jio" },
      new Object[] { "Java" },
    };
  }
  
  
}
