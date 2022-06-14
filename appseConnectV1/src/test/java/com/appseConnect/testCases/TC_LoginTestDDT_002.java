package com.appseConnect.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginTestDDT(String username, String password) throws IOException, InterruptedException
	{
		//Creating an Object of LoginPage from PageObjects Package
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("The Username has been provided: " + username);
		
		lp.setPassword(password);
		logger.info("The Password has been provided: " + password);
		
		lp.clickSignIn();
		logger.info("The SignIn button has been clicked.");
		
		
		if ( isErrorMessagePresent() == true)
		{
			logger.info("The Error Message has been displayed");
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "TC_LoginTestDDT_002");
			
			logger.info("Screenshot Captured.");
			
			logger.info("The Assertion is False and the TC_LoginTestDDT_002 has Failed.");
			
			Thread.sleep(3000);
			
			logger.info("Waited for 3 seconds.");
			
			Assert.assertTrue(false);
			//logger.info("The Assertion is False and the TC_LoginTestDDT_002 has Failed.");
			
		}
		
		else
		{
			Assert.assertTrue(true);
			logger.info("The Assertion is True and the TC_LoginTestDDT_002 has Passed.");
			
			lp.clickLogOut();
			logger.info("The Log Out button has been clicked.");
			
			Thread.sleep(3000);

			logger.info("Waited for 3 seconds.");
			
		}
		
	}
	
	
	//Method to check Error Message is displayed on passing Invalid Credentials
	public boolean isErrorMessagePresent() throws IOException
	{
		
		try
		{
		
			WebElement errorMsg = driver.findElement(By.id("loginSpan"));

			String errorMsgText = errorMsg.getText();

			if(errorMsg.isDisplayed())
			{

				logger.info("The Error Message is: " + errorMsgText);

				
			}
			
			return true;
		}
		
		catch(Exception e)
		{
			
			
			System.out.println(e);
			
			return false;
		}
		
			
			/*String actualMsg = driver.findElement(By.id("loginSpan")).getText();
		
			String errorMsg1 = "The user name or password provided is incorrect.";
			
			String errorMsg2 = "Please enter a valid email address and password";
			
			String errorMsg3 = "Please enter the password for your APPSeCONNECT account";
		
			if(actualMsg.equals(errorMsg1))
				{
					logger.info("The Error Message is: " + actualMsg);
				}
		
			else if(actualMsg.equals(errorMsg2))
				{
					logger.info("The Error Message is: " + actualMsg);
				}
			
			else if(actualMsg.equals(errorMsg3))
			{
				logger.info("The Error Message is: " + actualMsg);
			}
			*/
			//return true;
		//}
		
		/*catch(Exception e)
		{
			
			
			System.out.println(e);
			
			return false;
		}
		*/
		
	}
	
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getLoginData() throws IOException
	{
		//Getting the File
		String path = System.getProperty("user.dir")+"/src/test/java/com/appseConnect/testData/LoginData.xlsx";
		
		//Getting the no of Rows
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		
		//Getting the no. of Cells
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);
		
		//Creating the 2 dim Array to store the data from the File
		String logindata[][] = new String[rownum][colnum];
		
		
		//For Loop to get the data from the 2 Dim Array
		for(int i = 1; i<=rownum; i++)
		{
			for(int j = 0; j<colnum; j++)
			{
				//As in the 2 Dim Array, we have to insert the row into 0 index, the 0 index cannot be left blank.
				//In the Excel, the data of row of index 0 is the file Header, which we are not considering
				//So the row of index 1 in the Excel File will be row of Index 0 in the Array
				//And the column of Index 0 in the Excel File will be row of Index 0 in the Array
				//Hence row i=1 in Excel File will be row i-1 in Array
				//And column j=0 in Excel File will be column j in Array
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return logindata;
	}

}
