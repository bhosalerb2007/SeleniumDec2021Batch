package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feb22_AlertorPopup {

	public static void main(String[] args) {
		Alert alt;
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		alt=driver.switchTo().alert();    // we switched to alert window
		System.out.println("Text: "+alt.getText());
		alt.accept();  // after accepting / dismissing control will goto main window
		//alt.dismiss();

		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		alt=driver.switchTo().alert();
		System.out.println("Confirmation Alert Text: "+alt.getText());
		//alt.accept();    //means you are accepting or choosing Yes/Confirm/OK
		alt.dismiss();   // means you are rejecting or choosing No/Cancle/Dismiss

		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		alt=driver.switchTo().alert();
		System.out.println("Prompt Alert Text: "+alt.getText());
		alt.sendKeys("Ravindra");
		
		alt.accept();



		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		try {
			Alert ele=(Alert) wait.until(ExpectedConditions.alertIsPresent());
			ele=driver.switchTo().alert();
			System.out.println("Wait "+ele.getText());
			ele.accept();
		}catch (Exception e) {
			System.out.println(e);
		}
		driver.close();

	}

}
