package com.yourlogo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yourlogo.qa.base.TestBase;

public class LoginSignUp extends TestBase 
{
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement authontication;
	
	@FindBy(name = "email")
	WebElement EmailAddress;
	
	@FindBy(name= "passwd")
	WebElement Password;
	
	@FindBy(name = "SubmitLogin")
	WebElement submitBtn;
	
	public LoginSignUp()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickSignIn()
	{
		authontication.click();
	}
	
	//public boolean verifyLoginpage()
	//{
		//return authontication.isDisplayed();
	//}
	
	public HomePage Login(String EmailA, String Pwd)
	{
		EmailAddress.sendKeys(EmailA);
		Password.sendKeys(Pwd);
		submitBtn.click();
		
		return new HomePage();
	}
	

}
