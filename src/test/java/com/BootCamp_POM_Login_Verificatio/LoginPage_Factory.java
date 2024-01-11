package com.BootCamp_POM_Login_Verificatio;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_Factory {
	
	WebDriver driver;
	public LoginPage_Factory(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="My Account" )
		private WebElement gomyaccount;
	
	@FindBy (linkText = "Login")
	private WebElement userlogin;
	
	@FindBy(id="input-email")
    private WebElement validemail;
	
	@FindBy(id ="input-password")
	private WebElement validpassWord;
	
	@FindBy(css="input.btn.btn-primary")
	private WebElement clickloninButton;
	
	@FindBy(xpath = "//a[contains(text(), 'Edit your account information')]")
	private WebElement  youraccountinfor;
	
	@FindBy(linkText = "Logout")	
	private WebElement verifyloginsuccess;
	
	
	 public WebElement gomyaccount() {
		  return gomyaccount;
	  }
	 public WebElement userlogin() {
		  return userlogin;
	  }
	 
	 
	 public void emaillogin(String email) {
		 validemail.sendKeys(email);
	 }
	 public void passlogin( String password) {
		 
		 validpassWord.sendKeys(password);
		 
	    }
	 public void clickonlogin() {
		 clickloninButton.click();
	 }

	    public boolean isLoggedInSuccessfully() {
	        return youraccountinfor.isDisplayed() && verifyloginsuccess.isDisplayed();
	    }
	}
	
		
				


