package com.clarkpacific.contactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.clarkpacific.home.HomePage;

public class ContactUsPage extends HomePage{

	public ContactUsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public void fillFullName(String fullName) throws InterruptedException{
		
		waitForElementByxpath(".//input[@id='fullName']").sendKeys(fullName);
		Thread.sleep(1000);
	}
	
	public void fillPhone(String phoneNumber) throws InterruptedException{
		
		waitForElementByxpath(".//input[@id='phone']").sendKeys(phoneNumber);
		Thread.sleep(1000);
	}
	
    public void fillEmail(String email) throws InterruptedException{
		
		waitForElementByxpath(".//input[@id='email']").sendKeys(email);
		Thread.sleep(1000);
	}
    
    public void selectRole(String role) throws InterruptedException{
		
		selectOptions(".//select[@id='role']",role);
		Thread.sleep(1000);
	}
    
    public void fillCompanyName(String companyName) throws InterruptedException{
		
		waitForElementByxpath(".//input[@id='company']").sendKeys(companyName);
		Thread.sleep(1000);
	}
	
    public void selectCategory(String category) throws InterruptedException{
		
		selectOptions(".//select[@id='category']",category);
		Thread.sleep(1000);
	}
    
    public void fillSubject(String subject) throws InterruptedException{
		
		waitForElementByxpath(".//input[@id='subject']").sendKeys(subject);
		Thread.sleep(1000);
	}
    
    public void fillMessage(String message) throws InterruptedException{
    	
    	waitForElementByxpath(".//textarea[@id='message']").sendKeys(message);
    	Thread.sleep(1000);
    }

    public void fillVerifyfield(String verifyCode) throws InterruptedException{
    	
    	waitForElementByxpath(".//input[@id='verify']").sendKeys(verifyCode);
    	Thread.sleep(1000);
    }
    
    public void clickSubmit() throws InterruptedException{
    	
    	waitForElementByxpath(".//button[text()='SUBMIT FORM']").click();
    	Thread.sleep(1000);
    	
    }
    
    public String getVerifyErrorMessage(){
    	
    	return waitForElementByxpath(".//label[@id='verify-error']").getText();
    }
}
