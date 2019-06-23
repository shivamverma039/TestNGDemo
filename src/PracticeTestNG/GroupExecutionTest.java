package PracticeTestNG;

import org.testng.annotations.Test;

public class GroupExecutionTest
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
	
}
