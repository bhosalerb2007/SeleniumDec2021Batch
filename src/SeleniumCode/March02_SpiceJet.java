package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class March02_SpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");/*
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]//following::input[1]")).sendKeys("DEL");
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]//following::input[2]")).sendKeys("CHE");
		//driver.findElement(By.xpath("//*[text()=\"Departure Date\"]//following::div[1]")).click();
		WebElement ele= driver.findElement(By.xpath("//*[text()=\"10\"]"));
		act.doubleClick(ele).build().perform();
		
		driver.findElement(By.xpath("//*[text()=\"Return Date\"]//following::div[1]")).click();
		ele= driver.findElement(By.xpath("//*[text()=\"16\"]"));
		act.doubleClick(ele).build().perform();
		
		driver.findElement(By.xpath("//*[text()=\"Passengers\"]//following::div[1]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"Children-testID-plus-one-cta\"]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"Infant-testID-plus-one-cta\"]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Currency\"]//following::div[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"USD\"]")).click();
		//driver.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
*/
		driver.findElement(By.xpath("//*[text()=\"flight status\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Flight No.(optional)\"]//following::div[2]")).click();
	}

}
