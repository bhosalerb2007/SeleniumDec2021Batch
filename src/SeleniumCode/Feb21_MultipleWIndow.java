package SeleniumCode;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb21_MultipleWIndow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//*[@aria-label=\"Start my free trial with Salesforce CRM\"]")).click();
		String MainWindow=driver.getWindowHandle(); // main window
		System.out.println("main: "+MainWindow);
		Set<String> winhand= driver.getWindowHandles();
		for (String str : winhand) {
			System.out.println(str);
			if(!str.equals(MainWindow)) {
				driver.switchTo().window(str);
				System.out.println(" Title= "+driver.getTitle());
				if(driver.getTitle().equals("Ellie MAE")) {
					driver.findElement(By.xpath("//*[@src=\"https://company.naukri.com/popups/ellie-mae/14sep2021/ice-mortgage-ak-14sep2021.gif\"]")).click();
				Thread.sleep(3000);
				
				}
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		System.out.println(" Title= "+driver.getTitle()); 

	}

}
