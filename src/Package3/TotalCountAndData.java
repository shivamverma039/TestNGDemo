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

public class TotalCountAndData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("C:/Users/User/Desktop/Test Data.xlsx");
		FileInputStream fis=new FileInputStream(file); // for taking input data from sheet
		//creating workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Total rows
		Sheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println("Total Rows: "+rowcount); //output will be total-1
		
		//Total Cells inside each row
		for (int i = 0; i <= rowcount; i++) 
		{
			Row row=sh.getRow(i);
			int cellcount=row.getLastCellNum();
			System.out.println("Row: "+i+" Cell: "+cellcount);
			
		}
		
		//Data of Each cell
		System.out.println("Data Executing");
		for (int i = 0; i <= rowcount; i++) 
		{
			Row row=sh.getRow(i);
			int cellcount=row.getLastCellNum();
			System.out.println("Row: "+i+" Cell: "+cellcount);
			for (int j = 0; j < cellcount; j++) 
			{
				Cell cl=row.getCell(j);
				System.out.println(cl.getStringCellValue());
			}
			
		}

	}

}
