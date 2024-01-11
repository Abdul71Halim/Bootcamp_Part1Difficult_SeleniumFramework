package com.BootCamp_POM_Login_Verificatio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation_LogingTest {
    public WebDriver driver;
    public LoginPage_Factory loginpageFactory;
	@BeforeMethod
	public void loginSetup() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void goToLoginPage() {
		loginpageFactory = new LoginPage_Factory(driver);
		loginpageFactory.gomyaccount().click();
		loginpageFactory.userlogin().click();
	}
	@Test
	public void logingsuccessfuly() {
		loginpageFactory = new LoginPage_Factory(driver);
		loginpageFactory.gomyaccount().click();
		loginpageFactory.userlogin().click();
		loginpageFactory.emaillogin("seleniumpanda@gmail.com");
		loginpageFactory.passlogin("Selenium@123");    
		loginpageFactory.clickonlogin();
		boolean edityouraccountinformation = loginpageFactory.isLoggedInSuccessfully();
		boolean logoutOption =  loginpageFactory.isLoggedInSuccessfully();
		 System.out.println(logoutOption);
		 System.out.println(edityouraccountinformation);
				
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
