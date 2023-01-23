package testtClass;

import org.testng.annotations.Test;

public class DashboardTest extends BaseClass{

	@Test(priority=3)
	 public void validateprofile()
	 {
		 dp.navtoprofile();
	 }
	
	@Test(priority=4)
	public void validateedit()
	{
		dp.navtoedit();
		
	}
	
	
	
	
	
	
	
	
}
