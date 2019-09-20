package VGIS.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBasepac.TestBase;
import VGIS.qa.pages.CallHistoryPage;
import VGIS.qa.pages.LoginPage;
import VGIS.qa.pages.VonageLogin;



	
	public class LoginPageTest extends TestBase{

		
		VonageLogin vonageLogin;
		LoginPage loginpage;
		CallHistoryPage callhistory;
		
		
		public LoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			vonageLogin = new VonageLogin();
			loginpage = new LoginPage();
			vonageLogin.login();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (String windowName : driver.getWindowHandles()) {
			      driver.switchTo().window(windowName);
			  }
			
			
		
			callhistory = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			callhistory = loginpage.selectlist();
		}
		
		
		@Test(priority=1)
	    public void loginPageSignUp(){
	        loginpage = vonageLogin.login();
	    }

		//@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}
