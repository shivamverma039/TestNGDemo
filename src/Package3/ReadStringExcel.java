package Package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadStringExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("C:/Users/User/Desktop/Test Data.xlsx");
		FileInputStream fis=new FileInputStream(file); // for taking input data from sheet
		//creating workbook
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		String value = cl.getStringCellValue();
		System.out.println(value);		
	}

}
