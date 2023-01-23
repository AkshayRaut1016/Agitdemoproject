package testtClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import testPages.Login;

public class BaseClass {
	static WebDriver driver;
	Login lp;
	 
	
	
	
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
		 
	}
	
	
	
	
	
	
}
