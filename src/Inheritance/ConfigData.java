package Inheritance;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class ConfigData 
{
	
	@DataProvider(name="data")
	public static Object[][] getdata()
	{
		Reporter.log("Get Data scrript running", true);
		Object[][] obj=new Object[3][2];
		obj[0][0]="Shiv";
		obj[0][1]="Rama";
		obj[1][0]="Laxman";
		obj[1][1]="Bharat";
		obj[2][0]="Shatrudhan";
		obj[2][1]="Hanuman";
		return obj;
	}
	
}
