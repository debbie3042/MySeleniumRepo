package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProcessFlowListingPage 
{
	//Creating the Driver Object local Driver
	WebDriver ldriver;
	
	
	//Constructor
	//Remote Driver as a Parameter of Constructor ProcessFlowListingPage
	public ProcessFlowListingPage(WebDriver rdriver)
	{
		//Initiate the driver
		ldriver = rdriver;
		
		//Specifying the Page Factory Class
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//Finding the elements of the ProcessFlow Listing Page
	
	@FindBy(xpath="//span[contains(text(),'Designer')]")
	WebElement menuLinkDesigner;
	
	@FindBy(xpath="//span[contains(text(),'ProcessFlow')]")
	WebElement menuLinkProcessFlow;
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Terms of Use')]")
	WebElement lnkTermsOfUse;
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Privacy Policy')]")
	WebElement lnkPrivacyPolicy;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'ProcessFlows')]")
	WebElement titleProcessFlows;
	
	@FindBy(how = How.XPATH, using = "//span[@class='caption-subject' and @id='folderHeading' and contains(text(),'Process Flow')]")
	WebElement folderHeadingProcessFlow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Process Flow']")
	WebElement folderNameProcessFlow;
	
	@FindBy(xpath="//h2[contains(text(),'No Process Flow Found')]")
	WebElement txtNoProcessFlowFound;
	
	@FindBy(xpath="//a[contains(text(),'Create a Process Flow') and @title='Create a Process Flow']")
	WebElement btnCreateProcessFlow;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Installed Process Flow']")
	WebElement folderNameInstalledPF;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Package Library']")
	WebElement folderNamePackageLibrary;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Trash']")
	WebElement folderTrash;
	
	
	
	//Action Methods for the Elements defined above
	
	//Method to click on the Designer option in the Menu
	public void clickMenuDesigner()
	{
		menuLinkDesigner.click();
	}
	
	
	//Method to click on the ProcessFlow option in the Menu
	public void clickMenuProcessFlow()
	{
		menuLinkProcessFlow.click();
	}
	
	
	//Method to click on the "Terms of Use" Link at the bottom of the page
	public void clickTermsOfUse()
	{
		lnkTermsOfUse.click();
	}
	
	
	//Method to click on the "Privacy Policy" Link at the bottom of the page
	public void clickPrivacyPolicy()
	{
		lnkPrivacyPolicy.click();
	}
	
	
	//Method to click on the "Create a ProcessFlow" button of Main ProcessFlow Folder
	public void clickCreateAProcessFlow()
	{
		btnCreateProcessFlow.click();
	}
	
	
	
	//Method to check whether the Title "ProcessFlows" is displayed on the page
	public boolean isPresentTitleProcessFlows()
	{
		if(titleProcessFlows.isDisplayed())
		{
			
			System.out.println("Entered If Block of Method isPresentTitleProcessFlows, To be returned True");
			
			return true;
		}
		
		else 
		{
			System.out.println("Entered Else Block of Method isPresentTitleProcessFlows, To be returned False");
			
			return false;
		}
	}
	
	
	//Method to check whether the Folder Heading "Process Flow" is displayed on the right side of the page
	public boolean isPresentFolderHeadingProcessFlow()
	{
		if(folderHeadingProcessFlow.isDisplayed())
		{
			
			System.out.println("Entered If Block of Method isPresentFolderHeadingProcessFlow, To be returned True");
			
			return true;
		}
		
		else 
		{
			
			System.out.println("Entered Else Block of Method isPresentFolderHeadingProcessFlow, To be returned False");
			
			return false;
		}
	}
	
	
	//Method to check whether the Folder "Process Flow" is displayed on the page
	public boolean isPresentFolderNameProcessFlow()
	{
		if(folderNameProcessFlow.isDisplayed())
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	
	
	//Method to check whether the Text "No Process Flow Found" is displayed on the page	on the right side of Process Flow Folder
	public boolean isPresentTextNoPfFound()
	{
		if(txtNoProcessFlowFound.isDisplayed())
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	
	
	//Method to check whether the Botton "Create a Process Flow" is displayed on the page on the right side of Process Flow Folder
		public boolean isPresentBtnCreateAPf()
		{
			if(btnCreateProcessFlow.isDisplayed())
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		}
		
		
		
		//Method to check whether the Folder "Installed Process Flow" is displayed on the page
		public boolean isPresentFolderNameInstalledPf()
		{
			if(folderNameInstalledPF.isDisplayed())
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		}
		
		
		
		//Method to check whether the Folder "Package Library" is displayed on the page
		public boolean isPresentFolderNamePackageLib()
		{
			if(folderNamePackageLibrary.isDisplayed())
			{
				return true;
			}

			else 
			{
				return false;
			}
		}
		
		
		
		
		//Method to check whether the Folder "Trash" is displayed on the page
		public boolean isPresentFolderNameTrash()
		{
			if(folderTrash.isDisplayed())
			{
				return true;
			}

			else 
			{
				return false;
			}
		}

}
