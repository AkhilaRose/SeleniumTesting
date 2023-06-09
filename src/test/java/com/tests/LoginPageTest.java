package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.configuration.Base;
import com.pages.LoginPage;

public class LoginPageTest extends Base {

	LoginPage obj = new LoginPage();

	@BeforeMethod
	public void setUp() {
		initialisation();
	}

	@Test
	public void loginHeadingDisplayTest() throws InterruptedException {
		Thread.sleep(2000);
		boolean data = obj.loginHeadingDisplayedorNot();
		Assert.assertEquals(data, false);

	}

	@Test
	public void loginButtonDisplayTest() throws InterruptedException {
		Thread.sleep(2000);
		String textvalue = obj.loginButtonDisplayedorNot();
		Assert.assertEquals(textvalue, "Login");
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}
}
