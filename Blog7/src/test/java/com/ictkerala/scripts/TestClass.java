package com.ictkerala.scripts;

	import org.testng.annotations.Test;
	import java.io.IOException;
	
	import org.ictkerala.utilities.ExcelUtility;
	import com.qa.base.BaseClass;
	import com.qa.pages.TechBlogSignUpPage;
	
		    public class TestClass extends BaseClass
	    {
	        TechBlogSignUpPage sign;
	        
	        @Test
	        
	        public void verifysignupscenario1() throws IOException
	        {
	            	           
				sign=new TechBlogSignUpPage(driver);
	            String name= ExcelUtility.getCellData(0, 0);
	            String accounttype= ExcelUtility.getCellData(0, 1);
	            String email= ExcelUtility.getCellData(0, 2);
	            String password= ExcelUtility.getCellData(0, 3);
	            sign.setName(name);
	            sign.setAccounttype(accounttype);
	            sign.setEmail(email);
	            sign.setPassword(password);
	            sign.clickSubmit();
	            
	            
	        }
}
