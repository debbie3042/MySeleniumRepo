package com.appseConnect.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage 
{
	
	//Creating the Driver Object local Driver
	WebDriver ldriver;
	
	//Creating the Constructor
	//Remote Driver as a Parameter of Constructor SignUpPage
	public SignUpPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//Finding the elements of the Sign Up Page
	
	//Name field of New User Sign Up Page
	@FindBy(id="txtCustName")
	WebElement txtNewCustName;
		
	//Company field of New User Sign Up Page
	@FindBy(id="txtOrgName")
	WebElement txtNewCustOrgName;

	//Email Address field of New User Sign Up Page
	@FindBy(id="txtOrgEmail")
	WebElement txtNewCustEmail;
	
	//Country Dropdown of New User Sign Up Page
	@FindBy(id="drpCountry")
	WebElement drpdwnCountry;
	
	//Get Started Button of New User Sign Up Page
	@FindBy(id="GetStarted")
	WebElement btnNewCustSignUp;
	
	//Awesome! Text after clicking on Get Started button
	@FindBy(xpath="//h1[text()='Awesome!']")
	WebElement txtAwesome;
	
	//Back to login Text after clicking on Get Started button
	@FindBy(xpath="//button[text()='  Back to login ']")
	WebElement txtBackToLogin;
	
	
	//Action Methods for the Elements defined above
	
	//Method for providing the Name of New Customer in SignUp Page
	public void setNewCustName(String custname)
	{
		txtNewCustName.sendKeys(custname);
	}
		
		
	//Method for providing the Org Name of New Customer in SignUp Page
	public void setNewCustOrgName(String custorgname)
	{
		txtNewCustOrgName.sendKeys(custorgname);
	}
	
	
	//Method for providing the Email of New Customer in SignUp Page
	public void setNewCustEmail(String custemail)
	{
		txtNewCustEmail.sendKeys(custemail);
	}
		
	
	//Method for providing the Country of New Customer in SignUp Page
	public void setNewCustCountry()
	{
		//Declaring the dropdown element Country as an instance of the Select class
		Select drpNewCustCountry = new Select(drpdwnCountry);
		drpNewCustCountry.selectByValue("FR");
	}
	
		
	//Method for clicking on the Get Started Button in SignUp Page
	public void clickNewCustSignUp()
	{
		btnNewCustSignUp.click();
	}
	
	
	//Method for Checking that the text Awesome is displayed after clicking on the Sign up Button
	public boolean checkTextAwesome()
	{
		if (txtAwesome.isDisplayed())
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	
	//Method for Checking that the "Back to Login" button is displayed after clicking on the Sign up Button
	public boolean checkTextBackToLogin()
	{
		if (txtBackToLogin.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}
	

}
