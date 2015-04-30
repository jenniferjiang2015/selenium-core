package com.clarkpacific.tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.clarkpacific.home.HomePage;

public class TestCase {
	
	WebDriver driver;
	WebDriverWait wait;
	HomePage homePage;
	
	@BeforeClass
	public void setUp(){
		//driver = new FirefoxDriver();
		driver = getIEDrvier();
		//driver = getChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,15);
		
	}
	
	@BeforeMethod
	public void beforeMethod(){
		driver.get("http://clarkpacific.sjc.io/");
		driver.manage().window().maximize();
	}
	
		
	@AfterMethod
	public void afterMethod(){
		
	}
	
	@AfterClass
	public void tearDown(){
		
		//driver.close();
		//driver.quit();
		
	}
	
	private WebDriver getIEDrvier(){
		
		File file = new File("C:/Users/Jennifer Jiang/QA/browserDriverServer/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}
	
	private WebDriver getChromeDriver(){
		File file = new File("C:/Users/Jennifer Jiang/QA/browserDriverServer/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
