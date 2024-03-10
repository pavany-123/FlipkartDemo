package com.Logistics.Rasepuser.genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutilities {
	
	public void dropdown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void rightclick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick();
	}
	
	public void draganddrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	
	public void doubleclick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}

	public void switchframe(WebDriver driver) {
      driver.switchTo().frame(0);
	}
	
	public void switchbackfromframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertpopupok(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void alertpopupcancle(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchtabs(WebDriver driver) {
		Set<String> ele = driver.getWindowHandles();
		for(String b:ele) {
			driver.switchTo().window(b);
		}
	}
	
	public void scrollbar(WebDriver driver, int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")", "");
	}

}
