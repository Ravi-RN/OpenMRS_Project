package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Pom01 p1;
	private Pom02 p2;
	private Pom03 p3;

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Pom01 getP1() {
		
		p1 = new Pom01(driver);
		return p1;
	}

	public Pom02 getP2() {
		p2=new Pom02(driver);
		return p2;
	}

	public Pom03 getP3() {
		
		p3=new Pom03(driver);
		return p3;
	}
	
	

}
