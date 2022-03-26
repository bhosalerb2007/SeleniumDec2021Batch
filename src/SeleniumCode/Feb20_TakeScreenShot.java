package SeleniumCode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb20_TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="F:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("bhosalerb2007@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		 long millis=System.currentTimeMillis();
		 String fname="\\"+millis+".png";
		TakesScreenshot scr=(TakesScreenshot) driver;
		File SrcFile=scr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+fname));
		Thread.sleep(5000);
		
		millis=System.currentTimeMillis();
		fname="\\"+millis+".png";
		SrcFile=scr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+fname));

		//driver.close();
	}

}
