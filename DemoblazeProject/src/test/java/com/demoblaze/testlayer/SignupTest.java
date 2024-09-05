package com.demoblaze.testlayer;

import org.testng.annotations.Test;

import com.demoblaze.pageLayer.Homepage;
import com.demoblaze.pageLayer.Signuppage;
import com.demoblaze.testbase.Testbase;

public class SignupTest extends Testbase{

	@Test
	public void verifySignupTest()
	{
		Homepage homepage_obj = new Homepage(driver);
		homepage_obj.clickOnSignupLink();
		
		Signuppage signup_obj = new Signuppage(driver);
		
		signup_obj.enterUsername("jontest1");
		signup_obj.enterPassword("test");
		signup_obj.clickOnSignupButton();
		
	}
}
