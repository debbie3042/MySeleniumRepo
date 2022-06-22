package com.appseConnect.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.pageObjects.SignUpPage;
import com.appseConnect.pageObjects.TestDataEmailPage;

public class TC_OnBoardingUrlCreationTest_006 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.clickCreateAccount();
		
		Thread.sleep(3000);
		
		SignUpPage signupnewcust = new SignUpPage(driver);
		
		//Storing the random generated String in a Variable
		String newcustname = randomString();
		
		//Creating the Org Name from the random generated String
		String newcustorgname = newcustname + " Inc.";
		
		
		//Creating the email from the random Generated String
		String newcustemail = newcustname+"@yopmail.com";
		
		
		//Providing the New Customer Name
		signupnewcust.setNewCustName(newcustname);
		logger.info("The New Customer Name provided is: "+ newcustname);
		
		//Providing the New Customer Org Name
		signupnewcust.setNewCustOrgName(newcustorgname);
		logger.info("The New Customer Org Name provided is: "+ newcustorgname);
		
		//Providing the New Customer Email
		signupnewcust.setNewCustEmail(newcustemail);
		logger.info("The New Customer Email provided is: "+ newcustemail);
		
		
		signupnewcust.setNewCustCountry();
		logger.info("The New Customer Country selected is: France");
		
		
		//Clicking on the Sign Up button
		signupnewcust.clickNewCustSignUp();
		logger.info("The Sign Up button has been clicked.");
		
		Thread.sleep(3000);
		
		logger.info("Validation Started after clicking on the Sign Up button.....");
		
		
		Thread.sleep(5000);
		
		boolean res = signupnewcust.checkTextAwesome();
		
		
		boolean res2 = signupnewcust.checkTextBackToLogin();
		
		
		//Verifying that both the text "Awesome" and the "Back to Login" Button are displayed
		if(res == true & res2 == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("Assertion is True and New Customer has been created successfully.");
		}
		
		
		else
		{
			logger.info("The Assertion is False and the New Customer could not be created successfully.");
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "TC_NewCustomerSignUpTest_005");
			
			Assert.assertTrue(false);	
		}
		
		
		//Opening Yopmail.com
		driver.navigate().to("https://yopmail.com/en/");
		System.out.println("Navigated to yopmail.com");
		
		Thread.sleep(3000);
		
				
		TestDataEmailPage testdataemail = new TestDataEmailPage(driver);

		testdataemail.setYopmailEmail(newcustemail);
		System.out.println("Email provided in yopmail.com is: "+ newcustemail);
				
						
		testdataemail.clickYopmailEmailEnter();
		System.out.println("Clicked after providing the email in yopmail.com");


		Thread.sleep(2000);
		System.out.println("Waited for 2 seconds");

		//Switching to the iframe
		driver.switchTo().frame("ifinbox");
				
		
		testdataemail.clickYopmailEmailAec();
		System.out.println("Clicked on the email in the left");

		//After completing the operation inside the iframe, again returning back to the main window
		driver.switchTo().defaultContent();

		//Switching to the other iframe
		driver.switchTo().frame("ifmail");		
				
		String usermaildata = testdataemail.getTextYopmailEmailAec();
		System.out.println("The User Email is: "+ usermaildata);

		String userpwddata = testdataemail.getTextYopmailPwdAec();
		System.out.println("The User Password is: "+ userpwddata);

		String urltext = testdataemail.getTextYopmailActCodeUrlAec();
		System.out.println("The url Text is: "+ urltext);
				
		String qmark = "?";

		String amark = "&";

		String actcode = StringUtils.substringBetween(urltext, qmark, amark);
		System.out.println("The Activation Code is: " + actcode);

		String usid = StringUtils.substringAfter(urltext, amark);
		System.out.println("The User Id is: " + usid);

		String pwdurl = "https://devportal.insync.pro/Account/SetPassword?userMail="+usermaildata+"&tempSecret="+userpwddata+"&"+actcode+"&"+usid;
		System.out.println("The Password Page URL is: " + pwdurl);
				
				
				
	}


}
