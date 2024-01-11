package com.POM_Difficult_shoppingCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM_Difficult_shoppingCart.TN_ShoppingCartPageFactory;

public class TN_AddProducttoCartTest {
	

	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	}
	
	@Test()
	public void addProductinChart() {
		TN_ShoppingCartPageFactory pagefactory = new TN_ShoppingCartPageFactory(driver);
		
		pagefactory.ShoppingCart().click();
		//driver.findElement(By.linkText("Shopping Cart")).click();
		pagefactory.Desktops().click();
		//driver.findElement(By.linkText("Desktops")).click();
		pagefactory.macCom().click();
		//driver.findElement(By.linkText("Mac (1)")).click();
		pagefactory.buttonDown().click();
		
		//driver.findElement(By.xpath("//div [@class='button-group']/descendant:: button[1]")).click();
		
		boolean isSuccessMessageDisplayed =pagefactory.isAlertSuccessMessageDisplayed();
	     System.out.println("Is success message displayed? " + isSuccessMessageDisplayed);
		
		boolean displayStatus = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed();
		 System.out.println(displayStatus);

	}
		@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
