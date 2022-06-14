package com.appseConnect.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.appseConnect.utilities.ReadConfig;


public class BaseClass {
	
	//To get the values of the Variables, we have to call the required Methods from the ReadConfig.java Class
	//To call the Methods, first we have to create an Object of the ReadConfig.java Class 
	
	//Creating the Object of ReadConfig which will in turn invoke the Constructor of ReadConfig.java
	ReadConfig readconfig = new ReadConfig();
	
	//Getting the Variable value by calling the required Method
	//public String baseURL = "https://portal.appseconnect.com/Account/Login?ReturnUrl=%2f#!";
	public String baseURL = readconfig.getApplicationURL();
	
	//public String Username = "debashree.p@insync.co.in";
	public String Username = readconfig.getUsername();
	
	//public String Password = "Efgh.1234";
	public String Password = readconfig.getPassword();
	
	//Creation of Driver Object
	public static WebDriver driver;
	
	//Creation of Logger Object
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		
		//Logger Object Configuration
		logger = Logger.getLogger("appseConnect");
		PropertyConfigurator.configure("Log4j.properties");
		
		//For Chrome Browser
		if(br.equals("chrome"))
		{
		
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\debashree\\eclipse-workspace\\appseConnectV1\\Drivers\\chromedriver.exe");
			
			//Using the System.getproperty to get the project path instead of providing the full path of the driver exe.
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			
			//Getting the Variable value of Chrome Driver path by calling the required Method from ReadConfig.java File
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			
			//Instantiate the Driver Object
			driver = new ChromeDriver();
		}
		
		//For IE Browser
		/*else if (br.equals("ie"))
		{
			//Getting the Variable value of Internet Explorer Driver path by calling the required Method from ReadConfig.java File
			System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
			
			//Instantiate the Driver Object
			driver = new InternetExplorerDriver();
		}
		*/
		
		//For Edge Browser
		else if (br.equals("edge"))
		{
			//Getting the Variable value of Edge Driver path by calling the required Method from ReadConfig.java File
			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
					
			//Instantiate the Driver Object
			driver = new EdgeDriver();
		}
		
		driver.get(baseURL);
		
		//Maximize the Browser window
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	//Capture Screenshots
	public void captureScreenshot(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot has been taken");
	}
	
	
	//Generate Random String
	public String randomString()
	{
		String generatedrandomstring = RandomStringUtils.random(8, true, true);
		return generatedrandomstring;
	}
	
	
	//Generate Random Number
	public static String randomNum()
	{
		String generatedrandomnumstring = RandomStringUtils.randomNumeric(5);
		return generatedrandomnumstring;
	}
	

}
