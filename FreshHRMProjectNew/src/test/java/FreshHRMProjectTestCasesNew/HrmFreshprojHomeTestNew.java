package FreshHRMProjectTestCasesNew;

import org.testng.annotations.Test;

import FreshHRMProjectPagesNew.HrmFreshprojHomePageNew;
import CommonFunction.FreshHrmProjBaseClassNew;

public class HrmFreshprojHomeTestNew extends FreshHrmProjBaseClassNew {
	HrmFreshprojHomePageNew homeClass;
	
	 @Test
	 public void AdminTab() throws InterruptedException
	{	
		
		 homeClass =  loginClass.login("Admin","admin123" );	
		 homeClass.ClickOnAdminButton();		 
		Thread.sleep(2000);
	
		
}

}
