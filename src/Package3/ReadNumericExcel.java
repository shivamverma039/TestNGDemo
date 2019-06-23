package Package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("C:/Users/User/Desktop/Test Data.xlsx");
		FileInputStream fis=new FileInputStream(file); // for taking input data from sheet
		//creating workbook
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		// For normal numeric number
		Cell simplecl = rw.getCell(3);
		double simplevalue = simplecl.getNumericCellValue();
		System.out.println(simplevalue);
		//Need to do Downcasting
		long actualsimplevalue=(long) simplevalue;
		System.out.println(actualsimplevalue);
		//For Date numeric value
		Cell datecl=rw.getCell(2);
		Date datevalue = datecl.getDateCellValue();
		System.out.println(datevalue);
		//need to convert in simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(datevalue));
		
		
	}

}
