package com.Logistics.Rasepuser.PomPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class switch_tab {
	
	@FindBy(xpath="//li[@class='col col-6-12']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="(//div[@class='go_DOp'])[3]")
	private WebElement carticon;
	
	
	
	public switch_tab(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void placeorder() throws InterruptedException {
		addtocartbtn.click();
		Thread.sleep(3000);
		
		carticon.click();
		Thread.sleep(3000);
		
	}

}
