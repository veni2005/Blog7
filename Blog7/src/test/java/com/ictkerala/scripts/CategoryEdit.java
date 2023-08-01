package com.ictkerala.scripts;
	
import java.io.IOException;

import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;


public class CategoryEdit extends MainBaseClass
{
	TechBlogElements log;
	
	@BeforeTest
	
	public void setlogin()
    {
    	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
	     driver.findElement(By.xpath("//a[@href='/login']")).click();
	     
    }	
		
		@Test
		public void adminsEdit() throws IOException, InterruptedException//s31 no sorting option
		{
			log=new TechBlogElements(driver);
			
		    String emai= ExcelUtility.getCellData(55,0);
		    String pass= ExcelUtility.getCellData(55,1);
		    log.setUserEmail(emai);
		    log.setUserPassword(pass);
		    log.LoginClick();
		    Thread.sleep(2000);
		    log.CategoryClick();
		    log.DropdownClick();
		    Thread.sleep(2000);
		    log.EditClick();
		    String expectedtitle="http://64.227.132.106/edit";
		    String Displayhome=driver.getCurrentUrl();
		    Assert.assertEquals(Displayhome,expectedtitle);
		}
}
