package Package3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException
	{
		File file=new File("./Excel/Report1.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		Workbook wb=new XSSFWorkbook();
		Sheet sh = wb.createSheet("Shivam");
		Row rw = sh.createRow(3);
		Cell cl = rw.createCell(5, CellType.STRING);
		cl.setCellValue("Kabir Singh");
		wb.write(fos);
		System.out.println("Written");
	}

}
