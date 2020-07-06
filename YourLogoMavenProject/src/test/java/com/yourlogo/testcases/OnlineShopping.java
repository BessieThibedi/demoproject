package com.yourlogo.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yourlogo.qa.base.TestBase;
import com.yourlogo.qa.pages.AddToCartPage;
import com.yourlogo.qa.pages.AddToCart_POM;
import com.yourlogo.qa.pages.DressPage;
import com.yourlogo.qa.pages.HomePage;
import com.yourlogo.qa.pages.LoginSignUp;
import com.yourlogo.qa.pages.RegistrationPage;
import com.yourlogo.qa.pages.ShirtPage;
import com.yourlogo.qa.pages.ShoppingCartSummaryPage;
import com.yourlogo.qa.pages.WomenPage;



public class OnlineShopping extends TestBase {
	
	//creat the login object so login page class can be accessed
		HomePage homepage;
		WomenPage womenpage;
		DressPage dresspage;
		ShirtPage shirtpage;
		LoginSignUp loginsignup;
		ShoppingCartSummaryPage shoppingCart;
		RegistrationPage register;
		AddToCart_POM addtoCart ;
		AddToCartPage page;
		
		ExcelUtils excelUtils;
			public OnlineShopping()
			{
				//Call the super class constructor
				super();
			}
			@BeforeMethod
			public void SetUp()
		{
				initialization();
				//Creat a home page object
				homepage = new HomePage();
				loginsignup = new LoginSignUp();
				womenpage = new WomenPage();
				dresspage = new DressPage();
				shirtpage = new ShirtPage();
				shoppingCart = new ShoppingCartSummaryPage();
				register = new RegistrationPage(driver);
				 page=new AddToCartPage(driver);
				
				addtoCart =new AddToCart_POM();
				register.ClickSignIn();
				
				//excelUtils = new ExcelUtils();
	}
			@Test
			public void RegisterPage() throws Exception 
			{
		          
			       ExcelUtils.setExcelFile(Constants.ExcelPath + Constants.ExcelFilename, Constants.ExcelSheet);
			      
			       RegistrationPage register = new RegistrationPage(driver);
			      
			      int totalRow= ExcelUtils.getNumberRows();
			      
			      for (int i=1; i <= totalRow; i++ ) {
			          
			      register.setEmail(ExcelUtils.getCellData(i, 0)); 
			      register.ClikCreatcontactBtn();
			      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			      register.setTitlerad(); 
			      register.setFirstName(ExcelUtils.getCellData(i, 1));
			      register.setLastName(ExcelUtils.getCellData(i, 2)); 
			      register.settPassword(ExcelUtils.getCellData(i, 3));
			      register.setdaysdropdown(ExcelUtils.getCellData(i, 4)); 
			      register.setMonthDropDown(ExcelUtils.getCellData(i, 5));
			      register.setyearDropDown(ExcelUtils.getCellData(i, 6)); 
			      //register.setnewsletterRad();
			      register.setspecialRad(); 
			      register.setAddress1(ExcelUtils.getCellData(i, 7));
			      register.setAddress2(ExcelUtils.getCellData(i, 8)); 
			      register.setCity(ExcelUtils.getCellData(i, 9));
			      register.setStateDropn(ExcelUtils.getCellData(i, 10)); 
			      register.setZipCode(ExcelUtils.getCellData(i, 11));
			      register.setCountryDropDown(ExcelUtils.getCellData(i, 12));
			      register.setAdditionalText(ExcelUtils.getCellData(i, 13));
			      register.setHomePhone(ExcelUtils.getCellData(i, 14)); 
			      register.setMobilePhone(ExcelUtils.getCellData(i, 15));
			      register.addressClick(ExcelUtils.getCellData(i, 16));
			      register.ClickRegister();
			      register.clicksignOut();
			      register.writeEmail(ExcelUtils.getCellData(i, 0));
			      register.writePassword(ExcelUtils.getCellData(i, 3));
			      homepage.ClickOnWomenBtn();
			      driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
			      Assert.assertTrue(page.validateAddToCart(driver));
			      page.validateAddToCart(driver);
			      //page.clickMore();
					
					
					shoppingCart.ClickontheProduct();
					
					shoppingCart.clickOnProceed();
					page.ClicvkContinue();
					
					shoppingCart.AddTocart();
			      }
			}
			
					
			}

