package com.yourlogo.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yourlogo.qa.base.TestBase;

public class ShoppingCartSummaryPage extends TestBase 
{
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement Product;
	
	@FindBy(xpath = "//*[@id=\"product_1_1_0_332914\"]/td[2]/p/a")
	WebElement ProductLink;
	
	@FindBy(name= "group_1")
	WebElement ProductSize;
	
	@FindBy(name = "Orange")  //*[@id="add_to_cart"]/button
	WebElement Colour;
	
	@FindBy (xpath = "//*[@id=\"add_to_cart\"]/button")
	WebElement AddToCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement Proceedtochekout;	
	
	@FindBy(xpath ="//*[@id=\"product_1_1_0_332914\"]/td[3]/span")
	WebElement CheckAvailability;
	
	@FindBy(name= "quantity_1_1_0_332914")
	WebElement Quantity;
	
	@FindBy(xpath = "//*[@id=\"1_1_0_332914\"]/i")
	WebElement RemoveProduct;
	
	@FindBy(id = "total_product")
	WebElement productPrice;
	
	@FindBy(id = "total_shipping")
	WebElement shippingPrice;
	
	@FindBy (id = "total_price_without_tax")
	WebElement TotalPaymentIthoutTax;
	
	@FindBy(id = "total_price")
	WebElement TotalPayment;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement clickPrpceeBtn;
	
	public ShoppingCartSummaryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyNumberofProduct()
	{
		return Quantity.getText();
	}
	
	public void ClickontheProduct()
	{
		Product.click();
	}
	
	public void ClickProductLink()
	{
		ProductLink.click();
		
		
	}
	public void clickOnProceed()
	{
		Proceedtochekout.click();
	}
	
	public void ChangeQuantity()
	{
		Quantity.sendKeys("2");
	}
	
	public void ChangeSize()
	{
		Select dropdown = new Select(ProductSize);  
		dropdown.selectByVisibleText("M");
	}
	
	public void ChangeColour()
	{
		Colour.click();
	}
	
	public void AddTocart() 
	{
		driver.switchTo().frame("fancybox-frame1592938128618");
		AddToCart.click();
		
		//Robot robot = new Robot();
		//robot.mouseMove(390, 50);
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		//Thread.sleep(2000);
		//robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//Thread.sleep(2000);
	}
	
	public void RemoveAll()
	{
		RemoveProduct.click();
	}
	
	

}
