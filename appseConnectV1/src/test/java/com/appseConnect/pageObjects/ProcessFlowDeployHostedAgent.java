package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessFlowDeployHostedAgent 

{

	//Creating the Driver Object local Driver
		WebDriver ldriver;
		
		
		//Constructor
		//Remote Driver as a Parameter of Constructor ProcessFlowListingPage
		public ProcessFlowDeployHostedAgent(WebDriver rdriver)
		{
			//Initiate the driver
			ldriver = rdriver;
			
			//Specifying the Page Factory Class
			PageFactory.initElements(rdriver, this);
			
		}
	
		//Finding the elements of the ProcessFlow Deploy
		
		//Deploy Button on ProcessFlow Designer Page
		@FindBy(xpath="//button[@id='deployButton' and @title='Deploy workflow']")
		WebElement btnDeploy;
		
		//Hosted Radio button in Deployment Wizard Select Environment section
		@FindBy(xpath="//input[@type='radio' and @id='rdCloud' and @name='radioEnv']")
		WebElement radiobtnHosted;
		
		//Choose Environment Dropdown
		@FindBy(xpath="//select[@class='form-select' and @id='drpEnv']")
		WebElement dropdownEnv;
		
		//Next Button
		@FindBy(xpath="//button[@id='envNext' and text()='Next' and @class='btn btn-default blue btn-primary']")
		WebElement btnEnvNext;

}
