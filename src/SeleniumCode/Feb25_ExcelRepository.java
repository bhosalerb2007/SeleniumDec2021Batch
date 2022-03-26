package SeleniumCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb25_ExcelRepository {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		FileInputStream fin=new FileInputStream("I:\\SeleniumInput.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet mysheet=wb.getSheet("Sheet1");
		int rowcount=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
		for(int i=0;i<=rowcount;i++) {
			XSSFRow currRow=mysheet.getRow(i);
			String val=null;
			try {
			 val=currRow.getCell(0).getStringCellValue();
			}catch (NullPointerException e) {
				// TODO: handle exception
			}
			if(val!=null) {
				driver.findElement(By.xpath("//*[@name='q']")).sendKeys(val);
				//driver.findElement(By.xpath("//*[@name='q']//following::input[3]")).click();
				driver.findElement(By.xpath("//*[@name='q']")).submit();
				String res=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
				System.out.println(val+"    "+res);

				driver.get("https://www.google.com");
				driver.findElement(By.xpath("//*[@name='q']")).clear();
				currRow.createCell(2).setCellValue(res); //write o/p in respective column 1
				String actual[]=res.split(" ");
				String expe[]=currRow.getCell(1).getStringCellValue().split(" ");
				if(actual[1].equals(expe[1])) {
					currRow.createCell(3).setCellValue("Pass");
				}
				else {
					currRow.createCell(3).setCellValue("Fail");
				}
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
