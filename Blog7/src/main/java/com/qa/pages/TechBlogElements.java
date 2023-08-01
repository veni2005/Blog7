	package com.qa.pages;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class TechBlogElements {
	 WebDriver driver;
	 	
	 	
		
	    private WebElement name;
	    private WebElement accounttype;
	    private WebElement Newpost1;
	    private WebElement submit;
	    
	    private WebElement email;
	    private WebElement password;
	     private WebElement Logina;
	     private WebElement Newpost;
	     private WebElement Title;
	     private WebElement Author;
	     private WebElement Image;
	     private WebElement Category;
	     private WebElement Post;
	     private WebElement SubmitPost;
	     private WebElement approve;
	     private WebElement pending;
	     private WebElement approvel;
	     private WebElement send;
	    
	    public TechBlogElements(WebDriver driver)
	    {
	        this.driver=driver;
	    }
	 
	  
	    public void setUserEmail(String setEmail)
	     {
	    	 email=driver.findElement(By.id("user"));
	    	 email.sendKeys(setEmail);
	     }
	     
	     public void setUserPassword(String pass)
	     {
	    	 password=driver.findElement(By.id("pwd"));
	    	 password.sendKeys(pass);
	    	 
	     }
	     public void LoginClick()
	     {
	    	 Logina=driver.findElement(By.id("logbut"));
	    	 Logina.click();
	     }
	     
	     //New Post
	     
	     
	     public void NewPost() throws InterruptedException//check
	     {
	    
	    	 Thread.sleep(2000);
	     	Newpost=driver.findElement(By.xpath("//a[@routerlink='/usernewpost']"));
	     	Newpost.click();
	     }
	  
	     
	     public void Title(String t_name)// title in New Post
	     {
	    	 Title=driver.findElement(By.id("exampleInputEmail1"));
	    	 Title.sendKeys(t_name);
	     }
	     
	     public void Author(String A_name)// author name
	     {
	    	 Author=driver.findElement(By.name("P_author"));
	    	 Author.sendKeys(A_name);
	    }
	     
	     public void Image(String img)
	     {
	    	 Image=driver.findElement(By.name("P_image"));
	    	 Image.sendKeys(img);
	     }
	     public void Category(String cat)
	     
	     {
	    	 Category=driver.findElement(By.xpath("//select[@name='p_cat']"));
	    	 Category.sendKeys(cat);
	    	
	     }
	     
	     public void Post(String post)
	     
	     {
	    	 Post=driver.findElement(By.name("p_post"));
	    	 Post.sendKeys(post);
	    	 
	     }
	     public void Approval()throws InterruptedException
	     {
	    	 WebElement appclick=driver.findElement(By.xpath("//button[@class='btn text-center btn-primary']"));
	    	JavascriptExecutor executor=(JavascriptExecutor)driver;
	    	executor.executeScript("arguments[0].click();",appclick);
	     }
	    	    	
	    //New Signup
	    
	    
	public void setName(String setName)
	{
	    name=driver.findElement(By.id("first"));
	    name.sendKeys(setName);
	}
	public void setAccounttype(String setAccounttype)
	{
	    accounttype=driver.findElement(By.xpath("//*[@id=\"sign\"]/select"));
	    accounttype.sendKeys(setAccounttype);
	}
	public void setEmail(String setEmail)
	{
	    email=driver.findElement(By.id("em"));
	    email.sendKeys(setEmail);
	}
	public void setPassword(String setPass)
	{
	    password=driver.findElement(By.id("pw"));
	    password.sendKeys(setPass);
	}
	public void clickSubmit()
	{
	    submit=driver.findElement(By.id("but"));
	    submit.click();
	}

	//Trainer login
	
	 public void setTrainerEmail(String setEmail)
     {
    	 email=driver.findElement(By.id("user"));
    	 email.sendKeys(setEmail);
     }
     
     public void setTrainerPassword(String pass)
     {
    	 password=driver.findElement(By.id("pwd"));
    	 password.sendKeys(pass);
    	 
     }
     public void TrainerLoginClick()
     {
    	 Logina=driver.findElement(By.id("logbut"));
    	 Logina.click();
     }
	
	     
     public void NewPost1() throws InterruptedException//check
     {
   	 Thread.sleep(2000);
      Newpost=driver.findElement(By.xpath("//a[@href='/trainerpost']"));
      Newpost.click();
     }
  

public void SubmitPost1() {
	
	WebElement SubmitPost=driver.findElement(By.xpath("//button[@class='btn text-center btn-primary']"));
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();",SubmitPost);
}

//Admin Approval


public void pendingClick()

{
pending=driver.findElement(By.xpath("//a[@href='/approval']"));
pending.click();

}

public void approvelClick() throws InterruptedException

{
approvel=driver.findElement(By.xpath("//button[@class=\"btn btn-outline-primary mx-3 ng-star-inserted\" and text()=\"Approve\"]"));
approvel.click();

Thread.sleep(2000);
Alert al = driver.switchTo().alert();

al.accept();

}


public void setcomment(String setcomment)
{
password=driver.findElement(By.xpath("/html/body/app-root/app-comment/form/div/textarea"));
password.sendKeys(setcomment);
}

public void sendClick() throws InterruptedException

{
send=driver.findElement(By.xpath("/html/body/app-root/app-comment/form/button"));
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", send);
send.click();
Thread.sleep(2000);
Alert ale = driver.switchTo().alert();

ale.accept();

}


public void approveClick() {
	
	approve=driver.findElement(By.xpath("//p[@id=\"nav\" and @class=\"dropdown-toggle\"]"));
    approve.click();
}


}


     
     
     
	


