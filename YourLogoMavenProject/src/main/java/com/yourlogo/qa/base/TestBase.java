package com.yourlogo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.yourlogo.qa.util.TestUtilClass;



public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	 {
		 
		 try {
			 //creat object of properties class
			 prop = new Properties();
			 //Creat object of FileInputStream and give property file location
			FileInputStream ip = new  FileInputStream ("C:\\Users\\Meta\\eclipse-workspace\\YourLogoMavenProject\\src\\main\\java\\yourlogo\\qa\\config\\config.properties");
			//Load the property file use properties object to load property file
			prop.load(ip);

		 } 
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public static void  initialization()
	 {
		 String browserName = prop.getProperty("browser");
		 if (browserName.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Meta\\eclipse-workspace\\YourLogoMavenProject\\WebDriver\\chromedriver_win32 (2)\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
		 }
		 else if(browserName.equals("FF") )
		 {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\Meta\\eclipse-workspace\\YourLogoMavenProject\\WebDriver\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			 driver = new FirefoxDriver(); 
		 }
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().pageLoadTimeout(TestUtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("URL"));
		 
	 }
	

}
