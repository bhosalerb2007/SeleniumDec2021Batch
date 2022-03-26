package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16_OptionButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@value=\"1\"]"));
		// is this enable?
		if(ele.isEnabled())
			System.out.println("this field is enabled ");
		else
			System.out.println("this field not is enabled ");
		
		//is this selected?
		if(ele.isSelected())
			System.out.println("this field is selected ");
		else
			System.out.println("this field not is selected ");
		
		//is this displayed on webPage?
		
		if(ele.isDisplayed())
			System.out.println("this webElement is Displayed on web page");
		else
			System.out.println("this webElement is not Displayed on web page");
		
		ele.click();
		//is this selected?
				if(ele.isSelected())
					System.out.println("this field is selected ");
				else
					System.out.println("this field not is selected ");

	}

}
