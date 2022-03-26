package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Feb17_SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		
		Select day=new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		// Select day=new Select(WebElement);
		day.selectByIndex(14);
		//day.selectByValue("15");
		//day.selectByVisibleText("15");
		
		Select month=new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		month.selectByValue("8");
		month.selectByVisibleText("Aug");
		
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByValue("1947");
		year.selectByVisibleText("1947");
		
	}

}
