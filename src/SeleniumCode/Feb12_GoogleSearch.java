package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb12_GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Create New Account")).click();
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Ravindra");
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("bhosale");
		driver.findElement(By.xpath("//*[@aria-label=\"Mobile number or email address\"]")).sendKeys("9877687656");
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		/*driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//*[@name='q']")).submit();
		driver.findElement(By.xpath("//*[@name='q']//following::input[3]")).click();
		
		String result=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
		System.out.println(result);*/
		//driver.close();
	}

}
