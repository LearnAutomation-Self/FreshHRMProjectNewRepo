package FreshHRMProjectTestCasesNew;

import org.testng.Assert;
import org.testng.annotations.Test;

import FreshHRMProjectPagesNew.HrmFreshprojHomePageNew;
import CommonFunction.FreshHrmProjBaseClassNew;

public class HrmFreshprojLoginTestNew extends FreshHrmProjBaseClassNew {
	HrmFreshprojHomePageNew homeClass;
	
	@Test
	public void Login() throws InterruptedException
	{
		 loginClass.login("Admin", "admin123");		
		String expectedString ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	    String actualString = driver.getCurrentUrl();		
		Assert.assertEquals(actualString, expectedString);
		Thread.sleep(2000);
		
	}
	

}
