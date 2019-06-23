package PracticeTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTest
{
	@BeforeClass
	public void BC()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("Before class");
	}
	@Test
	public void FirstScript()
	{
		System.out.println("First Script");
	}
	
	
	public void SecondScript()
	{
		System.out.println("Second script");
		Reporter.log("Checking log", true);
	}
}
