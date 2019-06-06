package PracticeTestNG;

import org.testng.annotations.Test;


public class MultipleTimeandDisableTest 
{
	//Multiple times
	@Test(invocationCount=10,invocationTimeOut=2000)
	public void Multi()
	{
		System.out.println("Multiple Times Running");
	}
	//Disable by using Enables=False
	@Test(enabled=false)
	public void DisableTest()
	{
		System.out.println("DisableTest");
	}
	@Test(enabled=true)
	public void EnableTest()
	{
		System.out.println("EnableTest");
	}
	@Test
	public void TestScript()
	{
		System.out.println("Test Script");
	}
	// Disable by using TestNg file
	// check TestNG file
	
}
