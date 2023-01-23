package testtClass;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(priority=1)
	public void validateDetails()
	{
		lp.enterdetails();
	}
	
	@Test(priority=2)
	public void validatetitle()
	{
		lp.getTitle();
	}
	
	
	

}
