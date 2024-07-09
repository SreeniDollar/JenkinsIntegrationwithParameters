package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH="./src/main/resources/data/TestData.xlsx";
	public static Object[][] getData(String sheetname) throws IOException
	{
		FileInputStream file = new FileInputStream(TESTDATA_SHEET_PATH);
		book=WorkbookFactory.create(file);
		sheet=book.getSheet(sheetname);
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
		
	}
	
}
