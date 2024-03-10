package com.Logistics.Rasepuser.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.Logistics.Rasepuser.PomPages.addto_cart_page;
import com.Logistics.Rasepuser.PomPages.checkoutpage;
import com.Logistics.Rasepuser.PomPages.switch_tab;
import com.Logistics.Rasepuser.genericLib.BaseClass;

// Generic Library Consist of - Autoconstant Interpage , Base class, Fileutilities class, Photo class, WebDriverUtilities class.
// Path for Generic Library is - Flipkart Demo ==>> Src/Main/java ==>> com.logistics.RasepUser.GenericLib.
// POM Pages Package Path is - Flipkart Demo ==>> Src/Main/java ==>> com.logistics.RasepUser.Pompages.
// Test Script Path is - Flipkart Demo ==>> Src/test/java ==>> com.logistics.RasepUser.scripts






/**
 * In The Below Line I have Imported the all the Base class Methods.
 */
public class testcase1 extends BaseClass {
// This is the Test script I have created the Object of POM Pages. and call the Methods from the POM pages.
	
	@Test
	public void tc1() throws InterruptedException, FileNotFoundException, IOException {
		// In The Below Line i have generate the ITest Report in HTML Format.
		test=reports.createTest("tc1");
		
		//In The Below I have created the addto_cart_pag Object from This Object I have Call the 'AddTocart' Method This Method Performs Below steps. (Below Description is for Line No 32 & 33 )
		// - Enter the LapTops in the Search Bar.
		// - After Enter the text It clicks on the search Button.
		// - After Clicks on the Search Button we will get LapTops Listing the Next it selects one LapTop and click on that LapTop.
		addto_cart_page ad=new addto_cart_page(driver);
		ad.addtocart();
		
		
		//Below Line Indicates That i have written the WebdriverUtilities class in the package com.Logistics.Rasepuser.genericLib and from that class
		// i Have call the Utilies methods This method is for Tab Switch.
		// Aftre click on the LapTop the selected LapTop will be Opened in the New Tab so we need to Switch the Tab.
		utilies.switchtabs(driver);
		Thread.sleep(3000);
		
		// Once After switch the Tab.
		// I Have Created the object of Switch_tab and Form this Object I have call the Placeorder Method this Method performs the Below Steps.
		// - 1st It will click on the Add to Cart After Product added to the cart.
		// - Then it will click on the Cart option which is placed in Headed.
		switch_tab sw=new switch_tab(driver);
		sw.placeorder();
		
		// In The Below Line 50, 52 & 53 i have Verify the Product which is Present in the cart is correct or not By using Assertion.
       WebElement laptopname = driver.findElement(By.xpath("//a[text()='CHUWI Intel Celeron Quad Core 12th Gen N100 - (8 GB/256 GB SSD/Windows 11 Home) GemiBook X_Pro Laptop']"));
		
		Assert.assertEquals(laptopname.getText(),fu.getpropertyfile("laptop"));
		System.out.println(laptopname.getText());
		
		
		
		// Once Aftre Verify the product in the cart page next we will click on the Place order Button
		// Aftre click on the place Order it will redirect to Checkout page.
		// In Checkout page we need to Login First.
		// So I Have enter the Mobile Number and click on the countinue next it will Ask OTP But we can't Automate the OTP scenario.
		// But i have Tried the OTP Scenario with 3rd party API i.e ( Mailosaur ) But By using this also we are not able to complete the 100% Login Because Flipkart check the user is Human or Not.
		// Because in the Selenium once we open the Browser it is under control of Test Automate so it checks the user is Human or not.
		checkoutpage ck=new checkoutpage(driver);
		ck.order();
		
	}
}
