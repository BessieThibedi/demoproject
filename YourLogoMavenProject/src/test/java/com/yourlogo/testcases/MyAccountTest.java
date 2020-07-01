package com.yourlogo.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yourlogo.qa.base.TestBase;
import com.yourlogo.qa.pages.HomePage;
import com.yourlogo.qa.pages.LoginSignUp;
import com.yourlogo.qa.pages.MyAccountPage;

public class MyAccountTest extends TestBase
{
	MyAccountPage myAccountpage;
	HomePage homepage;
	LoginSignUp signin;
	
	public MyAccountTest()
	{
		super();
	}
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		myAccountpage = new MyAccountPage();
		homepage = new HomePage();
		signin = new LoginSignUp();
		homepage.ClickSigninLink();
		signin.Login("meta@gmail.com", "meta@123");
		
	}
	@Test
	public void validateUserName()
	{
		Boolean flag = myAccountpage.VerifyUsername();
		Assert.assertTrue(flag);
	}
	@Test
	public void selectWomenBtn()
	{
		homepage.ClickOnWomenBtn();
	}
	

}
