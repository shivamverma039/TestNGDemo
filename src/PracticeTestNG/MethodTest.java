package PracticeTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodTest 
{
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("After Method");
	}
	@Test
	public void first()
	{
		System.out.println("First Script");
	}
	@Test
	public void second()
	{
		System.out.println("Second Script");
	}	
}
