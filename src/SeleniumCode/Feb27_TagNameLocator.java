package SeleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Feb27_TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("a"));
		//List<WebElement> list1=driver.findElements(By.xpath("//a"));
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			//ele.click();
			//driver.get("https://www.google.com/");
		}
	}

}
