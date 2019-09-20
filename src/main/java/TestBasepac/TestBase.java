package TestBasepac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import VGIS.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\APPTIVO\\Desktop\\VGISSanity\\VGISSanity\\src\\main\\java\\VGIS\\qa\\config\\VGISConfig.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		ChromeOptions options = new ChromeOptions();
		  // Load extension file from E: drive.
		  options.addExtensions(new File("E:\\Automation\\Extension\\ext.crx"));
		
		
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Chromedriver\\chromedriver_win32\\chromedriver.exe/");	
			driver = new ChromeDriver(options); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\latest ver cd\\chromedriver_win32\\chromedriver.exe/");	
			driver = new FirefoxDriver(); 
		}
		
		
		  
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		driver.get(prop.getProperty("url"));
		
	}

}
