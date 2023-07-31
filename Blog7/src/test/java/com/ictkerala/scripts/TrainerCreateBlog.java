	package com.ictkerala.scripts;
	import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	import java.io.IOException;

import org.ictkerala.utilities.ExcelUtility;
	import org.openqa.selenium.By;
import com.qa.base.MainBaseClass;
import com.qa.pages.TechBlogElements;



	public class TrainerCreateBlog  extends MainBaseClass {
		
		@BeforeTest
		public void setlogin()
		{
			 driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]/img")).click();
		     driver.findElement(By.xpath("//a[@href='/login']")).click();
		     
		}
		
		TechBlogElements log;
		
		@Test(priority = 1)
		public void createNewPost() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(47, 0);
			String img=ExcelUtility.getCellData(49, 0);
			String cat=ExcelUtility.getCellData(50, 1);
			String post=ExcelUtility.getCellData(51, 0);
			log.setUserEmail(setEmail);
			log.setUserPassword(pass);
			log.LoginClick();
			log.NewPost1();
			log.Title(tit);
			log.Image(img);
			Thread.sleep(2000);
			log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			String expectedtitle="http://64.227.132.106/";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void blankTitle() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(52, 0);
			String img=ExcelUtility.getCellData(49, 0);
			String cat=ExcelUtility.getCellData(50, 1);
			String post=ExcelUtility.getCellData(51, 0);
			log.setUserEmail(setEmail);
			log.setUserPassword(pass);
			log.LoginClick();
			log.NewPost1();
			log.Title(tit);
			log.Image(img);
			Thread.sleep(2000);
			log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			String expectedtitle="http://64.227.132.106/trainerpost";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);

	}
		@Test
		public void changedAuthername() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(47, 0);
	        String aut=ExcelUtility.getCellData(48, 0);
		    String img=ExcelUtility.getCellData(49, 0);
			String cat=ExcelUtility.getCellData(50, 1);
		    String post=ExcelUtility.getCellData(51, 0);
		    log.setUserEmail(setEmail);
			log.setUserPassword(pass);
		    log.LoginClick();
			log.NewPost1();
	     	log.Title(tit);
	     	log.Author(aut);
			log.Image(img);
			Thread.sleep(2000);
			log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
		    Thread.sleep(2000);
			driver.switchTo().alert().accept();
			String expectedtitle="http://64.227.132.106/trainerpost";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	}
		@Test
		public void invalidImageURL() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(47, 0);
	        String img=ExcelUtility.getCellData(53, 0);
			String cat=ExcelUtility.getCellData(50, 1);
		    String post=ExcelUtility.getCellData(51, 0);
		    log.setUserEmail(setEmail);
			log.setUserPassword(pass);
		    log.LoginClick();
			log.NewPost1();
	     	log.Title(tit);
	     	log.Image(img);
			Thread.sleep(2000);
			log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
		    Thread.sleep(2000);
			driver.switchTo().alert().accept();
			String expectedtitle="http://64.227.132.106/trainerpost";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	}
		@Test
		public void blankImageURL() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
		    String tit=ExcelUtility.getCellData(48, 0);
	        String img=ExcelUtility.getCellData(49, 1);
			String cat=ExcelUtility.getCellData(50, 1);
		    String post=ExcelUtility.getCellData(51, 0);
	        log.setUserEmail(setEmail);
			log.setUserPassword(pass);
	        log.LoginClick();
		    log.NewPost1();
	     	log.Title(tit);
		    log.Image(img);
		    Thread.sleep(2000);
			log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
		    Thread.sleep(2000);
			driver.switchTo().alert().accept();
			String expectedtitle="http://64.227.132.106/trainerpost";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
	}
		@Test
		public void blankCategory() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(47, 0);
			String img=ExcelUtility.getCellData(49, 0);
			String cat=ExcelUtility.getCellData(50, 0);
			String post=ExcelUtility.getCellData(51, 0);;
			log.setUserEmail(setEmail);
			log.setUserPassword(pass);
			log.LoginClick();
			log.NewPost1();
		    log.Title(tit);
	        log.Image(img);
		    log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
		    Thread.sleep(2000);
			String expectedtitle="http://64.227.132.106/trainerpost";
	       String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
		}
		
		@Test
		public void categoryNotSelected() throws IOException, InterruptedException
		{
			log=new TechBlogElements(driver);
			String setEmail=ExcelUtility.getCellData(46, 0);
			String pass=ExcelUtility.getCellData(46, 1);
			String tit=ExcelUtility.getCellData(47, 0);
			String img=ExcelUtility.getCellData(49, 0);
			String cat=ExcelUtility.getCellData(50, 0);
			String post=ExcelUtility.getCellData(51, 0);
			log.setUserEmail(setEmail);
			log.setUserPassword(pass);
			log.LoginClick();
			log.NewPost1();
		    log.Title(tit);
			log.Image(img);
		    log.Category(cat);
			log.Post(post);
		    log.SubmitPost1();
		    Thread.sleep(2000);
			String expectedtitle="http://64.227.132.106/trainerpost";
	        String Displayhome=driver.getCurrentUrl();
	        Assert.assertEquals(Displayhome,expectedtitle);
		}
	}

	
	

