package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class Login_page extends TestBase {

	@FindBy(id = "login_logo")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"login_box\"]/form/div/span[1]")
	WebElement company_word;
	
	@FindBy(name = "CompanyNameField" )
	WebElement Biling;
	
	@FindBy(xpath = "//*[@id=\"login_box\"]/form/div/span[2]")
	WebElement username_word;

	@FindBy(name = "UserNameEntryField")
	WebElement username;
	
	@FindBy(name = "UserNameEntryField")
	WebElement username_placeholder;
	
	@FindBy(xpath = "//*[@id=\"login_box\"]/form/div/span[3]")
	WebElement password_word;

	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(name = "Password")
	WebElement password_placeholder;

	@FindBy(name = "SubmitUser")
	WebElement login;
	
	public Login_page() {
		PageFactory.initElements(driver, this);
	}

	public String validateLogin_pageTitle() {
		return driver.getTitle();

	}

	public boolean validatelogo() {
		return logo.isDisplayed();

	}
	
	public boolean validatecompany_word() {
		return company_word.isDisplayed();
	}
	
	public String validateBiling() {
		Select select = new Select(Biling);
		select.selectByVisibleText("EProcBiling");
		return validateBiling();
		
		
	}
	
	public String validateusername_word() {
		return username_word.getText();
		
	}
	
	public String validateusername_placeholder() {
		return username_placeholder.getAttribute("placeholder");
		
	}
	
	public String validatepassword_word() {
		return password_word.getText();
		
	}
	
	public String validatepassword_placeholder() {
		return password_placeholder.getAttribute("placeholder");
		
	}

	public Home_page validatelogin(String UN, String PW ) {
		username.sendKeys(UN);
		password.sendKeys(PW);
		login.click();
		return new Home_page();
	}
	
	

}
