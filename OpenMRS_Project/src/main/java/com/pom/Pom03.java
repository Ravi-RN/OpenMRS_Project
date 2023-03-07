package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom03 {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//input[@name='givenName']")
	private WebElement patientName;
	
	@FindBy (xpath="//input[@id='fr8656-field']")
	private WebElement patientFamilyName;
	
	@FindBy (xpath="//option[@value='M']")
	private WebElement patientGender;
	
	@FindBy (xpath="//input[@id='birthdateDay-field']")
	private WebElement patientBirthDate;
	
	@FindBy (xpath="//option[text()='Select']")
	private WebElement patientBirthMonth;
	
	@FindBy (xpath="//input[@id='birthdateYear-field']")
	private WebElement patienBirthYear;
	
	@FindBy (xpath="//input[@id='address1']")
	private WebElement patientAddress1;
	
	@FindBy (xpath="//input[@id='address2']']")
	private WebElement patientAddress2;
	
	@FindBy (xpath="//input[@id='cityVillage']")
	private WebElement patientVillage;
	
	@FindBy (xpath="//input[@id='stateProvince']")
	private WebElement patientState;

	@FindBy (xpath="//input[@id='country']")
	private WebElement patientCountry;
	
	@FindBy (xpath="//input[@id='postalCode']")
	private WebElement patientPostalCode;
	
	@FindBy (xpath="//input[@id='fr3775-field']")
	private WebElement patientPhone;
	
	@FindBy (xpath="//option[text()='Select Relationship Type']")
	private WebElement patientRelationType;
	
	@FindBy (xpath="//input[@placeholder='Person Name']")
	private WebElement patientRelativeName;
	
	@FindBy (xpath="//input[@id='submit']")
	private WebElement confirmButton;

	public Pom03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPatientName() {
		return patientName;
	}

	public WebElement getPatientFamilyName() {
		return patientFamilyName;
	}

	public WebElement getPatientGender() {
		return patientGender;
	}

	public WebElement getPatientBirthDate() {
		return patientBirthDate;
	}

	public WebElement getPatientBirthMonth() {
		return patientBirthMonth;
	}

	public WebElement getPatienBirthYear() {
		return patienBirthYear;
	}

	public WebElement getPatientAddress1() {
		return patientAddress1;
	}

	public WebElement getPatientAddress2() {
		return patientAddress2;
	}

	public WebElement getPatientVillage() {
		return patientVillage;
	}

	public WebElement getPatientState() {
		return patientState;
	}

	public WebElement getPatientCountry() {
		return patientCountry;
	}

	public WebElement getPatientPostalCode() {
		return patientPostalCode;
	}

	public WebElement getPatientPhone() {
		return patientPhone;
	}

	public WebElement getPatientRelationType() {
		return patientRelationType;
	}

	public WebElement getPatientRelativeName() {
		return patientRelativeName;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	

}
