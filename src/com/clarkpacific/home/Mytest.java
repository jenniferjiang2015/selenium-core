package com.clarkpacific.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mytest {
	
	@Test
	public void test01(){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://clarkpacific.sjc.io/");
	}

}
