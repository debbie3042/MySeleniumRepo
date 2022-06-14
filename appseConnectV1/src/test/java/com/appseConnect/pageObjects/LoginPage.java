package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Creating the Driver Object local Driver
	WebDriver ldriver;
	
	//Creating the Constructor
	//Remote Driver as a Parameter of Constructor LoginPage
	public LoginPage(WebDriver rdriver)
	{
		//Initiate the driver
		ldriver = rdriver;
		
		//Specifying the Page Factory Class
		PageFactory.initElements(rdriver, this);
	}
	
	//Finding the elements of the Login Page
	
	//Email Address Field
	@FindBy(id="UserName")
	WebElement txtUserName;
	
	//Password Field
	@FindBy(id="Password")
	WebElement txtPassword;
	
	//Sign In button
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement btnSignIn;
	
	//Profile Image after Login
	@FindBy(xpath="(//img[@id='profilepic'])[1]")
	WebElement imgProfile;
	
	//Logout Link after Login
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement linkLogOut;
	
	//Create an Account Link
	@FindBy(xpath="//a[text()=' Create an account ' and @title='Create an account' and @href='/Account/SignUp']")
	WebElement linkCreateAccount;
	
	
	
	//Action Methods for the Elements defined above
	
	//Method for providing the Username
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	
	//Method for providing the Password
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	//Method to click on the Sign In button
	public void clickSignIn()
	{
		btnSignIn.click();
	}
	
	
	//Method to click on the Logout Link
	public void clickLogOut()
	{
		imgProfile.click();
		
		linkLogOut.click();
	}
	
	
	//Method to click on the Create a New Account Link
	public void clickCreateAccount()
	{
		linkCreateAccount.click();
	}
	

}




