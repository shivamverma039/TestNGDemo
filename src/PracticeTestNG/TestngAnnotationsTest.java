package PracticeTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationsTest 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before suite executed");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("After suite executed");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test executed");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("After Test executed");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class executed");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("After class executed");
	}
	@BeforeMethod()
	public void BM()
	{
		System.out.println("Before Method executed");
	}
	@AfterMethod()
	public void AM()
	{
		System.out.println("After Method executed");
	}
	@Test
	public void TestMethod()
	{
		System.out.println("Test executed");
	}
	
	
		
}
