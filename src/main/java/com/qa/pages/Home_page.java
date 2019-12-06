package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.pages.sales.Sales_page;

public class Home_page extends TestBase {
	@FindBy(id = "AppInfoCompanyDiv")
	WebElement EProcbilingword;

	@FindBy(linkText = "Sales")
	WebElement sales;

	public Home_page() {
		PageFactory.initElements(driver, this);
	}

	public String validatehome_pageTitle() {
		return driver.getTitle();

	}

	public boolean validatEprocbilingword() {
		return EProcbilingword.isDisplayed();
	}

	public Sales_page clicksales() {
		sales.click();
		return new Sales_page();
	}
}
