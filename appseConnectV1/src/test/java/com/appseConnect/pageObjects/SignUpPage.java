package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	//Finding the elements of the Login Page
	
	//Name field of New User Sign Up Page
	@FindBy(id="txtCustName")
	WebElement txtNewCustName;
		
	//Company field of New User Sign Up Page
	@FindBy(id="txtOrgName")
	WebElement txtNewCustOrgName;

	//Email Address field of New User Sign Up Page
	@FindBy(id="txtOrgEmail")
	WebElement txtNewCustEmail;
	
	//Get Started Button of New User Sign Up Page
	@FindBy(id="GetStarted")
	WebElement btnNewCustSignUp;
	
	
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
		
		
		
	//Method for clicking on the Get Started 
	public void clickNewCustSignUp()
	{
		btnNewCustSignUp.click();
	}

}
