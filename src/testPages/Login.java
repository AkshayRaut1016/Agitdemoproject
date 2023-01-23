package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver ;

	
	@FindBy(xpath="") WebElement admin;
	@FindBy(xpath="") WebElement pass;
	
	 public Login(WebDriver driver)
	 {
		 this.driver =driver;
		 PageFactory.initElements(driver,this);
	 }
	
	
	public void enterdetails()
	{
		admin.sendKeys("akshay");
		pass.sendKeys("akshay@123");
	}
	
	public void getTitle()
	{
	String  title = driver.getTitle();
	   System.out.println(title);
	}
	
	
	
	
	
	
	
	
}
