package SeleniumCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb26_ExcepRepositoryFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		FileInputStream fin=new FileInputStream("I:\\SeleniumInput.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet mysheet=wb.getSheet("Sheet2");
		int rowcount=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
		for(int i=0;i<=rowcount;i++) {
			driver.get("https://www.facebook.com");
			XSSFRow currRow=mysheet.getRow(i);
			String Uname=null,Passwd=null;
			try {
			 Uname=currRow.getCell(0).getStringCellValue();
			 Passwd=currRow.getCell(1).getStringCellValue();
			}catch (NullPointerException e) {
				// TODO: handle exception
			}
			if(Uname!=null) {
				driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys(Uname);
				driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys(Passwd);
				driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
				Thread.sleep(6000);
				try {
					if(driver.getTitle().equals("Log in to Facebook") || driver.getTitle().equals("Facebook – log in or sign up"))
						currRow.createCell(3).setCellValue("LOGIN FAIL");
					else
						currRow.createCell(3).setCellValue("LOGIN PASS");
				}catch (Exception e) {
					
				}
				String actual=currRow.getCell(3).getStringCellValue();
				String expected=currRow.getCell(2).getStringCellValue();
				if(actual.equals(expected))
					currRow.createCell(4).setCellValue("Test Pass");
				else
					currRow.createCell(4).setCellValue("Test Fail");
			}

		}
		fin.close();
		FileOutputStream fos=new FileOutputStream("I:\\SeleniumInput.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		driver.close();

	}

}
