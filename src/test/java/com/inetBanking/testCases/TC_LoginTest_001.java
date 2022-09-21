package com.inetBanking.testCases;



import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;





public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		
		
		if (driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
			
		}
		else
		{
			captureScreen(driver, "logintest");
			
			Assert.assertTrue(false);
			logger.info("Test failed");
		}
	}

}
