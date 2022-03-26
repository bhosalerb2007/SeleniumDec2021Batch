package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb09_Navigation {

	public static void main(String[] args) {
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");
		//System.out.println(driver.getTitle());
		driver.navigate().back();
		//System.out.println(driver.getTitle());
		driver.navigate().forward();
		//System.out.println(driver.getTitle());
		driver.navigate().refresh();
		//System.out.println(driver.getTitle());
	}

}
