package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16_CheckBox {

	public static void main(String[] args) throws Exception {
		// https://demoqa.com/automation-practice-form
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()=\"Male\"]")).click();
		driver.findElement(By.xpath("//*[@for=\"hobbies-checkbox-1\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Reading\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Music\"]")).click();
	}

}
