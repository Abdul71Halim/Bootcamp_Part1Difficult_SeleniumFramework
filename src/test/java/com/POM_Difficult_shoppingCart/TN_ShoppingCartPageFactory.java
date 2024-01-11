package com.POM_Difficult_shoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TN_ShoppingCartPageFactory {
	WebDriver driver;
	public TN_ShoppingCartPageFactory(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
    private WebElement emailField;
	
	@FindBy(id ="input-password")
	private WebElement passWordField;
	
	@FindBy(css="input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy(linkText ="Shopping Cart" )
	private WebElement ShoppingCart;
	
	@FindBy(linkText ="Desktops" )
	private WebElement Desktops;
	
	@FindBy(linkText ="Mac (1)" )
	private WebElement macCom;
	
	@FindBy(xpath="//div [@class='button-group']/descendant:: button[1]")
	private WebElement buttonDown;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement isAlertSuccessMessageDisplayed;
	
	//driver.findElement(By.linkText("Shopping Cart")).click();
	//driver.findElement(By.linkText("Desktops")).click();
	//driver.findElement(By.linkText("Mac (1)")).click();
	//driver.findElement(By.xpath("//div [@class='button-group']/descendant:: button[1]")).click();
	 
	 public WebElement emailfield() {
		 return emailField;
		 
	 }
	 public WebElement passWordField () {
		 return passWordField;
	 }
	 public WebElement loginButton() {
		 return loginButton;
	 }
	 public WebElement ShoppingCart() {
		 return ShoppingCart;
	 }
	 public WebElement Desktops () {
		 return Desktops;
	 }
	 public WebElement macCom() {
		 return macCom;
	 }
	 public WebElement buttonDown() {
		 return buttonDown;
	 }
	 public boolean isAlertSuccessMessageDisplayed() {
	By successmssageLocator	= By.xpath("//div[@class='alert alert-success alert-dismissible']");
		 return driver.findElement(successmssageLocator).isDisplayed();
	 }

}
