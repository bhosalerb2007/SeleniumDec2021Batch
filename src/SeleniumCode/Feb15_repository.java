package SeleniumCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb15_repository {

	public static void main(String[] args) throws IOException {
		//FileInputStream fio=new FileInputStream("F:\\Test\\SeleniumDecBatch\\DemoProperty.properties");
		FileInputStream fio=new FileInputStream(System.getProperty("user.dir")+"\\DemoProperty.properties");
		Properties prop=new Properties();
		prop.load(fio);
		
		String  dpath=prop.getProperty("path");
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		String myXpath=prop.getProperty("searchbox");
		String searchword=prop.getProperty("searchWord");
		driver.findElement(By.xpath(myXpath)).sendKeys(searchword);
		driver.findElement(By.xpath(myXpath)).submit();
	}

}
