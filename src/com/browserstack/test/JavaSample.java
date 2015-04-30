package com.browserstack.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaSample {
	
	public static final String USERNAME = "markcorrigan";
	public static final String AUTOMATE_KEY = "Ydq6uqNLnmJJiJZypqOv";
	public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("start running the test");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "7");		
		caps.setCapability("browser", "IE");
		caps.setCapability("browser_version", "10.0");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("browserstack.debug", "true");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
		
		
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("BrowserStack");
		element.submit();
		
		System.out.println(driver.getTitle());
		
		System.out.println("test is done");
		driver.quit();
	}

}
