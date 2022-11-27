package SeleniumUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizationExcel {
	
	public static String getStringValue(Sheet sheet, int row, int column ) {
		String stringValue = sheet.getRow(row).getCell(column).getStringCellValue();
		return stringValue;
	}
	
	public static double getNumericValue(Sheet sheet, int row, int column) {
		double numericValue = sheet.getRow(row).getCell(column).getNumericCellValue();
		return numericValue;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			
		driver.get("https://www.facebook.com");
		WebElement name = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("pass"));	
		
		FileInputStream file = new FileInputStream("D:\\Study\\Drivers\\testData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell column = row.getCell(0);		
//		Cell column = sheet.getRow(0).getCell(0);
//		String firstName = sheet.getRow(0).getCell(0).getStringCellValue();
		
		String firstName = getStringValue(sheet,0,0);
		name.sendKeys(firstName);		
		String pass = getStringValue(sheet,0,1);
		password.sendKeys(pass);		
		double pin = getNumericValue(sheet,0,2);
		System.out.println("PIN: " + pin);		
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last Row No.: "+lastRow);		
		short lastCell = sheet.getRow(0).getLastCellNum();
		System.out.println("Last Cell No.: "+lastCell);		
	}
}

