package test_case_TestScript_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Configuration;
import locators.locators_ObjectRepository;
import test_data.locator_values;

public class Test_Cases extends Configuration {

	locators_ObjectRepository ob_Loc = new locators_ObjectRepository();
	locator_values ob_Value = new locator_values();
	SoftAssert ob_softAssert = new SoftAssert();
	
//-----------------------TC for SIGN IN----------------------//
	@Test(priority=1)
	public void SignInAmazon() {
		//This is for User ID
		GotoUrl(ob_Value.URLTo_sign_in);
		typeByXpath(ob_Loc.useridLocator, ob_Value.useridValue);
		ClickByXpath(ob_Loc.ContinueButtonXpath);
		
		//This is for Password
		typeByXpath(ob_Loc.PasswordLocator, ob_Value.PasswordValue);
		ClickByXpath(ob_Loc.SUBMITButtonXpath);		
		
		System.out.println("Signing in to Amazon");	}
	
//-------------------------SEARCH an item--------------------//
	    @Test (dependsOnMethods= {"SignInAmazon"})
		public void SearchItem() {
	    	typeByXpath (ob_Loc.SearchBarXpath, ob_Value.SearchBarValue);
			ClickByXpath(ob_Loc.SearchHit);
		}
	
	    
//-------------------Filter products by CheckboxFilter ---------------//
		@Test (priority=2,enabled=false) //"enabled=false" makes the test case disabled
	    public void FiterProduct () {
			CheckBox(ob_Loc.FreeShippingCheckbox);
		}				
	
//-------------------Select an item and add to cart--------------//
		@Test (priority=3)
		public void SelectItem () {
		
		//-------Scroll down and Select an item-----------//
		ScrollingV();
		ClickByXpath(ob_Loc.ProductXpath);
		
		//-----------Scroll down and click "Add to cart"--------//
		ScrollingV();
		ClickByXpath(ob_Loc.ProductAddToCart);
		
		//-----------Click "No Thanks" when ask for protection
		
		ClickByXpath(ob_Loc.NoThanksButton);
	}
	
//-------------------Proceed for Checkout---------------//
		@Test (priority=4)
		public void ProceedToCheckout() {
			ClickByXpath(ob_Loc.ProceedToCheckout);
		}
			
//-------------------Add Debit/Credit Card----------------------//
		@Test (priority=5)
		public void AddDebitCard() {
			//----Click "Add Debit or Credit Card"------
			ClickByLinkText(ob_Loc.AddDebitCreditCardLink);
			
			//--------Enter Card Number-----------//
			typeByXpath(ob_Loc.CardNumberXpath, ob_Value.CardNumber);
			
			//--------Enter "Name on Card"--------//
			typeByXpath(ob_Loc.NameOnCardXpath, ob_Value.NameOnCard);
			
			//--------Select "Expiration Date" of Debit/Credit Card
			
			
			//--------Enter Security Code----------//
			typeByXpath(ob_Loc.SecurityCodeXpath, ob_Value.SecurityCode);
			
			//--------Click on "Add your card"----------//
			ClickByXpath(ob_Loc.AddYourCard);
			
		}
	
	//-------------Selenium Assertion--------------//
		public void assertPass () { 
			String actualValue="abcd";
			String expectedValue="abcd";
			Assert.assertEquals(actualValue, expectedValue);
			System.out.println("Assertion test case passed");
			
			ob_softAssert.assertEquals(actualValue, expectedValue);    
			
		}
	
	
	
	
	
	
	
	
}
 