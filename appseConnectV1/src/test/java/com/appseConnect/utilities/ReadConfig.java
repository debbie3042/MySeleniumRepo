package com.appseConnect.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	//Create Object for Properties Class
	Properties pro;
	
	//Creating a Constructor
	//As soon as an Object for ReadConfig Class is created, the following Constructor will be invoked
	//AAfter invocation of the Constructor, the config.properties File will be loaded
	public ReadConfig() 
	{
		//"src" Variable is referring the config.properties File
		File src = new File("./Configuration/config.properties");
		
		try
		{
			//Reading the data from the config.properties File
			//FileInputStream to open the File in the read mode
			//Opening the src File in read mode
			FileInputStream fis = new FileInputStream(src);
			
			//Initializing the pro Object created earlier
			pro = new Properties();
			
			//Load Method will load the complete config.properties File at runtime
			pro.load(fis);
			
		}
		catch (Exception e)
		{
			//To catch exception, such as if the config.properties File is not available at the specified location
			System.out.println("Exception is: " + e.getMessage());
		}
	}
	
	
	//After the config.properties File is loaded, to read the values of the Variables following Methods are created
	
	//Method for the URL Variable
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	//Method for the Username Variable
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	//Method for the Password Variable
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	//Method for the Chrome Driver path Variable
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	/*Method for the IE Driver path Variable
		public String getIEPath()
		{
			String iepath = pro.getProperty("iepath");
			return iepath;
		}
	*/
		
	//Method for the Edge Driver path Variable
		public String getEdgePath()
		{
			String edgepath = pro.getProperty("edgepath");
			return edgepath;
		}

}
