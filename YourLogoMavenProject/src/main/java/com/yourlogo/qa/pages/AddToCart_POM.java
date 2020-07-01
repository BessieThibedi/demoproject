package com.yourlogo.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.yourlogo.qa.base.TestBase;

public class AddToCart_POM  extends TestBase{
	Actions action;
	   
    public void performMouseHover(WebElement element,WebDriver driver) {
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    public void Click(WebElement element) {
        element.click();
    }
    public void clear(WebElement element){
        element.clear();
    }
    public void setText(String text, WebElement element) {
        element.sendKeys(text);
    }
    public void SelectByVisibleText(WebElement SelectSize, String text) {
        Select s = new Select(SelectSize);
        s.selectByVisibleText(text);
       
    }
    public void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
        //create javascript executor
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void refresh(WebDriver driver) {
        driver.navigate().refresh();
    }
    public boolean validateText(WebDriver driver, WebElement element, String Expectedtext) throws Exception {
       
       // ExcelUtils.setExcelFile(Constants.excelLocation + Constants.excelFilename,Constants.sheetname);
       
        String observedText = element.getText();
        if(observedText.equals(Expectedtext)) {
           
            //ExcelUtils.setCellData(observedText, 1, 0);
            //ExcelUtils.setCellData("Pass", 2, 1);
            System.out.println(observedText);
            System.out.println("Pass");
            return true;
        }
        return false;
       
    }
 

}
