package Package3;

public class ExcelTest {

	public static void main(String[] args) 
	{
		String filepath="C:/Users/User/Desktop/Test Data.xlsx";
		ExcelLibAnytypeofExcellData elib=new ExcelLibAnytypeofExcellData(filepath);
		String clno=elib.readData("Sheet1", 0, 3);
		System.out.println(clno);
		System.out.println(elib.readData("Sheet1", 0, 2));
		
	}

}
