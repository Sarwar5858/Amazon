package locators;

public class locators_ObjectRepository {
//All the locators' information should be here
	
	//-------------SIGN IN Info AMAZON-----------//
	
			//------UserID--------//
			public String useridLocator= "//input[@name='email']"; //xpath
			//------Xpath for "CONTINUE"------
			public String ContinueButtonXpath= "//input[@id='continue']";  //xpath
			
			//----Password Xapth-------//
			public String PasswordLocator= "//input[@name='password']"; //xpath
			//----Password Xapth-------//
			public String SUBMITButtonXpath= "//input[@name='password']"; //xpath
			
	//---------------Search for an item----------//
			public String SearchBarXpath= "//input[@id='twotabsearchtextbox']"; //xpath
			public String SearchHit= "//input[@id='nav-search-submit-button']"; //xpath
			
	//---------------Filter from checkbox----------//
			public String FreeShippingCheckbox = "/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[2]/ul/span/li/span/a/div[1]/label/i";
		
	//---------------Select an item and add to cart-------------//
			//Xpath for product to be selected
			public String ProductXpath= "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span";
			
			//Xpath for "Add to cart" button
			public String ProductAddToCart= "//input[@id='add-to-cart-button'] ";
			
			//Xpath for "No Thanks" button when asks for insurance
			public String NoThanksButton = "/html/body/div[9]/div[3]/div[1]/div/div/div[5]/div/div/div[2]/span/span/input";
			
			
	//--------------Select "Proceed to Checkout"----------------//
			//Xpath for "Proceed to Checkout"
			public String ProceedToCheckout= "/html/body/div[9]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input";
	
	//--------------Add Debit or Credit Card-----------------//
			//Link for "Add Debit or Credit Card" link
			public String AddDebitCreditCardLink= "Add a credit or debit card";
			
			//--------Xpath for "Card Number"-----------//
			public String CardNumberXpath= "//*[@id=\"pp-G9DShh-16\"]";
			
			//--------Xpath for "Name on Card"--------//
			public String NameOnCardXpath= "//*[@id=\"pp-G9DShh-18\"]";
			
			//--------Xpath for  "Expiration Date" of "Month" -----//
			public String CardExpirationMonth= "//*[@id=\"pp-G9DShh-22\"]";
			
			//--------Xpath for  "Expiration Date" of "YEAR"-------//
			public String CardExpirationYear= "";
			
			//--------Enter Security Code----------//
			public String SecurityCodeXpath= "";
			
			//-------Xpath for "Add your card" button----------//
			public String AddYourCard= "/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/form/div[2]/div/span[2]/span/input";
			
			
			
			
			
			
			
			
			
}
