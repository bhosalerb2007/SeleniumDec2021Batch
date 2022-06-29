import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Hemant {

	public static void main(String[] args) {
		String path = "E:\\HEMANT SOFTWARE TESTIG\\Data From Wagh Sir & Bhosale Sir\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		FileInputStream fin= new FileInputStream("E:\\Mar22.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fin);
		XSSFSheet mysheet= workbook.getSheet("Google");
		XSSFRow currow= mysheet.getRow(0);
		int rowcount = mysheet.getLastRowNum()- mysheet.getFirstRowNum();
		String str;String result;
		for(int i = 0; i<=rowcount; i++) {
			driver.get("https://www.google.com/");
			str=mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(str);
			driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(str);
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(2500);
		List<WebElement> tbl = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(tbl.size());
		
		List<WebElement> tbl1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		System.out.println(tbl1.size());
		
	
		for (int i=1; i<=tbl.size(); i++) {
			if (i==1) {
				for (int j=1; j<=tbl1.size(); j++) {
					System.out.print(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th["+j+"]")).getText());
				}
			}
			else {
				for (int j=1; j<=tbl1.size(); j++) {
					System.out.print(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
			System.out.println();*/


	}

}
