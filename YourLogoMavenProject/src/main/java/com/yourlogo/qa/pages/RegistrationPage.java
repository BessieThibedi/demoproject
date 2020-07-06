package com.yourlogo.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yourlogo.qa.base.TestBase;
import com.yourlogo.qa.util.TestUtilClass;

public class RegistrationPage extends TestBase 
{
	
	
	

	@FindBy(xpath= "//*[@id=\"email_create\"]")						
	WebElement emailText;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	WebElement Sbmitbtn;
	@FindBy(id = "id_gender1")
	WebElement titleRad;
	
	@FindBy(id = "customer_firstname")
	WebElement FirstName;
	
	@FindBy(id = "customer_lastname")
	WebElement LastName;
	
	@FindBy(id = "passwd")
	WebElement PasswordText;
	
	@FindBy(name = "days")
	WebElement daysDropdown;
	
	@FindBy(id = "months")
	WebElement monthsDropDown;
	
	@FindBy(name = "years")
	WebElement yearsDropdown;
	
	@FindBy(id = "newsletter")
	WebElement newsLatter;
	
	@FindBy(id = "option")
	WebElement specialsRad;
	
	@FindBy(id = "address1")
	WebElement address1txt;
	
	@FindBy(id = "address2")
	WebElement address2txt;
	
	@FindBy(id = "city")
	WebElement citytxt;
	
	@FindBy(name = "id_state")
	WebElement StateDrop;
	
	@FindBy(id = "postcode")
	WebElement postcodetxt;
	
	@FindBy(id = "id_country")
	WebElement countryTxt;
	
	@FindBy(id = "other")
	WebElement additionalTxt;
	
	@FindBy(id = "phone")
	WebElement HomePhonetxt;
	
	@FindBy(id = "phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(id = "submitAccount")
	WebElement submitAccount;
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
	WebElement AccountName;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement SignOutbtn;
	
	@FindBy(name = "/html/body/div/div[2]/div/div[3]/div/div/h1")
	WebElement Pagetitle;
	
	@FindBy(name = "other")
	WebElement Additionaltxt;
	
	@FindBy(name = "alias")
	WebElement address3;
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	WebElement Registerbtn;
	
	@FindBy(name = "id_state")
	WebElement stateDropDown;
	@FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement SigninButton;
	
	@FindBy (xpath = "//*[@id=\"SubmitCreate\"]/span")
	WebElement ClickCreatBtn;
	
	@FindBy(id = "alias")
	WebElement Address1223;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signout;
	
	@FindBy(id = "email")
	WebElement writeEmail;
	@FindBy (id = "passwd")
	WebElement password2;
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicksignOut() 
	{
		signout.click();
	}	
	public void writeEmail(String stremail1)
	{
		writeEmail.sendKeys(stremail1);
	}
	public void writePassword(String strPasswrd )
	{
		password2.sendKeys(strPasswrd);
	}
	public void addressClick(String strAdress)
	{
		Address1223.sendKeys(strAdress);
	}
	public void ClickSignIn()
	{
		SigninButton.click();
	}
	public void ClikCreatcontactBtn()
	{
		ClickCreatBtn.click();
	}
	
	public void setEmail(String strUserName)
	{
		
		//driver.manage().timeouts().pageLoadTimeout(TestUtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		emailText.sendKeys(strUserName);
	}
	
	public void Clicksubmit()
	{
		Sbmitbtn.click();
	}
	public void setTitlerad()
	{
		titleRad.click();
	}
	public void setFirstName(String StrName1)
	{
		FirstName.sendKeys(StrName1);
	}
	public void setLastName(String Lastname)
	{
		LastName.sendKeys(Lastname);
	}
	
	public void settPassword(String passwordtext)
	{
		PasswordText.sendKeys(passwordtext);
	}
	public void setdaysdropdown(String Strdays)
	{
		Select dropdown = new Select(daysDropdown);  
		dropdown.selectByValue(Strdays);
	}
	
	public void setMonthDropDown(String strMonths)
	{
		Select dropdown = new Select(monthsDropDown);  
		dropdown.selectByValue(strMonths);
		
	}
	
	public void setyearDropDown(String Stryears)
	{
		Select dropdown = new Select(yearsDropdown);  
		dropdown.selectByValue(Stryears);
	}
	public void setAddress1(String StrAddress1)
	{
		address1txt.sendKeys(StrAddress1);
		
	}
	public void setAddress2(String StrAddress2)
	{
		address2txt.sendKeys(StrAddress2);
	}
	public void setCity(String StrCity)
	{
		citytxt.sendKeys(StrCity);
	}
	
	public void setStateDropn(String Strstate)
	{
		Select dropdown = new Select(stateDropDown);  
		dropdown.selectByValue(Strstate);
	}
	public void setZipCode(String StrzipCode)
	{
		
		postcodetxt.sendKeys(StrzipCode);
	}
	
	public void setCountryDropDown(String StrCountry)
	{
		Select dropdown = new Select(countryTxt);  
		dropdown.selectByValue(StrCountry);
	}
	
	
	public void setMobilePhone(String strMobilePhone)
	{
		MobilePhone.sendKeys(strMobilePhone);
	}
	public void setHomePhone(String StrHomePhane)
	{
		HomePhonetxt.sendKeys(StrHomePhane);
	}
	public void setAdditionalText(String StrWriteeSomething)
	{
		Additionaltxt.sendKeys(StrWriteeSomething);
	}
	
	public void setAddress3(String strAsddress) 
	{
		address3.sendKeys(strAsddress);
	}
	
	public void ClickRegister()
	{
		Registerbtn.click();
	}
	public void newslatterRad()
	{
		newsLatter.sendKeys("gsjsty");
	}
	
	public void setspecialRad()
	{
		
	}

	
	

	
	
	
	public void setHomePage()
	{
		//return homepage();
	}
	
	public void setMobilePhone()
	{
		MobilePhone.sendKeys("1234568");
	}
	public void setRegistrationbtn()
	{
		
		
	}
	public String getAccountName()
	{
		return AccountName.getText();
	}
	
	public void setLogoutbtn()
	{
		SignOutbtn.click();
	}
	
	public String getPageTitle()
	{
		return Pagetitle.getText();
	}



	public void setExcelFile(String string, String excelsheet) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
