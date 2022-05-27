package com.appseConnect.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.appseConnect.pageObjects.LoginPage;
import com.appseConnect.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginTestDDT(String username, String password) throws IOException
	{
		//Creating an Object of LoginPage from PageObjects Package
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("The Username has been provided.");
		
		lp.setPassword(password);
		logger.info("The Password has been provided.");
		
		lp.clickSignIn();
		logger.info("The SignIn button has been clicked.");
		
		if ( isErrorMessagePresent() == true)
		{
			logger.info("The Error Message has been displayed");
			
			//Calling Capture Screenshot Method defined in Base Class
			captureScreenshot(driver, "loginTestDDT");
			
			Assert.assertTrue(false);
			logger.info("The Assertion is False and The Login Test has Failed.");
			
		}
		
		else
		{
			Assert.assertTrue(true);
			logger.info("The Assertion is True and the Login Test has Passed.");
			
			lp.clickLogOut();
			logger.info("The Log Out button has been clicked.");
			
		}
		
	}
	
	
	//Method to check Error Message is displayed on passing Invalid Credentials
	public boolean isErrorMessagePresent() throws IOException
	{
		try
		{
			String actualMsg = driver.findElement(By.id("loginSpan")).getText();
		
			String errorMsg = "The user name or password provided is incorrect.";
		
			if(actualMsg.equals(errorMsg))
				{
					logger.info("The Error Message is: " + errorMsg);
				}
		
			/*else
				{
					logger.info("Error Message has not been displayed");
				}
			*/
			return true;
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			
			return false;
		}
		
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
