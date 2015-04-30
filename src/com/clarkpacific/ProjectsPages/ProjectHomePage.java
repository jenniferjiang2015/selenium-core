package com.clarkpacific.ProjectsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.clarkpacific.home.HomePage;

public class ProjectHomePage extends HomePage{

	public ProjectHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	
	public void selectEachMarket() throws InterruptedException{
		
		List<WebElement> allOptionElements = getAllMarketElements();
		
		for(WebElement market:allOptionElements){
			
			String marketLable = market.getText();
			
			market.click();
			
			Thread.sleep(500);
			
			clickSearchButton();
			
			Thread.sleep(1000);
			
			int images = getAllImageLinks();
			
			 System.out.println("There are: "+images+" images on the page of "+marketLable);
			 Reporter.log("There are: "+images+" images on the page of "+marketLable);	 
			 
		}
	}
	
	public void clickOnAllImages() throws InterruptedException{
		
		List<WebElement> allOptionElements = getAllMarketElements();
		
		int allOptions = allOptionElements.size();
		
		for(int i=0;i<allOptions;i++){
			
			List<WebElement> allOptionEles = getAllMarketElements();
			
			allOptionEles.get(i).click();
			
			Thread.sleep(500);
			
			clickSearchButton();
			
			Thread.sleep(1000);
			
			clickAllImageLinks(i);
			
			System.out.println("this is "+i+"th market option");
		}
		
	}
	
	private void clickAllImageLinks(int a) throws InterruptedException{
		
		List<WebElement> allImageElements = getAllImgeElements();
		
		int imageNumber = allImageElements.size();
		
		for(int i=0;i<imageNumber;i++){
			
			List<WebElement> allImageEles = getAllImgeElements();
			String imageName = allImageEles.get(i).findElement(By.cssSelector("div.project-result-content")).getText();
			
			allImageEles.get(i).click();
			
			Thread.sleep(1000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			List<WebElement> allOptionElements = getAllMarketElements();
			
			allOptionElements.get(a).click();
			Thread.sleep(1000);
			clickSearchButton();
			
			Thread.sleep(1500);
			
			System.out.println("this is "+i+"th image, and its name is "+imageName);
		}
	}
	
	
	
	private int getAllImageLinks() throws InterruptedException{
		
		List<WebElement> allImageElements = getAllImgeElements();
		int imageSize = allImageElements.size();
		for(int i=0;i<imageSize;i++){
			
			String imageName = allImageElements.get(i).findElement(By.cssSelector("div.project-result-content")).getText();
			System.out.println("the image name is: "+imageName);	
			
		}
		
		
	    return imageSize;
	}
	
	private List<WebElement> getAllImgeElements(){
		
		return waitForElementBycss("div.col-md-10").findElements(By.cssSelector("a[href*='/project']"));	
		
	}	
	
	private void clickSearchButton(){
		
		waitForElementBycss("button#btn-search").click();
	}
	
	private List<WebElement> getAllMarketElements(){
		
		element = waitForElementBycss("select[name=Market]");
		Select allMarkets = new Select(element);
		
		List<WebElement> allOptionElements = allMarkets.getOptions();		
		
		System.out.println(allOptionElements.size());
		
		return allOptionElements;
	}

}
