package PracticeTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationActinTimeTest 
{
	WebDriver driver;
	@BeforeClass
	public void Launchbrowser()
	{
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=4gssg8h1api7p");
	}
	@Test()
	public void createnewcustomer()
	{
		System.out.println("createnewcustomer");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("8");
		driver.findElement(By.name("description")).sendKeys("Tester");
		driver.findElement(By.name("createCustomerSubmit")).click();
		driver.findElement(By.id("logoutLink")).click();
	}
	@Test(dependsOnMethods={"createnewcustomer"})
	public void createnewproject()
	{
		System.out.println("createnewproject");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		WebElement selectcustomer=driver.findElement(By.name("customerId"));
		Select customers=new Select(selectcustomer);
		customers.selectByVisibleText("8");
		driver.findElement(By.name("name")).sendKeys("My first Project");
		driver.findElement(By.name("description")).sendKeys("Haha");
		driver.findElement(By.name("createProjectSubmit")).click();
		driver.findElement(By.id("logoutLink")).click();
	}
	@Test(dependsOnMethods={"createnewcustomer","createnewproject"})
	public void createnewTask()
	{
		System.out.println("createnewTask");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		WebElement selectcustomer=driver.findElement(By.name("customerId"));
		Select customers=new Select(selectcustomer);
		customers.selectByVisibleText("8");
		WebElement selectproject=driver.findElement(By.name("projectId"));
		Select Projects=new Select(selectproject);
		Projects.selectByVisibleText("My first Project");
		driver.findElement(By.name("task[0].name")).sendKeys("Task assigned");
		driver.findElement(By.id("ext-gen7")).click();
		driver.findElement(By.xpath("//table[@id='ext-gen86']//span[text()='20']")).click();
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass()
	public void close()
	{
		driver.close();
	}
		
}
