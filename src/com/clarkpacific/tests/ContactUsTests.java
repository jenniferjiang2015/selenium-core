package com.clarkpacific.tests;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.clarkpacific.contactUs.UserFillContactForm;


public class ContactUsTests extends TestCase{
	
	@Test(dataProvider="contactFormTestData")
	public void contactFormTest(String fullName,String phoneNumber,String email,String role,String companyName,String category,String subject,String message,String verifyCode) throws InterruptedException{
		System.out.println("this is a test");
		
		UserFillContactForm userFillContactForm = new UserFillContactForm(driver,wait);
		
		userFillContactForm.submitContactForm(fullName, phoneNumber, email, role, companyName, category, subject, message, verifyCode);
	
	    Reporter.log("this is just a test.............");
	}
	
	@DataProvider
	public Object[][] contactFormTestData(){
		
		Object[][] data = {{"jennifer test","4162484868","test.test@stjoseph.com","Engineer","ABC company","Education/Lunchbox Seminars","SubjectTESTE","on message textarea: this is a test!","AB12CD"},
				
		                   };
		
		return data;
	}
	
	

}
