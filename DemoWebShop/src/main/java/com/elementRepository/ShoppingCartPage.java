package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.BasePage;

public class ShoppingCartPage extends BasePage {
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name =  "removefromcart")
	private WebElement removeFromCartCheckBox;
	
	@FindBy(name =  "updatecart")
	private WebElement updateCartButton;
	
	public WebElement getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}
	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	
}
