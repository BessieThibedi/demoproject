package com.yourlogo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yourlogo.qa.base.TestBase;

public class HomePage extends TestBase 
{
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	WebElement CompanyLogo;
	
	@FindBy(xpath ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement WomenButton;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement DressButton;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement ShirtButton;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public Boolean VerifyLogo()
	{
		return CompanyLogo.isDisplayed();
	}
	public WomenPage ClickOnWomenBtn()
	{
		WomenButton.click();
		return new WomenPage();
	}
	
	
	public DressPage ClickOnDressBtn()
	{
		DressButton.click();
		return new DressPage();
	}
	
	public ShirtPage ClickOnShirtBtn()
	{
		ShirtButton.click();
		return new ShirtPage();
	}
	
	public LoginSignUp ClickSigninLink()
	{
		SignIn.click();
		return new LoginSignUp();
	}


	
	
	
	
	


	
	
	
	
	
}
