package com.yourlogo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yourlogo.qa.base.TestBase;

public class MyAccountPage extends TestBase 
{
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement userName;
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean VerifyUsername()
	{
		return userName.isDisplayed();
	}
	

}
