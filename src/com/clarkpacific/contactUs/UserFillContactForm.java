package com.clarkpacific.contactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.clarkpacific.home.HomePage;
import com.clarkpacific.util.TestUtil;

public class UserFillContactForm extends TestUtil{
	
	public UserFillContactForm(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
		homePage = new HomePage(driver,wait);
	}

	public void submitContactForm(String fullName,String phoneNumber,String email,String role,String companyName,String category,String subject,String message,String verifyCode) throws InterruptedException{
		
		contactUsPage = homePage.getContactUsPage();
		contactUsPage.fillFullName(fullName);
		contactUsPage.fillPhone(phoneNumber);
		contactUsPage.fillEmail(email);
		contactUsPage.selectRole(role);
		contactUsPage.fillCompanyName(companyName);
		contactUsPage.selectCategory(category);
		contactUsPage.fillSubject(subject);
		contactUsPage.fillMessage(message);
		contactUsPage.fillVerifyfield(verifyCode);
		contactUsPage.clickSubmit();
		String error = contactUsPage.getVerifyErrorMessage();
		System.out.println(error);
	}

}
