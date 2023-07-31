package com.ictkerala.scripts;

	import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	import java.io.IOException;

	import org.ictkerala.utilities.ExcelUtility;
import org.openqa.selenium.By;

import com.qa.base.MainBaseClass;

import com.qa.pages.TechBlogElements;
	
	public class CreateBlogTestClass extends MainBaseClass {
		
		TechBlogElements login;
		
		@BeforeTest
		public void setlogin()
	    {
	    	 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
		     driver.findElement(By.xpath("//a[@href='/login']")).click();
		     
	    }
		
		@Test 
		public void UserBlogValid() throws IOException, InterruptedException //GRP7_025
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(9, 0);
			String img=ExcelUtility.getCellData(10, 0);
			String cat=ExcelUtility.getCellData(11, 0);
			String post=ExcelUtility.getCellData(12, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
	   		String expectedurl="http://64.227.132.106/mypost";
	        String actualurl=driver.getCurrentUrl();
	        Assert.assertEquals(actualurl, expectedurl);
		}
		
		@Test 
		public void UserBlogTitle() throws IOException, InterruptedException // GRP7_026
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(13, 0);
			String img=ExcelUtility.getCellData(14, 0);
			String cat=ExcelUtility.getCellData(15, 0);
			String post=ExcelUtility.getCellData(16, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
			}
		
		@Test
		public void UserBlogAuthor() throws IOException, InterruptedException //GRP7_027
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(17, 0);
			String aut=ExcelUtility.getCellData(18, 0);
			String img=ExcelUtility.getCellData(19, 0);
			String cat=ExcelUtility.getCellData(20, 0);
			String post=ExcelUtility.getCellData(21, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			login.Author(aut);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
		    String expectedurl="http://64.227.132.106/usernewpost";
	        String actualurl=driver.getCurrentUrl();
	        Assert.assertEquals(actualurl,expectedurl);
		}
		@Test 
		public void UserBlogImg() throws IOException, InterruptedException // GRP7_028
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(22, 0);
			String img=ExcelUtility.getCellData(23, 0);
			String cat=ExcelUtility.getCellData(24, 0);
			String post=ExcelUtility.getCellData(25, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
			
		}
		@Test 
		public void UserBlogImgBlank() throws IOException, InterruptedException //GRP7_029
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(26, 0);
			String img=ExcelUtility.getCellData(27, 0);
			String cat=ExcelUtility.getCellData(28, 0);
			String post=ExcelUtility.getCellData(29, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
			
		}
	
		
		@Test 
		public void UserBlogCatBlank() throws IOException, InterruptedException//GRP7_029
		{
			login=new TechBlogElements(driver);
			String emai=ExcelUtility.getCellData(8, 0);
			String passwd=ExcelUtility.getCellData(8, 1);
			String tit=ExcelUtility.getCellData(35, 0);
			//String aut=ExcelUtility.getCellData(31, 0);
			String img=ExcelUtility.getCellData(36, 0);
			String cat=ExcelUtility.getCellData(37, 0);
			String post=ExcelUtility.getCellData(38, 0);
			login.setUserEmail(emai);
			login.setUserPassword(passwd);
			login.LoginClick();
			login.NewPost();
			login.Title(tit);
			//login.Author(aut);
			login.Image(img);
			login.Category(cat);
			login.Post(post);
			login.Approval();
			
		}
}
