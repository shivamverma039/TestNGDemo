package PracticeTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	@BeforeMethod
	@Parameters({"browser", "baseurl"})
	public void precondition(String browsername, String url)
	{
		
		System.out.println("Before method");
		System.out.println(browsername+" , "+url);
	}
	@Test
	public void sample()
	{
		System.out.println("sample script");
	}
	
}
