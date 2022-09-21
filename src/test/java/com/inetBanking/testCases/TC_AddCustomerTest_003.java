package com.inetBanking.testCases;

import java.io.IOException;


import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;



public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username provided");
		lp.setPassword(password);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(5000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		logger.info("Providing customer details...");
		
		addcust.clickAddNewCustomer();
		
		addcust.custName("Kamal");
		addcust.custGender("male");
		addcust.custdob("07","10","1994");
		Thread.sleep(3000);
		addcust.custAddress("Baku");
		addcust.custcity("Baku");
		addcust.custstate("Baku");
		addcust.custPIN("11024562");
		addcust.custtelephonenumber("6565645");
		String email=randomestring()+"@gmail.com";
		
		addcust.custemail(email);
		addcust.custsubmit();
		Thread.sleep(3000);
		
		logger.info("Validation started");
		
		boolean res=driver.getPageSource().contains("Connection failed");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Testcase passed");
			
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Testcase failed");
		}
	}
	

}
