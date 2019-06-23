package PracticeTestNG;

import org.testng.annotations.Test;

public class DependsOnMethodTest
{
	@Test
	public void CreateNewCustomer()
	{
		System.out.println("Customer created");
	}
	
	@Test(dependsOnMethods={"CreateNewCustomer"})
	public void CreateNewProject()
	{
		System.out.println("Project Created");  //creating error
	}
	//It will skip because of above Error
	@Test(dependsOnMethods={"CreateNewCustomer","CreateNewProject"})
	public void Task()
	{
		System.out.println("Task done");
	}
}
