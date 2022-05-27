package com.appseConnect.utilities;

//Listener class used to generate Extent reports

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter
{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
		
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="AEC Test Report-"+timeStamp+".html";
		
		//Specify the location of the Report
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		//extent.setSystemInfo("Host name","localhost");
		//extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("user","Debashree");
		
		//Title of the Report
		htmlReporter.config().setDocumentTitle("APPSeCONNECT Testing"); 
		
		//Name of the Report
		htmlReporter.config().setReportName("AEC Functional Test Automation Report"); 
		
		//Location of the Chart
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); 
		
		//Theme of the Report
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		//Create a new entry in the Report
		logger=extent.createTest(tr.getName()); 
		
		//Send the Passed information to the Report with GREEN color highlighted
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 
	}
	
	public void onTestFailure(ITestResult tr)
	{
		//Create new entry in the Report
		logger=extent.createTest(tr.getName()); 
		
		//Send the Failed information to the Report with RED color highlighted
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); 
		
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		
		File f = new File(screenshotPath); 
		
		if(f.exists())
		{
		try {
			logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
				}
		}
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		//Create new entry in the Report
		logger=extent.createTest(tr.getName());
		
		//Send the Skipped information to the Report with Orange color highlighted
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}