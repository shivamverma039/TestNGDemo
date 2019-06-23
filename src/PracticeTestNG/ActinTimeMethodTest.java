package PracticeTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActinTimeMethodTest 
{
	WebDriver driver;
	@BeforeMethod
	public void Launchbrowser()
	{
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=4gssg8h1api6p");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("After Method");
		driver.close();
	}
	
	@Test(priority=1)
	public void validLogin()
	{
		System.out.println("Doing Valid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(priority=2)
	public void InvalidLogin()
	{
		System.out.println("Invalid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manageres");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test(priority=3)
	public void createnewcustomer()
	{
		System.out.println("createnewcustomer");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Shivam");
		driver.findElement(By.name("description")).sendKeys("Tester");
		driver.findElement(By.name("createCustomerSubmit")).sendKeys("Tester");
	}

}
