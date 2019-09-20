package VGIS.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBasepac.TestBase;


public class LoginPage extends TestBase {
	
	
	

	//@FindBy(xpath="//md-select//md-select-value[@id=\"select_value_label_0\"]")
	//WebElement Hari;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement signin;
	
	@FindBy(xpath="//img[contains(@style,'margin-top:-3px;height:40px')]")
	WebElement VonageLogo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateCRMImage(){
		return VonageLogo.isDisplayed();
	}
	
	public CallHistoryPage login(String un, String pwd ){
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		    	
		    	
		return new CallHistoryPage();
	}
	
		public CallHistoryPage selectlist()
	{
			 driver.findElement(By.xpath("//*[@id=\"select_1\"]")).sendKeys("SimpleSignal " + Keys.ENTER);
		
	     return new CallHistoryPage();
	}









	

}
