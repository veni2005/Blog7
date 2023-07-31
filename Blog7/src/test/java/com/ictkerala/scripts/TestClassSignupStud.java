package com.ictkerala.scripts;

	import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	import java.io.IOException;
	
	import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;

import com.qa.base.MainBaseClass;
	import com.qa.pages.TechBlogElements;

	
		    public class TestClassSignupStud extends MainBaseClass
	    {
	        TechBlogElements sign;
	                      
	        
	        @BeforeTest
	        
	        public void signup()
	        {
	        	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
			     driver.findElement(By.xpath("//a[@href='/signup']")).click();
	        }
	        
	        @Test 
	        public void verifysignupscenario1() throws IOException //GRP7_001
, InterruptedException
	        {
	           	        
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(0, 0);
	            String accounttype= ExcelUtility.getCellData(0, 1);
	            String email= ExcelUtility.getCellData(0, 2);
	            String password= ExcelUtility.getCellData(0, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            Thread.sleep(2000);
	            driver.switchTo().alert().accept();
	            String expectedtitle="http://64.227.132.106/login";
	            String Displaylogin=driver.getCurrentUrl();
	            Assert.assertEquals(Displaylogin,expectedtitle);
	            	          		
	         
	        }
	        
	        @Test
	        public void verifysignupscenario2() throws IOException //GRP7_002
	        {
	            	           
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(1, 0);
	            String accounttype= ExcelUtility.getCellData(1, 1);
	            String email= ExcelUtility.getCellData(1, 2);
	            String password= ExcelUtility.getCellData(1, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	            
	        }
	        @Test
	        
	        public void verifysignupscenario3() throws IOException //GRP7_003
	        {
	            	           
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(2, 0);
	            String accounttype= ExcelUtility.getCellData(2, 1);
	            String email= ExcelUtility.getCellData(2, 2);
	            String password= ExcelUtility.getCellData(2, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	            
	        }
	        @Test
	        public void verifysignupscenario4() throws IOException //GRP7_004
	        {
	            	           
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(3, 0);
	            String accounttype= ExcelUtility.getCellData(3, 1);
	            String email= ExcelUtility.getCellData(3, 2);
	            String password= ExcelUtility.getCellData(3, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	            
	        }
	        @Test
	        public void verifysignupscenario5() throws IOException //GRP7_005
	        {
	            	           
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(4, 0);
	            String accounttype= ExcelUtility.getCellData(4, 1);
	            String email= ExcelUtility.getCellData(4, 2);
	            String password= ExcelUtility.getCellData(4, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	            
	        }
	        @Test
	        public void verifysignupscenario6() throws IOException //GRP7_006
	        {
	            	           
				sign=new TechBlogElements(driver);
	            String name= ExcelUtility.getCellData(5, 0);
	            String accounttype= ExcelUtility.getCellData(5, 1);
	            String email= ExcelUtility.getCellData(5, 2);
	            String password= ExcelUtility.getCellData(5, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	        }
	    @Test
	    public void verifysignupscenario7() throws IOException //GRP7_007
        {
            	           
			sign=new TechBlogElements(driver);
            String name= ExcelUtility.getCellData(6, 0);
            String accounttype= ExcelUtility.getCellData(6, 1);
            String email= ExcelUtility.getCellData(6, 2);
            String password= ExcelUtility.getCellData(6, 3);
            sign.setName(name);
            sign.setAccounttype(accounttype);
            sign.setEmail(email);
            sign.setPassword(password);
            sign.clickSubmit();
            
            
        }
	    @Test
	    
	    public void verifysignupscenario8() throws IOException ////GRP7_008
        {
            	           
			sign=new TechBlogElements(driver);
            String name= ExcelUtility.getCellData(7, 0);
            String accounttype= ExcelUtility.getCellData(7, 1);
            String email= ExcelUtility.getCellData(7, 2);
            String password= ExcelUtility.getCellData(7, 3);
            sign.setName(name);
            sign.setAccounttype(accounttype);
            sign.setEmail(email);
            sign.setPassword(password);
            sign.clickSubmit();
            
            
        }
	        	    
	    }
