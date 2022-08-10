package com.appseConnect.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserOnBoardingSetPasswordPage 
{

	//Creating the Driver Object local Driver
	WebDriver ldriver;

	//Creating the Constructor
	//Remote Driver as a Parameter of Constructor SignUpPage
	public UserOnBoardingSetPasswordPage(WebDriver rdriver)
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	//Finding the elements of the User OnBoarding Set Password Page

	//APPSeCONNECT Logo
	@FindBy(xpath="//img[@alt='Appseconnect' and @class='onboarding-login-logo login-6 mb-10']")
	WebElement imgLogoAEC;


	//"Welcome to APPSeCONNECT" Text
	@FindBy(xpath="//h1[text()='Welcome to APPSeCONNECT']")
	WebElement txtWelcomeToAEC;


	//"Explore the World of Business Process Automation" Text
	@FindBy(xpath="//p[text()='Explore the World of Business Process Automation']")
	WebElement txtExploreBPA;


	//"Set Password" Text
	@FindBy(xpath="//h1[text()='Set Password']")
	WebElement txtSetPassword;


	//"Have questions" Text
	@FindBy(xpath="//span[text()='Have questions? Visit ']")
	WebElement txtHaveQuestions;


	//"Help Center" Text
	@FindBy(xpath="//a[text()='Help Center']")
	WebElement txtHelpCenter;


	//Password Label above Password Textbox
	@FindBy(xpath="//label[text()='Password']")
	WebElement lblPassword;


	//Password Textbox
	@FindBy(xpath="//input[@placeholder='Set Password' and @id='newPassword' and @type='password']")
	WebElement txtboxPassword;

	//Password Format Info Text
	@FindBy(xpath="//div[text()='Use at least 8 characters with Uppercase and Lowercase letters; Numbers & Symbols']")
	WebElement txtPasswordFormatInfo;


	//Confirm Password Label above Confirm Password Textbox
	@FindBy(xpath="//label[text()='Confirm Password']")
	WebElement lblConfirmPassword;


	//Confirm Password Textbox
	@FindBy(xpath="//input[@id='confirmPassword' and @placeholder='Confirm Password' and @type='password']")
	WebElement txtboxConfirmPassword;

	//Checkbox for I agree
	@FindBy(xpath="//input[@id='chk-toc' and @type='checkbox' and @name='toc' and @class='form-check-input']")
	WebElement chkboxIAgree;


	//"I agree with" Text
	@FindBy(xpath="//div[@class='fv-row mb-10 fv-plugins-icon-container fv-plugins-bootstrap5-row-invalid']/div/label/text()[1]")
	WebElement txtIAgreeWith;


	//"Terms and Conditions" Link
	@FindBy(xpath="//a[text()='Terms and Conditions' and @href='https://www.appseconnect.com/terms-of-use/']")
	WebElement lnkTermsAndConditions;


	//"And" Text
	@FindBy(xpath="//div[@class='fv-row mb-10 fv-plugins-icon-container fv-plugins-bootstrap5-row-invalid']/div/label/text()[2]")
	WebElement txtAnd;


	//"Privacy Policy" Link
	@FindBy(xpath="//a[text()='Privacy Policy' and @href='https://www.appseconnect.com/privacy-policy/']")
	WebElement lnkPrivacyPolicy;

	//Change and Proceed Button
	@FindBy(xpath="//button[@id='kt_new_password_submit' and @type='button']")
	WebElement btnChangeProceed;

	//Change and Proceed Button Text
	@FindBy(xpath="//span[text()='Change and Proceed']")
	WebElement txtChangeProceedBtn;


	//Action Methods for the Elements defined above

	//Method for Checking that the APPSeCONNECT Logo is displayed
	public boolean checkImgLogoAEC()
	{
		if (imgLogoAEC.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "Welcome to APPSeCONNECT" Text is displayed
	public boolean checkTxtWelcomeToAEC()
	{
		if (txtWelcomeToAEC.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}

	//Method for Checking that the "Explore the World of Business Process Automation" Text is displayed
	public boolean checkTxtExploreBPA()
	{
		if (txtExploreBPA.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}

	//Method for Checking that the "Set Password" Text is displayed
	public boolean checkTxtSetPassword()
	{
		if (txtSetPassword.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "Have questions" Text is displayed
	public boolean checkTxtHaveQuestions()
	{
		if (txtHaveQuestions.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "Help Center" Text is displayed
	public boolean checkTxtHelpCenter()
	{
		if (txtHelpCenter.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Password Label above Password Textbox is displayed
	public boolean checkLblPassword()
	{
		if (lblPassword.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Password Textbox is displayed
	public boolean checkTxtboxPassword()
	{
		if (txtboxPassword.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Password Format Info Text is displayed
	public boolean checkTxtPasswordFormatInfo()
	{
		if (txtPasswordFormatInfo.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Confirm Password Label above Confirm Password Textbox is displayed
	public boolean checkLblConfirmPassword()
	{
		if (lblConfirmPassword.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}



	//Method for Checking that the Confirm Password Textbox is displayed
	public boolean checkTxtboxConfirmPassword()
	{
		if (txtboxConfirmPassword.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Checkbox for I agree is displayed
	public boolean checkChkboxIAgree()
	{
		if (chkboxIAgree.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "I agree with" Text is displayed
	public boolean checkTxtIAgreeWith()
	{
		if (txtIAgreeWith.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "Terms and Conditions" Link is displayed
	public boolean checkLnkTermsAndConditions()
	{
		if (lnkTermsAndConditions.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the "And" Text is displayed
	public boolean checkTxtAnd()
	{
		if (txtAnd.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}



	//Method for Checking that the "Privacy Policy" Link is displayed
	public boolean checkLnkPrivacyPolicy()
	{
		if (lnkPrivacyPolicy.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


	//Method for Checking that the Change and Proceed Button is displayed
	public boolean checkBtnChangeProceed()
	{
		if (btnChangeProceed.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}



	//Method for Checking that the Change and Proceed Button Text is displayed
	public boolean checkTxtChangeProceedBtn()
	{
		if (txtChangeProceedBtn.isDisplayed())
		{
			return true;
		}

		else 
		{
			return false;
		}
	}


}
