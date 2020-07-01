package com.yourlogo.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yourlogo.qa.base.TestBase;
import com.yourlogo.qa.pages.HomePage;
import com.yourlogo.qa.pages.LoginSignUp;
import com.yourlogo.qa.pages.ShoppingCartSummaryPage;

public class ShoppingCartTestCase extends TestBase 
{
	ShoppingCartSummaryPage shoppingPage;
	HomePage homepage;
	LoginSignUp login;
	
	public ShoppingCartTestCase()
	{
		super();
	}
	public void SetUp()
	{
		initialization();
		shoppingPage = new ShoppingCartSummaryPage();
		homepage = new HomePage();
		login = new LoginSignUp();
			
	}
	@BeforeMethod
	public void ClickWomenButton()
	{
		homepage.ClickOnWomenBtn();
		shoppingPage.ClickontheProduct();
		shoppingPage.clickOnProceed();
	}
	@Test 
	public void ValidateNumOfProd()
	{
		String getNum = shoppingPage.verifyNumberofProduct();
		Assert.assertEquals(getNum, "Number of product selected is incorrect");
	}
	
	
	

}
