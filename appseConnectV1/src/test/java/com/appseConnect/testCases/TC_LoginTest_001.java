package com.appseConnect.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		//driver.get(baseURL);
		//logger.info("The URL has been opened.");
		
		//Creating an Object of LoginPage from PageObjects Package
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(Username);
		logger.info("The Username has been provided.");
		
		lp.setPassword(Password);
		logger.info("The Password has been provided.");
		
		lp.clickSignIn();
		logger.info("The SignIn button has been clicked.");
		
		if(driver.getTitle().isEmpty())
		{
			Assert.assertTrue(true);
			logger.info("Assertion is True and Login Test has Passed.");
		}
		
		else
		{
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "loginTest");
			
			Assert.assertTrue(false);
			logger.info("Assertion is False and Login Test has Failed.");
			
		}
		
	}

}
