package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb10_Locator1 {

	public static void main(String[] args) throws InterruptedException {
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bhosalerb2007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("pass")).submit();
		//driver.findElement(By.name("login")).click();
		System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("bhosalerb2007@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("123456");
		//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(7000);
		//driver.close();
	
	}

}
