package com.clarkpacific.tests;

import org.testng.annotations.Test;

import com.clarkpacific.ProjectsPages.ProjectHomePage;
import com.clarkpacific.home.HomePage;

public class ProjectsSearchTest extends TestCase{
	
	ProjectHomePage projectHome;
	/*
	@Test
	public void searchByMarkets() throws InterruptedException{
		
		homePage = new HomePage(driver,wait);
		
		projectHome = homePage.getProjectHomePage();
		
		projectHome.selectEachMarket();
	}
	*/
	@Test//(dependsOnMethods = "searchByMarkets")
	public void clickOnAllImageLinks() throws InterruptedException{
		
        homePage = new HomePage(driver,wait);
		
		projectHome = homePage.getProjectHomePage();
		
		projectHome.clickOnAllImages();
	}

}
