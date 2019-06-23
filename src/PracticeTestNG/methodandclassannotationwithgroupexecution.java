package PracticeTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class methodandclassannotationwithgroupexecution 
{
	@Test(groups={"smoke"})
	public void login()
	{
		System.out.println("Login Smoke Group");
	}
	@Test(groups={"regression"})
	public void BuyProduct()
	{
		System.out.println("BuyProduct Regression group");
	}
	@Test(groups={"regression"})
	public void Purchase()
	{
		System.out.println("Purchase Regression group");
	}
	@BeforeMethod(groups={"smoke"})
	public void BM()
	{
		System.out.println("Before method");
	}
	@BeforeClass(groups={"regression"})
	public void BC()
	{
		System.out.println("Before class");
	}
	
}
