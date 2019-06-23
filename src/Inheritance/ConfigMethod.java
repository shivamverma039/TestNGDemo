package Inheritance;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class ConfigMethod 
{
	@BeforeMethod()
	public void precondition()
	{
		Reporter.log("Before Method", true);
	}
	
}
