package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb08_FirstSelenium {

	public static void main(String[] args) {
		// copy path of chromedriver file which we downloaded
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/");
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		System.out.println("Current URL= "+driver.getCurrentUrl());
		driver.close();
		// driver.quite()
		
	}

}
