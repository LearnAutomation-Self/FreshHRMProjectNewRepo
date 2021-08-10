package CommonFunction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import FreshHRMProjectPagesNew.HrmFreshprojLoginPageNew;


public class FreshHrmProjBaseClassNew {
	
	public static WebDriver driver;
	String url;
	public HrmFreshprojLoginPageNew loginClass;
	
	@BeforeMethod
	public void setUp()	{
		  
	
		  System.setProperty("webdriver.chrome.driver","C:\\2021SelProj\\Java\\JulyPOMSelenium2021\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		  
		    driver.manage().window().maximize();
		
		     url = "https://opensource-demo.orangehrmlive.com/";
		     driver.get(url);
		
		
		loginClass = new HrmFreshprojLoginPageNew(driver);	
				
		
	}
	@AfterMethod
	public void tearDown()
	{		
		
		driver.close();	
		
	}

}
