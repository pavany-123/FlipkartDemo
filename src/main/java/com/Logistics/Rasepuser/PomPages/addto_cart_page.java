package com.Logistics.Rasepuser.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addto_cart_page {
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchtext;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//li[text()='Intel Celeron Quad Core Processor (12th Gen)']/../../../div[@class='_4rR01T']")
	private WebElement laptop;
	
	public addto_cart_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocart() throws InterruptedException {
		searchtext.sendKeys("Laptop");
		Thread.sleep(3000);
		searchbtn.click();
		Thread.sleep(3000);
		laptop.click();
	}

}
