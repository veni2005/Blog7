package com.ictkerala.scripts;

import java.io.IOException;
import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;

public class TrainerLogin extends MainBaseClass{
	

	
	TechBlogElements log;
	
	
	@BeforeTest
	public void setlogin()
    {
    	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
	     driver.findElement(By.xpath("//a[@href='/login']")).click();
	     
    }
	
	@Test
	public void verifyValidLogin() throws IOException, InterruptedException
	{
		log=new TechBlogElements(driver);
		String emai=ExcelUtility.getCellData(40, 0);
		String passwd=ExcelUtility.getCellData(40, 1);
		log.setTrainerEmail(emai);
		log.setTrainerPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
        String expectedtitle="http://64.227.132.106/mypost";
        String Displayhome=driver.getCurrentUrl();
        Assert.assertEquals(Displayhome, expectedtitle);
     
        
        	}
	@Test
	public void verifyInValidLogin() throws Exception
	{
		log=new TechBlogElements(driver);
		String emai=ExcelUtility.getCellData(41, 0);
		System.out.println(emai);
		String passwd=ExcelUtility.getCellData(41, 1);
		log.setTrainerEmail(emai);
		log.setTrainerPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
        String expectedtitle="http://64.227.132.106/login";
        String Displayhome=driver.getCurrentUrl();
        Assert.assertEquals(Displayhome, expectedtitle);
		    
	}
	@Test
	public void validEmail() throws Exception
	{
		log=new TechBlogElements(driver);
		String emai=ExcelUtility.getCellData(42, 0);
		System.out.println(emai);
		String passwd=ExcelUtility.getCellData(42, 1);
		log.setTrainerEmail(emai);
		log.setTrainerPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        String expectedtitle="http://64.227.132.106/login";
        String Displayhome=driver.getCurrentUrl();
        Assert.assertEquals(Displayhome, expectedtitle);
		    
	}
	@Test
	public void validPassword() throws Exception
	{
		log=new TechBlogElements(driver);
		String emai=ExcelUtility.getCellData(43, 0);
		System.out.println(emai);
		String passwd=ExcelUtility.getCellData(43, 1);
		log.setTrainerEmail(emai);
		log.setTrainerPassword(passwd);
		log.LoginClick();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        String expectedtitle="http://64.227.132.106/login";
        String Displayhome=driver.getCurrentUrl();
        Assert.assertEquals(Displayhome, expectedtitle);
		    
	}
    

}
