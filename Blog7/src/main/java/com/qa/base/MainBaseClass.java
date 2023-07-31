package com.qa.base;
	import java.io.FileInputStream;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.nio.charset.Charset;
	import java.util.Properties;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeSuite;

	public class MainBaseClass {
		
		public WebDriver driver;
		public static Properties properties;
		public void init()
		{
			driver=new ChromeDriver();
		}
	   public MainBaseClass()
	   {
		  properties = new Properties(); 
		  File file = new  File(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
		  try {

			   FileInputStream inputStream = new FileInputStream(file);

			   properties.load(new InputStreamReader(inputStream, Charset.forName("UTF-8")));

			   } catch (FileNotFoundException fie) {

			   fie.printStackTrace();

			   } catch (IOException e) {

			   e.printStackTrace();

			   }
	   }
		  @BeforeSuite
		  public void initialization() throws InterruptedException
		  {
			 String browser=properties.getProperty("browser");
			 if(browser.equalsIgnoreCase("Chrome"))
			 {
				 driver=new ChromeDriver();
				 
			 }
			 if(browser.equalsIgnoreCase("edge"))
			 {
				 driver=new EdgeDriver();
				 
			 }
			 if(browser.equalsIgnoreCase("firefox"))
			 {
				 driver=new FirefoxDriver();
				 
			 }
			 driver.get(properties.getProperty("url"));
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
		   
		  
	   
	   }
	   
	
	}
