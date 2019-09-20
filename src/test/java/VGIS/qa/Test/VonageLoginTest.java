package VGIS.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBasepac.TestBase;
import VGIS.qa.pages.LoginPage;
import VGIS.qa.pages.VonageLogin;


public class VonageLoginTest extends TestBase {
	
	
	VonageLogin vonageLogin;
	LoginPage loginpage;
	
	
	public VonageLoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		vonageLogin = new VonageLogin();	
	}
	
	@Test(priority=1)
    public void loginPageSignUp(){
        loginpage = vonageLogin.login();
    }
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = vonageLogin.validateCRMImage();
		Assert.assertTrue(flag);

}
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
	
	
	
}



