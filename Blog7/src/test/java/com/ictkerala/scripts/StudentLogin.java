package com.ictkerala.scripts;

import java.io.IOException;

import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;

public class StudentLogin extends MainBaseClass{
	
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
		String setemail=ExcelUtility.getCellData(70, 0);
		String setpass=ExcelUtility.getCellData(70, 1);
		log.setemailid(setemail);
		log.setpassword(setpass);
		log.LoginClick();
		Thread.sleep(2000);
		String expectedtitle="http://64.227.132.106/mypost";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome,expectedtitle);
	}
   @Test
	public void VerifyInvalidemail() throws Exception

	{
		log=new TechBlogElements(driver);
		String setemail=ExcelUtility.getCellData(71, 0);
		System.out.println(setemail);
		String setpass=ExcelUtility.getCellData(71, 1);
		log.setemailid(setemail);
		log.setpassword(setpass);
		log.LoginClick();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    String expectedtitle="http://64.227.132.106/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome, expectedtitle);

	}
    @Test
	public void VerifyInvalidPassword() throws Exception
	{
		log=new TechBlogElements(driver);
		String setemail=ExcelUtility.getCellData(72, 0);
		System.out.println(setemail);
		String setpass=ExcelUtility.getCellData(72, 1);
		log.setemailid(setemail);
		log.setpassword(setpass);
		log.LoginClick();
			Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    String expectedtitle="http://64.227.132.106/login";
	    String Displayhome=driver.getCurrentUrl();
	    Assert.assertEquals(Displayhome, expectedtitle);    
	}

	@Test
	public void verifyInValidLogin() throws Exception
	{
		log=new TechBlogElements(driver);
		String setemail=ExcelUtility.getCellData(73, 0);
		System.out.println(setemail);
		String setpass=ExcelUtility.getCellData(73, 1);
		log.setemailid(setemail);
		log.setpassword(setpass);
		log.LoginClick();
		    
	}
}