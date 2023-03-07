package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom01 {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement PassWord;
	
	@FindBy (xpath="//li[@id='Outpatient Clinic']")
	private WebElement outPatientLink;
	
	@FindBy (xpath="//input[@id='loginButton']")
	private WebElement loginButton;

	public Pom01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getOutPatientLink() {
		return outPatientLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
