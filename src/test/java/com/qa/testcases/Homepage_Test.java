package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Home_page;
import com.qa.pages.Login_page;
import com.qa.pages.sales.Sales_page;

public class Homepage_Test extends TestBase{
	Login_page login_page;
	Home_page home_page;
	Sales_page sales_page;
	

	public Homepage_Test() {
		super();
	}

	@BeforeMethod
	public void Setup(){
		initialization();
		login_page = new Login_page();
		home_page = login_page.validatelogin(prop.getProperty("Username"),prop.getProperty("Password"));
		sales_page = new Sales_page();
	}
	
	@Test(priority = 1)
	public void HomepageTitleTest() {
		String actual = home_page.validatehome_pageTitle();
		String expected="Main Menu";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 2)
	public void EprocbilingwordTest() {
		boolean flag = home_page.validatEprocbilingword();
		Assert.assertTrue(flag);
			
	}
	
	
	@Test(priority = 3)
	public void SalesTest() {
		sales_page = home_page.clicksales();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
