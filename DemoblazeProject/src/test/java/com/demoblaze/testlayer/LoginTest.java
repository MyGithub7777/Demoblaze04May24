package com.demoblaze.testlayer;

import org.testng.annotations.Test;

import com.demoblaze.pageLayer.Homepage;
import com.demoblaze.pageLayer.Loginpage;
import com.demoblaze.testbase.Testbase;

public class LoginTest extends Testbase{

	@Test
	public void logintestcase001()
	{
		Homepage home_obj = new Homepage(driver);
		home_obj.clickOnLoginLink();
		
		Loginpage login_obj = new Loginpage(driver);
		login_obj.enterUsername("testacc3");
		login_obj.enterPassword("test");
		login_obj.clickOnLoginButton();
	}
}
