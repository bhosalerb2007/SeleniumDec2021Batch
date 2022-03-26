package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class March01_ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	/*	driver.get("https://www.facebook.com/");
		
		act.moveToElement(driver.findElement(By.xpath("//*[text()=\" Meta © 2022\"]"))).build().perform();
*/
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement ele=driver.findElement(By.xpath("//a[text()=\" BANK \"] "));
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		//WebElement ele2=driver.findElement(By.partialLinkText("BANK"));
		act.dragAndDrop(ele, ele2).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),\"Debit Mov\")]"))).build().perform();
		
	}

}
