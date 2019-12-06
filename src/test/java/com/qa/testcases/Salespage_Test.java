package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Home_page;
import com.qa.pages.Login_page;
import com.qa.pages.sales.Sales_page;

import junit.framework.Assert;

public class Salespage_Test extends TestBase {
	Login_page login_page;
	Home_page home_page;
	Sales_page sales_page;

	public Salespage_Test() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		login_page = new Login_page();
		home_page = login_page.validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		sales_page = new Sales_page();
	}

	@Test(priority = 1)
	public void Enquiry_Reports_Test() {
		String actual = sales_page.validateEnquiry_Reports();
		String expected = "Inquiries and Reports";
		Assert.assertEquals(expected, actual);

	}

	@Test(priority = 2)
	public void Order_Number_Test() {
		sales_page.EnterOrder_Number_Customer_ref(prop.getProperty("ordernum"), prop.getProperty("custref"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
