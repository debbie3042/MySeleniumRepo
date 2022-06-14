package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessFlowDeploy 

{

	//Creating the Driver Object local Driver
		WebDriver ldriver;
		
		
		//Constructor
		//Remote Driver as a Parameter of Constructor ProcessFlowListingPage
		public ProcessFlowDeploy(WebDriver rdriver)
		{
			//Initiate the driver
			ldriver = rdriver;
			
			//Specifying the Page Factory Class
			PageFactory.initElements(rdriver, this);
			
		}
	
		//Finding the elements of the ProcessFlow Deploy
		
		@FindBy(xpath="//button[@id='deployButton' and @title='Deploy workflow']")
		WebElement btnDeploy;
		
		@FindBy(xpath="//input[@type='radio' and @id='rdCloud' and @name='radioEnv']")
		WebElement radiobtnHosted;
		
		@FindBy(xpath="//select[@class='form-select' and @id='drpEnv']")
		WebElement dropdownEnv;

}
