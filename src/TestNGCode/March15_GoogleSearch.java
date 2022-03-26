package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class March15_GoogleSearch {
	WebDriver driver=null;
	
  @Test
  public void init() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Bata");
	  driver.findElement(By.xpath("//*[@name='q']")).submit();
  }
  
  @Test(priority = 2)
  public void display() {
	 String str=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText(); 
	 System.out.println("Search Result:  "+str);
	  
  }
}
