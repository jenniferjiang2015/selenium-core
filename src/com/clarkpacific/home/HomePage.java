package com.clarkpacific.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.clarkpacific.ProjectsPages.ProjectHomePage;
import com.clarkpacific.contactUs.ContactUsPage;

public class HomePage extends Page{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		
		super(driver, wait);
		
	}
	
	public ContactUsPage getContactUsPage(){
		
		element = waitForElementByxpath(".//header[@id='top']");
		element.findElement(By.linkText("Contact Us")).click();
		
		return new ContactUsPage(driver,wait);
	}

    public ProjectHomePage getProjectHomePage(){
		
		element = waitForElementByxpath(".//header[@id='top']");
		element.findElement(By.linkText("Projects")).click();
		
		return new ProjectHomePage(driver,wait);
	}
}
