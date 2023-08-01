	
package com.ictkerala.scripts;

import java.io.IOException;
import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;



	public class AdminLogin extends MainBaseClass {
		TechBlogElements log;
		
		@BeforeTest
		public void setlogin()
	    {
	    	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
		     driver.findElement(By.xpath("//a[@href='/login']")).click();
		     
	    }
		
	    @Test 
	    public void verifyValidLogin() throws IOException
	, InterruptedException
	    {
	        log=new TechBlogElements(driver);
	        String emai=ExcelUtility.getCellData(55, 0);
	        String pass=ExcelUtility.getCellData(55, 1);
	        log.setUserEmail(emai);
	        log.setUserPassword(pass);
	        log.LoginClick();
	        Thread.sleep(2000);
	        String expectedtitle="http://64.227.132.106/admin";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	    }
	    
	    
	    @Test
	    public void verifyInValidLogin() throws Exception
	    {
	        log=new TechBlogElements(driver);
	        String emai=ExcelUtility.getCellData(56, 0);
	        System.out.println(emai);
	        String pass=ExcelUtility.getCellData(56, 1);
	        log.setUserEmail(emai);
	        log.setUserPassword(pass);
	        log.LoginClick();
	    }
	@Test
	    public void validPassword() throws Exception
	    {
	        log=new TechBlogElements(driver);
	        String emai=ExcelUtility.getCellData(57, 0);
	        System.out.println(emai);
	        String pass=ExcelUtility.getCellData(57, 1);
	        log.setUserEmail(emai);
	        log.setUserPassword(pass);
	        log.LoginClick();
	        Thread.sleep(3000);
	        String expectedtitle="http://64.227.132.106/login";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	    }
	@Test
	    public void validEmail() throws Exception
	    {
	        log=new TechBlogElements(driver);
	        String emai=ExcelUtility.getCellData(58, 0);
	        System.out.println(emai);
	        String pass=ExcelUtility.getCellData(58, 1);
	        log.setUserEmail(emai);
	        log.setUserPassword(pass);
	        log.LoginClick();
	        Thread.sleep(3000);
	        String expectedtitle="http://64.227.132.106/login";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	    }
	
	
}
