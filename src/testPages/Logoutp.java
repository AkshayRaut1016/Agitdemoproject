package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutp {
 WebDriver driver;
 
	
	@FindBy(xpath="//*[@id='abd'") WebElement logout;
	
	public Logoutp(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logout.click();
	}
	
	
	
	
}
