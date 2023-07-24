package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TechBlogSignUpPage {
 WebDriver driver;

    private WebElement name;
    private WebElement accounttype;
    private WebElement email;
    private WebElement password;
    private WebElement submit;
    
    public TechBlogSignUpPage(WebDriver driver)
    {
        this.driver=driver;
    }
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


}

