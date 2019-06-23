package PracticeTestNG;

public class LaunchingBrowser 
{

	public static void main(String[] args) 
	{
		System.out.println("Running");
//		BrowserFactoryTest.launchbrowser("firefox");
//		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.internetexplorer", "./exefiles/IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();

		
	}

}
