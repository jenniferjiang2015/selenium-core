package com.clarkpacific.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	protected WebDriver driver;
	protected WebElement element;
	protected WebDriverWait wait;
	
	public Page(WebDriver driver,WebDriverWait wait){
		
		this.driver = driver;
		this.wait = wait;
	}
	
	protected WebElement waitForElementByxpath(String axpath){
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(axpath)));
	}
	
    protected WebElement waitForElementBycss(String cssLocator){
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssLocator)));
	}
    
	
	protected void selectOptions(String selectElementxpath, String visibleText){
		
		element = waitForElementByxpath(selectElementxpath);
		
		Select select = new Select(element);
		
		select.selectByVisibleText(visibleText);
	}
	

}
