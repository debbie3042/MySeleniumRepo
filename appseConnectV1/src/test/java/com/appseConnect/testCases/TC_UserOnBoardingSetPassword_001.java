package com.appseConnect.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.UserOnBoardingSetPasswordPage;

public class TC_UserOnBoardingSetPassword_001 extends BaseClass
{
	@Test
	public void setPasswordAllElementsPresent() throws IOException
	{
		//driver.get("https://devportal.insync.pro/Account/SetPassword?userMail=SYBxNDuu@yopmail.com&tempSecret=opHZddivGEqsTSXILJtL6g&activationCode=wnbZBC9_1EKFObZ6ww1Mog&userId=Xov3WczqZkWHKfkcsMdWjQ");
		driver.get(onBoardUrl);

		UserOnBoardingSetPasswordPage setpassword = new UserOnBoardingSetPasswordPage(driver);

		//Verifying that the AEC Logo is present in the Set Password Page
		boolean bool1 = setpassword.checkImgLogoAEC();

		if(bool1 == true)
		{
			Assert.assertTrue(true);
			logger.info("The AEC Logo Image is present in the Set Password Page.");
		}

		else
		{
			logger.info("The AEC Logo Image is NOT present in the Set Password Page.");
			captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");

			Assert.assertFalse(false);
		}
		
		//Verifying that "Welcome to APPSeCONNECT" text is present in the Set Password Page
		boolean bool2 = setpassword.checkTxtWelcomeToAEC();
		
		if(bool2 == true)
		{
			Assert.assertTrue(true);
			
			logger.info("The Welcome to APPSeCONNECT text is present in the Set Password Page");
		}
		
		else
		{
			logger.info("The Welcome to APPSeCONNECT text is NOT present in the Set Password Page");
			captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
			
			Assert.assertFalse(false);
		}
		
		
		//Verifying that "Explore the World of Business Process Automation" Text is present in the Set Password Page
				boolean bool3 = setpassword.checkTxtExploreBPA();
				
				if(bool3 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Explore the World of Business Process Automation Text is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Explore the World of Business Process Automation Text is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that "Explore the World of Business Process Automation" Text is present in the Set Password Page
				boolean bool4 = setpassword.checkTxtSetPassword();
				
				if(bool4 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Form Header Text Set Password is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Form Header Text Set Password is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that "Have questions?" Text is present in the Set Password Page
				boolean bool5 = setpassword.checkTxtHaveQuestions();
				
				if(bool5 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Have questions? Text is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Have questions? Text is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that "Help Center" Text is present in the Set Password Page
				boolean bool6 = setpassword.checkTxtHelpCenter();
				
				if(bool6 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Help Center Text is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Help Center Text is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Label Password is present in the Set Password Page
				boolean bool7 = setpassword.checkLblPassword();
				
				if(bool7 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Label Password is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Label Password is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Textbox Password is present in the Set Password Page
				boolean bool8 = setpassword.checkTxtboxPassword();
				
				if(bool8 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Textbox Password is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Textbox Password is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Text for the Password Format is present in the Set Password Page
				boolean bool9 = setpassword.checkTxtPasswordFormatInfo();
				
				if(bool9 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Text for the Password Format is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Text for the Password Format is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Label Confirm Password is present in the Set Password Page
				boolean bool10 = setpassword.checkLblConfirmPassword();
				
				if(bool10 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Label Confirm Password is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Label Confirm Password is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Textbox Confirm Password is present in the Set Password Page
				boolean bool11 = setpassword.checkTxtboxConfirmPassword();
				
				if(bool11 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Textbox Confirm Password is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Textbox Confirm Password is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Checkbox I Agree is present in the Set Password Page
				boolean bool12 = setpassword.checkChkboxIAgree();
				
				if(bool12 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Checkbox I Agree is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Checkbox I Agree is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				/*
				//Verifying that the Text I Agree With is present in the Set Password Page
				boolean bool13 = setpassword.checkTxtIAgreeWith();
				
				if(bool13 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Text I Agree With is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Text I Agree With is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				*/
				
				//Verifying that the Link Terms And Conditions is present in the Set Password Page
				boolean bool14 = setpassword.checkLnkTermsAndConditions();
				
				if(bool14 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Link Terms And Conditions is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Link Terms And Conditions is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				/*
				//Verifying that the Text And is present in the Set Password Page
				boolean bool15 = setpassword.checkTxtAnd();
				
				if(bool15 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Text And is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Text And is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				*/
				
				//Verifying that the Link Privacy Policy is present in the Set Password Page
				boolean bool16 = setpassword.checkLnkPrivacyPolicy();
				
				if(bool16 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Link Privacy Policy is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Link Privacy Policy is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Button Change and Proceed is present in the Set Password Page
				boolean bool17 = setpassword.checkBtnChangeProceed();
				
				if(bool17 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Button Change and Proceed is present in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Button Change and Proceed is NOT present in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}
				
				
				//Verifying that the Text of the Button is Change and Proceed in the Set Password Page
				boolean bool18 = setpassword.checkTxtChangeProceedBtn();
				
				if(bool18 == true)
				{
					Assert.assertTrue(true);
					
					logger.info("The Text of the Button is Change and Proceed in the Set Password Page.");
				}
				
				else
				{
					logger.info("The Text of the Button is NOT Change and Proceed in the Set Password Page.");
					captureScreenshot(driver, "TC_UserOnBoardingSetPassword_001");
					
					Assert.assertFalse(false);
				}


	}

}
