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
		}
		
		
		else
		{
			logger.info("The Assertion is False and the New Customer could not be created successfully.");
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "TC_NewCustomerSignUpTest_005");
			
			Assert.assertTrue(false);	
		}
		
		
		//Opening a new Tab in Chrome
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		//logger.info("New Chrome tab has been opened.");
		
		//Switching to the new Tab
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1));
		
		
		//Opening Yopmail.com
		driver.navigate().to("https://yopmail.com/en/");
		System.out.println("Navigated to yopmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your inbox here' and @id='login' and @name='login']")).sendKeys(newcustemail);
		System.out.println("Email provided in yopmail.com: "+ newcustemail);
		
		driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		System.out.println("Clicked after providing the email in yopmail.com");
		
		Thread.sleep(5000);
		System.out.println("Waited for 5 seconds");
		
		//Switching to the iframe
		driver.switchTo().frame("ifinbox");
		
		driver.findElement(By.xpath("//button[@class='lm']/div/span[text()='APPSeCONNECT']//ancestor::button[@class='lm']")).click();
		System.out.println("Clicked on the email in the left");
		
		//After completing the operation inside the iframe, again returning back to the main window
		driver.switchTo().defaultContent();
		
		//Switching to the other iframe
		driver.switchTo().frame("ifmail");
		
		String usermaildata = driver.findElement(By.xpath("//strong/strong[1]")).getText();
		System.out.println("The User Email is: "+ usermaildata);
		
		String userpwddata = driver.findElement(By.xpath("//strong/strong[2]")).getText();
		System.out.println("The User Password is: "+ userpwddata);
		
		String urltext = driver.findElement(By.partialLinkText("activationCode")).getText();
		System.out.println("The url Text is: "+ urltext);
		
		String qmark = "?";
		
		String amark = "&";
		
		String actcode = StringUtils.substringBetween(urltext, qmark, amark);
		System.out.println("The Activation Code is: " + actcode);
		
		String usid = StringUtils.substringAfter(urltext, amark);
		System.out.println("The User Id is: " + usid);
		
		String pwdurl = "http://devportal.insync.pro/Account/SetPassword?userMail="+usermaildata+"&tempSecret="+userpwddata+actcode+usid;
		System.out.println("The Password Page URL is: " + pwdurl);
		
		//Commented text
		//System.out.println("The URL is: " + "http://devportal.insync.pro/Account/SetPassword?userMail="+usermaildata+"&tempSecret="+userpwddata+actcode+usid);
		
	}


}
