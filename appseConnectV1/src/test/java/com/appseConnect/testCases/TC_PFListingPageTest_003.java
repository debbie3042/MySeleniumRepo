package com.appseConnect.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.pageObjects.ProcessFlowListingPage;

public class TC_PFListingPageTest_003 extends BaseClass
{
	
	@Test
	public void checkPFListingPage() throws InterruptedException, IOException
	{
		
		LoginPage lp = new LoginPage(driver);
		
		//Provide the Username by reading the Parameter from Base Class and calling the Method from LoginPage PageObject
		lp.setUserName(Username);
		
		logger.info("Provided Username: " + Username);
		
		//Provide the Password by reading the Parameter from Base Class and calling the Method from LoginPage PageObject
		lp.setPassword(Password);
		
		logger.info("Provided Password: " + Password);
		
		//Click on the SignIn Button by reading the Parameter from Base Class and calling the Method from LoginPage PageObject
		lp.clickSignIn();
		
		logger.info("Clicked on the Sign in button");
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		logger.info("Waited for 3 Seconds");
		
		ProcessFlowListingPage pfListingPage = new ProcessFlowListingPage(driver);
		
		//Click on the Designer option in Menu by calling the Method from ProcessFlowListingPage PageObject
		pfListingPage.clickMenuDesigner();
		
		logger.info("Clicked on the Designer option in Menu");
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		//Click on the ProcessFlow option in Menu by calling the Method from ProcessFlowListingPage PageObject
		pfListingPage.clickMenuProcessFlow();
		
		logger.info("Clicked on the ProcessFlow option in Menu");
		
		Thread.sleep(3000);
		
		logger.info("Waited for 3 Seconds");
		
		//Boolean value to store the output of Method 'isPresentTitleProcessFlows' defined in ProcessFlowListingPage PageObject
		boolean resTitlePf = pfListingPage.isPresentTitleProcessFlows();
		
		logger.info("The value returned from Method isPresentTitleProcessFlows is: " + resTitlePf);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		//Boolean value to store the output of Method 'isPresentFolderHeadingProcessFlow' defined in ProcessFlowListingPage PageObject
		boolean resFolHeadPf = pfListingPage.isPresentFolderHeadingProcessFlow();
		
		logger.info("The value returned from Method isPresentFolderHeadingProcessFlow is: " + resFolHeadPf);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		//Boolean value to store the output of Method 'isPresentFolderNameProcessFlow' defined in ProcessFlowListingPage PageObject
		boolean resFolNamePf = pfListingPage.isPresentFolderNameProcessFlow();
		
		logger.info("The value returned from Method isPresentFolderNameProcessFlow is: " + resFolNamePf);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		//Boolean value to store the output of Method 'isPresentTextNoPfFound' defined in ProcessFlowListingPage PageObject
		boolean resTextNoPfFound = pfListingPage.isPresentTextNoPfFound();
		
		logger.info("The value returned from Method isPresentTextNoPfFound is: " + resTextNoPfFound);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		
		//Boolean value to store the output of Method 'isPresentBtnCreateAPf' defined in ProcessFlowListingPage PageObject
		boolean resButtonCreateAPf = pfListingPage.isPresentBtnCreateAPf();
		
		logger.info("The value returned from Method isPresentBtnCreateAPf is: " + resButtonCreateAPf);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		
		//Boolean value to store the output of Method 'isPresentFolderNameInstalledPf' defined in ProcessFlowListingPage PageObject
		boolean resFolNameInstalledPf = pfListingPage.isPresentFolderNameInstalledPf();
		
		logger.info("The value returned from Method isPresentFolderNameInstalledPf is: " + resFolNameInstalledPf);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		
		//Boolean value to store the output of Method 'isPresentFolderNamePackageLib' defined in ProcessFlowListingPage PageObject
		boolean resFolNamePackageLib = pfListingPage.isPresentFolderNamePackageLib();
		
		logger.info("The value returned from Method isPresentFolderNamePackageLib is: " + resFolNamePackageLib);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
				
		//Boolean value to store the output of Method 'isPresentFolderNameTrash' defined in ProcessFlowListingPage PageObject
		boolean resFolNameTrash = pfListingPage.isPresentFolderNameTrash();
		
		logger.info("The value returned from Method isPresentFolderNameTrash is: " + resFolNameTrash);
		
		Thread.sleep(3000);

		logger.info("Waited for 3 Seconds");
		
		logger.info("Validation Started....");
		
		//Checking that the Title text 'ProcessFlows' is present in the ProcessFlow Listing Page.
		if(resTitlePf == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("The Assertion is True and the Title text 'ProcessFlows' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);
			
			logger.info("The Assertion is False and the Title text 'ProcessFlows' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		
		//Checking that the Folder Heading 'Process Flow' is present in the ProcessFlow Listing Page.
		if(resFolHeadPf == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("The Assertion is True and the Folder Heading 'Process Flow' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);
			
			logger.info("The Assertion is False and the Folder Heading 'Process Flow' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		
		
		//Checking that the Folder named 'Process Flow' is present in the ProcessFlow Listing Page.
		if(resFolNamePf == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("The Assertion is True and the Folder named 'Process Flow' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);
			
			logger.info("The Assertion is False and the Folder named 'Process Flow' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		
		
		//Checking that the Text 'No Process Flow found' is displayed for the main Process Flow Folder.
		if(resTextNoPfFound == true)
		{
			
			Assert.assertTrue(true);
			
			logger.info("The Assertion is True and the text 'No Process Flow found' is displayed for the main Process Flow Folder.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);
			
			logger.info("The Assertion is False and the text 'No Process Flow found' is NOT displayed for the main Process Flow Folder.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		
		
		//Checking that the Button 'Create a Process Flow' is displayed for the main Process Flow Folder.
		if(resButtonCreateAPf == true)
		{

			Assert.assertTrue(true);

			logger.info("The Assertion is True and the Button 'Create a Process Flow' is displayed for the main Process Flow Folder.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}

		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);

			logger.info("The Assertion is False and the Button 'Create a Process Flow' is NOT displayed for the main Process Flow Folder.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		
		
		//Checking that the Folder named 'Installed Process Flow' is present in the ProcessFlow Listing Page.
		if(resFolNameInstalledPf == true)
		{

			Assert.assertTrue(true);

			logger.info("The Assertion is True and the Folder named 'Installed Process Flow' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}

		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);

			logger.info("The Assertion is False and the Folder named 'Installed Process Flow' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
				
				
				
		//Checking that the Folder named 'Package Library' is present in the ProcessFlow Listing Page.
		if(resFolNamePackageLib == true)
		{

			Assert.assertTrue(true);

			logger.info("The Assertion is True and the Folder named 'Package Library' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}

		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);

			logger.info("The Assertion is False and the Folder named 'Package Library' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
				
				
				
		//Checking that the Folder named 'Trash' is present in the ProcessFlow Listing Page.
		if(resFolNameTrash == true)
		{

			Assert.assertTrue(true);

			logger.info("The Assertion is True and the Folder named 'Trash' is present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}

		else
		{
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "PFListingPageTest");
			
			Assert.assertTrue(false);

			logger.info("The Assertion is False and the Folder named 'Trash' is NOT present in the ProcessFlow Listing Page.");
			
			Thread.sleep(3000);
			logger.info("Waited for 3 Seconds");
		}
		
		lp.clickLogOut();
		logger.info("The Log Out button has been clicked.");
		
		Thread.sleep(5000);
		logger.info("Waited for 5 Seconds");
		
	}

}
