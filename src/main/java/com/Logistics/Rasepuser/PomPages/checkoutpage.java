package com.Logistics.Rasepuser.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeorder;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement phonenumber;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	public checkoutpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void order() {
		placeorder.click();
		phonenumber.sendKeys("7892381278");
		submit.click();
	}

}
