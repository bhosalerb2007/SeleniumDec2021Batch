import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ashwin123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Desktop\\\\MANUAL TESTING\\\\crome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		//right click functionality
		act.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Quit')]")).click();
		Thread.switchTo().
		
		https://demo.guru99.com/test/drag_drop.html
		*/
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		WebElement el1,el2;
		el1=driver.findElement(By.xpath("//*[text()=\" Bank \"]"));
		el2=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		act.dragAndDrop(el1, el2).build().perform();
	}

}
