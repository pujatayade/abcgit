package com.qa.pages.sales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Sales_page extends TestBase {

	@FindBy(xpath = "//*[@id=\"InquiriesDiv\"]/ul/li[1]/b")
	WebElement Enquiry_Reports;

	@FindBy(name = "OrderNumber")
	WebElement Order_Number;

	@FindBy(name = "CustomerRef")
	WebElement Customer_ref;
	
	@FindBy(name = "SearchOrders")
	WebElement Search_orders;

	public Sales_page() {
		PageFactory.initElements(driver, this);
	}

	public String validateEnquiry_Reports() {
		return Enquiry_Reports.getText();
	}

	public void EnterOrder_Number_Customer_ref(String ordernum, String custrefnum) {
		Order_Number.sendKeys(ordernum);
		Customer_ref.sendKeys(custrefnum);
		Search_orders.click();
	}
}


