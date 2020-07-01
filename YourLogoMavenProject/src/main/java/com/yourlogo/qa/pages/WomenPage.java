package com.yourlogo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yourlogo.qa.base.TestBase;

public class WomenPage extends TestBase 
{
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement AddToCartWomen1;
	
	@FindBy(name = "qty")
	WebElement SelectQuantity;
	
	@FindBy(id = "group_1")
	WebElement SelectSize;
	
	@FindBy(name = "Orange")
	WebElement SelectColour;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement proceedToCheckOut;
	
	@FindBy()
	WebElement AddToCartWomen;

}
