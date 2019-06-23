package Package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibAnytypeofExcellData
{

			// For all type of data
	String filepath;
	
	public ExcelLibAnytypeofExcellData(String filepath)
	{
		this.filepath=filepath;
	}

	public String readData(String sheetname, int row, int cell)
	{
		String value=null;
		try 
		{
			File file=new File(filepath);
			FileInputStream fis=new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cl = wb.getSheet(sheetname).getRow(row).getCell(cell);
			switch (cl.getCellType()) 
			{
			case STRING:
				value=cl.getStringCellValue();
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cl))
				{
					SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
					value=sdf.format(cl.getDateCellValue());
				}
				else
				{
					long longvalue=(long)cl.getNumericCellValue();
					value=Long.toString(longvalue);
				}
				break;
			case BOOLEAN:
				boolean boolvalue = cl.getBooleanCellValue();
				value=Boolean.toString(boolvalue);
				break;

			default:
				System.out.println("Value is not matching");
				break;
			}
		}
		catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
				
			return value;
	}
}

