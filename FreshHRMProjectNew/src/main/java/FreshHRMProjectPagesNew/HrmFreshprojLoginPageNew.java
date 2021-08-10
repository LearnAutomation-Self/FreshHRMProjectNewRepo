package FreshHRMProjectPagesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.FreshHrmProjBaseClassNew;
import FreshHRMProjectPagesNew.HrmFreshprojHomePageNew;


public class HrmFreshprojLoginPageNew extends FreshHrmProjBaseClassNew{
	HrmFreshprojHomePageNew homeclass;
	
	@FindBy(id="txtUsername")
	WebElement userName; 
		
	
    @FindBy(id="txtPassword")
    WebElement password;
    
    @FindBy(name = "Submit")
    WebElement submit;
    
    
    @FindBy(id="divLogo")
    WebElement logo;
    
  public HrmFreshprojLoginPageNew(WebDriver driver)
   
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    public boolean validateLogo()
    {
    	logo.isDisplayed();
    	return true;
    }
    
    public HrmFreshprojHomePageNew login(String Username, String Password) throws InterruptedException
    
    {
    	       
    	
    	userName.sendKeys(Username);
    	Thread.sleep(3000);
    	password.sendKeys(Password);
    	Thread.sleep(3000);
    	submit.click();
    	Thread.sleep(3000);
    	
    	return new HrmFreshprojHomePageNew(driver);
    }
    	

}
