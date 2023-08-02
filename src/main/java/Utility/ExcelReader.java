package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {

	public String readExcel(int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("\\Assignment_Task_01\\Sample Data.xlsx");
		return WorkbookFactory.create(file).getSheet("Sheet1").getRow(Row).getCell(Cell).getStringCellValue();
		
	}
}
