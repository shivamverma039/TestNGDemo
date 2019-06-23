package PracticeTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void lbrowser()
	{
		Reporter.log("Before Method", true);
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=argc96s58in35");		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("After Method");
		driver.close();
	}
	
	@Test(priority=1)
	public void validlogin()
	{
		Reporter.log("Valid Login script running", true);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String exp="Enter Time-Track";
		String act = driver.findElement(By.xpath("(//td[@class='pagetitle'])[2]")).getText();
		System.out.println(act);
		Assert.assertEquals(act, exp);
		String acttitle=driver.getTitle();
		String exptitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(acttitle, exptitle);
		Reporter.log("Home Page is verified" , true);
	}
	@Test(priority=2)
	public void invalidlgin()
	{
		Reporter.log("Invalid SCript running", true);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		driver.findElement(By.id("loginButton")).click();
		String exp="Username or Password is invalid. Please try again.";
		String act=driver.findElement(By.xpath("//div[@id='ServerSideErrorMessage']//span")).getText();
		Assert.assertEquals(act, exp);
		Reporter.log(act, true);
		Reporter.log("Invalid Page verified", true);		
	}
}
