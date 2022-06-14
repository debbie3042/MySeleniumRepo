package com.appseConnect.testCases;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.pageObjects.ProcessFlowListingPage;

public class TC_PFDeployTest_004 extends BaseClass

{

	public void checkPFDeployment() throws InterruptedException
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
		
		//ProcessFlowDeploy pfDeploy = new ProcessFlowListingPage(driver);
	}

}
