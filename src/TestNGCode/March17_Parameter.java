package TestNGCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class March17_Parameter {
	WebDriver driver=null;
	
	
	@Test
	@Parameters({"browser","cpath","mpath"})	
  public void f(String br,String chromepath, String mozilaPath) {
		if(br.equalsIgnoreCase("mozila")) {
			System.setProperty("webdriver.gecko.driver", mozilaPath);
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver=new ChromeDriver();
		}
  }
	
	
	@Test(dependsOnMethods = {"f"})
	@Parameters({"site"})
	public void f1(String site) {
		driver.get(site);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@name='q']")).submit();
		
	}
}
