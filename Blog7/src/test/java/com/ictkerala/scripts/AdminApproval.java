package com.ictkerala.scripts;

	import java.io.IOException;

	import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;
//import com.qa.pages.AdminLogin;


	public class AdminApproval extends MainBaseClass {
		
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
		    String emai= ExcelUtility.getCellData(55,0);
		    String pass= ExcelUtility.getCellData(55,1);
		    String comment=ExcelUtility.getCellData(68, 0);
		    log.setUserEmail(emai);
		    log.setUserPassword(pass);
		    log.LoginClick();
		    Thread.sleep(2000);
		    log.approveClick();
		    log.pendingClick();
		    Thread.sleep(2000);
		    log.approvelClick();
		    log.setcomment(comment);
		    Thread.sleep(2000);
		    log.sendClick();
		    Thread.sleep(2000);
	        String expectedtitle="http://64.227.132.106/admin";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
		
		}
	
	
}
