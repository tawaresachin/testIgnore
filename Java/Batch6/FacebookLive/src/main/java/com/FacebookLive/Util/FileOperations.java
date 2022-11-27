package com.FacebookLive.Util;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileOperations {
	
	public String readProperty(String filePath, String key) {
		FileInputStream file = null;
		Properties prop = null;
		String value = null;
		try {
			 file = new FileInputStream(filePath);
			 prop = new Properties();
			 prop.load(file);
			 value = prop.getProperty(key);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return value;
	}	

	
	public Object readValueFromExcel(String filePath, Object sheetIdentifier, int rowNum, Object colIdentifier) {
		Object cellValue = null;
		Sheet sheet = null;
		Row row = null;
		Cell col = null;
		try {
			sheet = new FileOperations().getSheetFromExcel(filePath, sheetIdentifier);
			row = sheet.getRow(rowNum);
			
			if(colIdentifier.getClass().equals(String.class)) {
				short lastCellNum = row.getLastCellNum();
				for(short i=0; i<lastCellNum; i++) {
					if(row.getCell(i).getStringCellValue().equals(colIdentifier)) {
						col = row.getCell(i);
					}
				}
			} else {
				col = row.getCell((int) colIdentifier);
			}
			
			CellType type = col.getCellType();
			if(type.equals(CellType.STRING)) {
				cellValue = col.getStringCellValue();
			} else if(type.equals(CellType.NUMERIC)) {
				cellValue = col.getNumericCellValue();
				if(cellValue.getClass().equals(Integer.class)) {
					System.out.println(cellValue.getClass());
					cellValue = (int)cellValue;
				}
				if(cellValue.getClass().equals(Double.class)) {
					cellValue = (double) cellValue;
				}
			} else if(type.equals(CellType.BOOLEAN)) {
				cellValue = col.getBooleanCellValue();
			}			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}
	
	public Sheet getSheetFromExcel(String filePath, Object sheetIdentifier) {
		FileInputStream file = null;
		Sheet sheet = null;
		try {
			file = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(file);
			if(sheetIdentifier.getClass().equals(String.class)) {
				sheet = workbook.getSheet((String)sheetIdentifier);
			} else if(sheetIdentifier.getClass().equals(Integer.class)) {
				sheet = workbook.getSheetAt((int) sheetIdentifier);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheet;
	}	

}
