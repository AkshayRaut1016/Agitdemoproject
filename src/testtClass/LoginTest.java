package testtClass;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test
	public void validateDetails()
	{
		lp.enterdetails();
	}
	
	@Test
	public void validatetitle()
	{
		lp.getTitle();
	}
	
	
	

}
