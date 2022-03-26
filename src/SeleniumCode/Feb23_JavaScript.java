package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb23_JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.location = 'https://www.google.com/'");
		js.executeScript("window.location = arguments[0]","https://www.google.com/");
		System.out.println(js.executeScript("return document.title;").toString());
		System.out.println(js.executeScript("return document.URL;").toString());
		System.out.println(js.executeScript("return document.domain;").toString());
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"q\"]"));
	//	js.executeScript("arguments[0].value=arguments[1];", ele,"Selenium Class in Pune");
		js.executeScript("arguments[0].value='Selenum class';",ele);
		
		js.executeScript("alert('Search value is placed in search Box');");	
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
		WebElement ele2=driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]"));		
		js.executeScript("arguments[0].click();",ele2);
		
		/*
		js.executeScript("window.scrollBy(0,800)");  
		
		WebElement el3=driver.findElement(By.xpath("//*[@aria-label=\"Page 2\"]"));
		js.executeScript("arguments[0].scrollIntoView()", el3);
*/
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");          

	}

}
