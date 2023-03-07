package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

import com.baseclass.Base_Class;
import com.helper.FileReaderManager;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {

	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("User launch the url")
	public void user_launch_the_url() throws IOException {
	  String url = FileReaderManager.getCr().url();
	  getUrl(url);
	  
	  
	}

	@When("User send the username")
	public void user_send_the_username() {
	   
		pom.getP1().getUserName().sendKeys("Admin");
	}

	@When("User send the password")
	public void user_send_the_password() {
	   
		pom.getP1().getPassWord().sendKeys("Admin123");
	}

	@When("User click the outpatient clinic link")
	public void user_click_the_outpatient_clinic_link() {
	 
		pom.getP1().getOutPatientLink().click();
	}

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		
		pom.getP1().getLoginButton().click();
		Thread.sleep(2000);
	    
	}
	
	@When("User click the register a patient button")
	public void user_click_the_register_a_patient_button() throws InterruptedException {
	    
		pom.getP2().getRegPatientButton().click();
		Thread.sleep(2000);

		
	}
	
	@When("User send the patient name and family name")
	public void user_send_the_patient_name_and_family_name() throws AWTException, InterruptedException {

		driver.findElement(By.xpath("//input[@name='givenName']")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys("Hello");

		Thread.sleep(5000);

	}

	

}
