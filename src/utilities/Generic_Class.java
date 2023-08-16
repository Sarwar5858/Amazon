package utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Class {

	//All the generic methods should be here
	
	public static WebDriver driver= null;
	
	public static Logger applicationLogs= Logger.getLogger("devpinoyLogger");
	
	//--------------Browser Maximize--------------
	public void MaxPage() {
		driver.manage().window().maximize();
	}
	
	//---------This is for TEXTBOX for XPATH-------------
	public void typeByXpath (String locator, String value) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			Boolean display= element.isDisplayed();
			Boolean enabled= element.isEnabled();
			if(display==true) {
				if (enabled ==true) {
			element.clear();
			element.sendKeys(value);}
				else {System.out.println("item not enabled");}}
			else {System.out.println("item not displayed");}
		}
		catch(Exception e) {
			System.err.println("Issue with: "+e.getMessage());}
	}
	
	//-------This is for BUTTON click for XPATH------------
	public void ClickByXpath (String locator) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			Boolean display= element.isDisplayed();
			Boolean enabled= element.isEnabled();
			if(display==true) {
				if (enabled ==true) {
			element.click();}
				else {System.out.println("item not enabled");}}
			else {System.out.println("item not displayed");}
		}
		catch(Exception e) {
			System.err.println("Issue with: "+e.getMessage());}
	}
	
	//	//-------This is for BUTTON click for LinkText------------
	public void ClickByLinkText (String locator) {
		try {
			WebElement element = driver.findElement(By.linkText(locator));
			Boolean display= element.isDisplayed();
			Boolean enabled= element.isEnabled();
			if(display==true) {
				if (enabled ==true) {
			element.click();}
				else {System.out.println("item not enabled");}}
			else {System.out.println("item not displayed");}
		}
		catch(Exception e) {
			System.err.println("Issue with: "+e.getMessage());}
	}
	
	//---This is for URL navigation--------
	public void GotoUrl (String url) {
		try {
			driver.get(url);
		}
		catch(Exception e) {
			System.err.println("Issue with: "+e.getMessage());}
	}
	
	
	//------This is for Mouse HOVER OVER------------------
	
	public void MouseHoverOverMain(String link) {
	try {
		WebElement main = driver.findElement(By.linkText(link));
		Actions action = new Actions(driver);
		action.moveToElement(main).perform();}
	catch (Exception e) {System.out.println("Issue with: "+e.getMessage());}
	}
	
	//-------------Single Checkbox by xPath---------------//
	
	public static void CheckBox(String XPath) {
	try {	
		WebElement checkbox = driver.findElement(By.xpath(XPath));
		boolean checkboxDisplay= checkbox.isDisplayed();
		boolean checkboxEnabled= checkbox.isEnabled();
		boolean checkboxSelected= checkbox.isSelected();
		if (checkboxDisplay == true) 
		{ if (checkboxEnabled==true)
		{ if (checkboxSelected==false){checkbox.click();}
		else System.out.println("Checkbox is already Selected");
		}
		else System.out.println("Checkbox is not Enabled");}
		else System.out.println("Checkbox is not Displayed");}
	
	catch (Exception e) {System.out.println("Issue with: "+e.getMessage());}}
	
	
	//------------------Scrolling Vertically -------------------
	
	public static void ScrollingV() {
	try {
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("window.scrollBy(0,500)", "");}
	catch (Exception e) {System.out.println("Issue with: "+e.getMessage());}
	}
	
	//------------------Scrolling HORIZONTALLY -------------------
	
	public static void ScrollingH() {
	try {
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("window.scrollBy(500,0)", "");}
	catch (Exception e) {System.out.println("Issue with: "+e.getMessage());}
	}	
	
	
	
}
