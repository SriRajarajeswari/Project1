package VGIS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBasepac.TestBase;


public class VonageLogin extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement signinBtn;
	
	
	@FindBy(xpath="//img[contains(@style,'margin-top:-3px;height:40px')]")
	WebElement VonageLogo;
	
	public VonageLogin(){
		PageFactory.initElements(driver, this);
	}

	
	public boolean validateCRMImage(){
		return VonageLogo.isDisplayed();
	}
	
	public LoginPage login()
    {     
		signinBtn.click();
    return new LoginPage();
    }
	
	

}
