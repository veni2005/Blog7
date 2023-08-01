	package com.ictkerala.scripts;

	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import java.io.IOException;
	
	import org.ictkerala.utilities.ExcelUtility;
	import org.openqa.selenium.By;

	import com.qa.base.MainBaseClass;
	import com.qa.pages.TechBlogElements;

	public class TrainerSignup extends MainBaseClass
	{
		 TechBlogElements log;
         
		 @BeforeTest
	        
	        public void signup()
	        {
	        	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
			     driver.findElement(By.xpath("//a[@href='/signup']")).click();
	        }
	        
		 	@Test
		 public void verifyValidLogin() throws IOException, InterruptedException
			{
				log=new TechBlogElements (driver);
				 String name= ExcelUtility.getCellData(60, 0);
				String accounttype= ExcelUtility.getCellData(60, 1);
		        String email= ExcelUtility.getCellData(60, 2);
		        String password= ExcelUtility.getCellData(60, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();
		        Thread.sleep(2000);
	            driver.switchTo().alert().accept();
	            String expectedtitle="http://64.227.132.106/login";
	            String Displaylogin=driver.getCurrentUrl();
	            Assert.assertEquals(Displaylogin,expectedtitle);
			}

			
			@Test
			public void verifyValidLogin1() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(61, 0);
				String accounttype= ExcelUtility.getCellData(61, 1);
		        String email= ExcelUtility.getCellData(61, 2);
		        String password= ExcelUtility.getCellData(61, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        Thread.sleep(2000);
		        log.setPassword(password);
		        log.clickSubmit();

			}
			
			@Test
			public void verifyValidLogin2() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(62, 0);
				String accounttype= ExcelUtility.getCellData(62, 1);
		        String email= ExcelUtility.getCellData(62, 2);
		        String password= ExcelUtility.getCellData(62, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();

			}

			@Test
			public void verifyValidLogin3() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(63, 0);
				String accounttype= ExcelUtility.getCellData(63, 1);
		        String email= ExcelUtility.getCellData(63, 2);
		        String password= ExcelUtility.getCellData(63, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();

			}
			
			@Test
			public void verifyValidLogin4() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(64, 0);
				String accounttype= ExcelUtility.getCellData(64, 1);
		        String email= ExcelUtility.getCellData(64, 2);
		        String password= ExcelUtility.getCellData(64, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();

			}
			

			@Test
			public void verifyValidLogin5() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(65, 0);
				String accounttype= ExcelUtility.getCellData(65, 1);
		        String email= ExcelUtility.getCellData(65, 2);
		        String password= ExcelUtility.getCellData(65, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();

			}
			
			

			@Test
			public void verifyValidLogin6() throws IOException, InterruptedException
			{
				log=new TechBlogElements(driver);
				  String name= ExcelUtility.getCellData(66, 0);
				String accounttype= ExcelUtility.getCellData(66, 1);
		        String email= ExcelUtility.getCellData(66, 2);
		        String password= ExcelUtility.getCellData(66, 3);
		        log.setName(name);
		        log.setAccounttype(accounttype);
		        log.setEmail(email);
		        log.setPassword(password);
		        Thread.sleep(2000);
		        log.clickSubmit();

			}
		}


		 
		 

