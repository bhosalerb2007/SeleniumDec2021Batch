package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb28_ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
		act.sendKeys(Keys.ENTER).build().perform();
		//act.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).build().perform();
		//driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]")).click();
		

	}

}
