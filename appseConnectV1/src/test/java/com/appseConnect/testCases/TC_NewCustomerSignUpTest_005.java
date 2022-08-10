package com.appseConnect.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.pageObjects.SignUpPage;

public class TC_NewCustomerSignUpTest_005 extends BaseClass
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
		String newcustorgname = newcustname + " Corporation";
		
		
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
		
		
		//Selecting the Country
		//Declaring the dropdown element Country as an instance of the Select class
		Select drpdwnCountry = new Select(driver.findElement(By.id("drpCountry")));
		drpdwnCountry.selectByValue("FR");
		
		
		//Clicking on the Sign Up button
		signupnewcust.clickNewCustSignUp();
		logger.info("The Sign Up button has been clicked.");
		
		Thread.sleep(3000);
		
		logger.info("Validation Started after clicking on the Sign Up button.....");
		
		
		//Checking that the text Awesome is displayed after clicking on the Sign up Button
		boolean res = driver.findElement(By.xpath("//h1[text()='Awesome!']")).isDisplayed();
		
		
		//Checking that the "Back to Login" button is displayed after clicking on the Sign up Button
		boolean res2 = driver.findElement(By.xpath("//button[text()='  Back to login ']")).isDisplayed();
		
		
		//Verifying that both the text "Awesome" and the "Back to Login" Button are displayed
		if(res == true & res2 == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("Assertion is True and New Customer has been created successfully.");
			
			logger.info("The Email of the created Customer is: " + newcustemail);
		}
		
		
		else
		{
			logger.info("The Assertion is False and the New Customer could not be created successfully.");
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "TC_NewCustomerSignUpTest_005");
			
			Assert.assertTrue(false);
			
		}
		
	}

		
	
	

}
