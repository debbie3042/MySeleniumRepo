package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestDataEmailPage 
{
	//Creating the Driver Object local Driver
	WebDriver ldriver;
	
	//Creating the Constructor
	//Remote Driver as a Parameter of Constructor SignUpPage
	public TestDataEmailPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//Finding the elements of the Yopmail Page
	
		//Email field of Yopmail Page
		@FindBy(xpath="//input[@placeholder='Enter your inbox here' and @id='login' and @name='login']")
		WebElement txtEmailBox;
		
		//Enter button of Email of Yopmail Page
		@FindBy(xpath="//i[@class='material-icons-outlined f36']")
		WebElement btnEmailEnter;
		
		//Left Iframe in Yopmail Page
		@FindBy(id="ifinbox")
		WebElement ifrmInbox;
		
		//APPSeCONNECT Email in Inbox of Yopmail Page
		@FindBy(xpath="//button[@class='lm']/div/span[text()='APPSeCONNECT']//ancestor::button[@class='lm']")
		WebElement emailAEC;
		
		//Right Iframe in Yopmail Page
		@FindBy(id="ifmail")
		WebElement ifrmEmail;
		
		//User Email data in the AEC Email in Yopmail
		@FindBy(xpath="//strong/strong[1]")
		WebElement dataUsrEmailAEC;
		
		//User Password data in the AEC Email in Yopmail
		@FindBy(xpath="//strong/strong[2]")
		WebElement dataUsrPwdAEC;
		
		
		//User Activation Code URL data in the AEC Email in Yopmail
		@FindBy(partialLinkText="activationCode")
		WebElement dataUsrActCodeUrlAEC;
		
		
		
		//Action Methods for the Elements defined above
		
		//Method for providing the Email in the Email Box in the Yopmail page
		public void setYopmailEmail(String custemail)
		{
			txtEmailBox.sendKeys(custemail);
		}
		
		
		//Method for clicking on the Enter button in the Yopmail Page
		public void clickYopmailEmailEnter()
		{
			btnEmailEnter.click();
		}
		
		
		//Method for switching to the left Iframe in the Yopmail Page
		//public void switchIframeInbox()
		//{
		//	ifrmInb
		//}
		
		
		//Method for clicking on AEC Email in the Email list in the Yopmail Inbox Page
		public void clickYopmailEmailAec()
		{
			emailAEC.click();
		}
		
		
		//Method for getting the Email data of the AEC Email in the Yopmail Inbox Page
		public String getTextYopmailEmailAec()
		{
			String emailtxt = dataUsrEmailAEC.getText();
			return emailtxt;
		}
		
		
		//Method for getting the Email data of the AEC Email in the Yopmail Inbox Page
		public String getTextYopmailPwdAec()
		{
			String pwdtxt = dataUsrPwdAEC.getText();
			return pwdtxt;
		}
		
		
		//Method for getting the Email data of the AEC Email in the Yopmail Inbox Page
		public String getTextYopmailActCodeUrlAec()
		{
			String actcodeurltxt = dataUsrActCodeUrlAEC.getText();
			return actcodeurltxt;
		}
		

}
