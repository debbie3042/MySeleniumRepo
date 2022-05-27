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
	@FindBy(id="UserName")
	WebElement txtUserName;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement btnSignIn;
	
	@FindBy(xpath="(//img[@id='profilepic'])[1]")
	WebElement imgProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement linkLogOut;
	
	
	//Action Methods for the Elements defined above
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSignIn()
	{
		btnSignIn.click();
	}
	
	public void clickLogOut()
	{
		imgProfile.click();
		
		linkLogOut.click();
	}

}




