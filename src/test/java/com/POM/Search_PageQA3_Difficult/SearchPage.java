package com.POM.Search_PageQA3_Difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(name = "search")

	private WebElement searchBox;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")

	private WebElement searchButton;

	
	@FindBy(linkText = "HP LP3065")

	private WebElement productTitle;
	

	public SearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void searchProduct(String productName) {

		searchBox.sendKeys(productName);

		searchButton.click();

	}

	public void addProductToCart() throws Exception {

		//productLink.click();

	

		Thread.sleep(2000);

	

	}

	//public String getCartTotal() {

		//return cartTotal.getText();

	//}

	//public void proceedToCheckout() {

		//ViewCart.click();
	//}

		public boolean isProductInCheckout(String expectedProductName) {
			return productTitle.getText().contains(expectedProductName);

	}

}



