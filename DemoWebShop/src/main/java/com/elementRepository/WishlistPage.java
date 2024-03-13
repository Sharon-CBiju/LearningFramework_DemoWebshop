package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.BaseClass;
import com.basePackage.BasePage;

public class WishlistPage  extends BasePage{
	public WishlistPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name =  "removefromcart")
	private WebElement removeFromWishlistCheckBox;
	
	@FindBy(name =  "updatecart")
	private WebElement updateWishlistButton;
	
	public WebElement getRemoveFromCartCheckBox() {
		return removeFromWishlistCheckBox;
	}
	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}
	
}
