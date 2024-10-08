package com.demoblaze.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver driver;
	
	public Loginpage(WebDriver d) 
	{
		driver = d;
	}
	
	//-------------------------Object repo---
	
	private By username_txtbox = By.xpath("//input[@id='loginusername']");
	private By password_txtbox = By.xpath("//input[@id='loginpassword']");
	private By login_btn = By.xpath("//button[contains(text(),'Log in')]");
	
	//----------------------Action methods --------
	
	public void enterUsername(String username)
	{
		driver.findElement(username_txtbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
}
