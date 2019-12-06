package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Home_page;
import com.qa.pages.Login_page;

public class Login_Test extends TestBase {
	Login_page login_page;
	Home_page home_page;
	

	public Login_Test() {
		super();
	}

	@BeforeMethod
	public void Setup(){
		initialization();
		login_page = new Login_page();
	}

	@Test(priority = 1)
	public void TitleTest() {
		String actual = login_page.validateLogin_pageTitle();
		String expected = "webERP Login screen";
		Assert.assertEquals(actual, "webERP Login screen");
	}
	
	@Test(priority = 2)
	public void logoTest() {
		boolean flag = login_page.validatelogo();
		Assert.assertTrue(flag);
	}
	
	/*@Test(priority = 3)
	public void BilingTest() {
		String actual = login_page.validateBiling();
		String expected = "EProcBiling";
		Assert.assertEquals(actual, expected);
	}*/
	
	@Test(priority = 4)
	public void company_wordTest() {
		boolean flag = login_page.validatecompany_word();
		Assert.assertTrue(flag);
	}
	
	
	/*@Test(priority = 5)
	public void username_wordTest() {
		String actual = login_page.validateusername_word();
		String expected = "User name:";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6)
	public void username_placeholderTest() {
		String actual = login_page.validateusername_placeholder();
		String expected = "User name";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7)
	public void password_wordTest() {
		String actual = login_page.validatepassword_word();
		String expected = "Password:";
		Assert.assertEquals(actual, expected);
	}
	*/
	@Test(priority = 8)
	public void password_placeholderTest() {
		String actual = login_page.validatepassword_placeholder();
		String expected = "Password";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 9)
	public void loginTest() throws InterruptedException {
		home_page = login_page.validatelogin(prop.getProperty("Username"),prop.getProperty("Password"));
		Thread.sleep(6000);
	}
	
	/*@Test(priority = 10)
	public void blank_username_password_Test() {
		home_page = login_page.validatelogin(prop.getProperty(""), prop.getProperty(""));
		
	}*/

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
