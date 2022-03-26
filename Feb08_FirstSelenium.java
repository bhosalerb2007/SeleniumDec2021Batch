package SleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Feb08_FirstSelenium {

	public static void main(String[] args) {
			// Copy the path of chrome driver file which is downloaded
		
		String path = "E:\\chromedriver.exe"; //Path of the chrome driver
		System.setProperty("webdriver.chrome.driver",path); // sets the value of key. 
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); // Other way to write the above two lines
		
		WebDriver driver = new ChromeDriver(); // Create an object. Inheritance property is used here
		
		driver.get("https://www.google.com"); //Opens the mentioned webPage
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		driver.get("https://www.facebook.com");
		String title1 = driver.getTitle();
		System.out.println("Title is " +title1);
		
		System.out.println("Current URL = " +driver.getCurrentUrl());  
		
		String Pgsource = driver.getPageSource(); 
		System.out.println("PageSource = " +Pgsource);
		
		//driver.close(); //Closes the current window
		//driver.quit();
		
	}

}
