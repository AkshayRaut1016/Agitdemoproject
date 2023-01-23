package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardp {
	WebDriver driver ;

	 @FindBy(xpath="//*[@id='abcd'") WebElement profile;
	 @FindBy(xpath="//*[@class='abasdd']") WebElement edit;
	 
	  
	 public Dashboardp(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 
	 public void navtoprofile()
	 {
		 profile.click();
	 }
	
	 public void navtoedit()
	 {
		 edit.click();
		String title= driver.getTitle();
		 System.out.println(title);
	 }
}
