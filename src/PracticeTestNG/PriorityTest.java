package PracticeTestNG;

import org.testng.annotations.Test;

public class PriorityTest 
{
	
	@Test(priority=3)
	public void FirstScript()
	{
		System.out.println("FirstScript");
	}
	@Test(priority=2)
	public void SecondScript()
	{
		System.out.println("SecondScript");
	}
	@Test(priority=1)
	public void ThirdScript()
	{
		System.out.println("ThirdScript");
	}
}
