package PracticeTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactoryTest 
{
	public static WebDriver launchbrowser(String browsername)
	{
		WebDriver driver=null;
		
		if (browsername.equalsIgnoreCase(browsername="chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if (browsername.equalsIgnoreCase(browsername="firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase(browsername="ie"))
		{
			System.setProperty("webdriver.internetexplorer", "./exefiles/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		return driver;
	}

}
