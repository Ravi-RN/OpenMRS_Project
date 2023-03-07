package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02 {

	public static WebDriver driver;
	
	@FindBy (xpath="//a[@type='button'][3]")
	private WebElement regPatientButton;

	public Pom02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRegPatientButton() {
		return regPatientButton;
	}
}
