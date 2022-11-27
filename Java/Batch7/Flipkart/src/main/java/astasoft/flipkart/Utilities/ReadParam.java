package astasoft.flipkart.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadParam {
	
	public static String readProperties(String path, String key) {
		String value = null;
		try {
			FileInputStream file = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(file);
			value = prop.getProperty(key);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static Object readExcel(String path, int rowNo, int colNo) {
		Object value = null;
		try {
			FileInputStream file = new FileInputStream(path);
			//to open excel file
			Workbook workbook = WorkbookFactory.create(file);  
			//To open sheet
			Sheet sheet = workbook.getSheet("Sheet1");
			//to get the desired row
			Row row = sheet.getRow(rowNo);

			// to get desired cell at desired row & column
			Cell cell = row.getCell(colNo);
			
			// to get lastRow number in a sheet
//			int lastRow = sheet.getLastRowNum();
			
			// to get lastColumn in sheet
//			short lastCol = row.getLastCellNum();
			
//			Cell cell = WorkbookFactory.create(file)
//					.getSheet("Sheet1")
//					.getRow(rowNo)
//					.getCell(colNo);
			
			//to get type of value in located cell
			CellType type = cell.getCellType();
			
			if(type.equals(CellType.STRING)) {
			 value = cell.getStringCellValue();
			}
			if(type.equals(CellType.NUMERIC)) {
			 value = cell.getNumericCellValue();
			}
			if(type.equals(CellType.BOOLEAN)) {
			 value = cell.getBooleanCellValue();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}

	

}
