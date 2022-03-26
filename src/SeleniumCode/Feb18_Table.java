package SeleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb18_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> RowInTable=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int totalrow=RowInTable.size();   // I will get count of rows

		List<WebElement> colsInTable=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		int totalcol=colsInTable.size();
		
		for(int j=1;j<=totalcol;j++) {
			String text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th["+j+"]")).getText();
			System.out.print(text+"\t");
		}
		System.out.println();
		for(int i=2;i<=totalrow;i++) {
			for(int j=1;j<=totalcol;j++) {
				String text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"\t");
			}
			System.out.println();
		}
	}

}
