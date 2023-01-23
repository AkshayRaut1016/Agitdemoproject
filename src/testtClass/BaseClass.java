package testtClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import testPages.Dashboardp;
import testPages.Login;
import testPages.Logoutp;

public class BaseClass {
	static WebDriver driver;
	Login lp;
	 Dashboardp dp;
	 Logoutp l;
	
	
	
	@BeforeSuite
	public void initBorwser()
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" ");
		
	}
	
	@BeforeClass
	public void objects()
	{
		 lp = new Login(driver);
		 dp= new Dashboardp(driver);
		 l= new Logoutp(driver);
		 
	}
	
	
	
	
	
	
}
