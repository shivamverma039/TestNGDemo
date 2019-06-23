package PracticeTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest 
{
	@DataProvider(name="captain")
	public Object[][] getdata()
	{
		Object[][] obj=new Object[3][2]; //3 rows and 2 cells in each row
		//First row
		obj[0][0]="Shivam";
		obj[0][1]="Ram";
		//Second row
		obj[1][0]="Laxman";
		obj[1][1]="Dhoni";
		//third row
		obj[2][0]="Rohit";
		obj[2][1]="Jadeja";
		return obj;
	}
	@Test(dataProvider="captain")
	public void datatest(String firstname, String secondname)
	{
		System.out.println(firstname+" , "+secondname);
	}
	
}
