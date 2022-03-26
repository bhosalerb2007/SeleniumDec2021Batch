package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuiteDemo {

	public static void main(String[] args) {
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@title=\"Search Jobs\"]")).click();
		driver.quit();

	}

}
