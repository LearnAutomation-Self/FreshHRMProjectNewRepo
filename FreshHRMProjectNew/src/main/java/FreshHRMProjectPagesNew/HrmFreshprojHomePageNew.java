package FreshHRMProjectPagesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.FreshHrmProjBaseClassNew;


public class HrmFreshprojHomePageNew extends FreshHrmProjBaseClassNew{
	HrmFreshprojHomePageNew homeClass;
	
	@FindBy(id = "MP_link")  
	WebElement clickonadminBtn; 

	
	 public HrmFreshprojHomePageNew(WebDriver driver)
	
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	
	 
	public void ClickOnAdminButton()
	{
	   clickonadminBtn.click();
		
	}

}
