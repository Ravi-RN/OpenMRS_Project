package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\J.P.Ravi\\eclipse-workspace\\OpenMRS_Project\\src\\test\\java\\com\\feature\\openmrs.feature",
glue="com.stepdefinition")

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setUp() throws IOException {
		
		String browser = FileReaderManager.getCr().browser();	
		driver=Base_Class.getDriver(browser);

	}

}
