package Inheritance;

import org.testng.annotations.Test;

public class ExtendMultipleClassTest extends ConfigMethod
{
	@Test(dataProviderClass=ConfigData.class, dataProvider="data")
	public void datatest(String firstname, String secondname)
	{
		System.out.println(firstname+" , "+secondname);
	}	
}
