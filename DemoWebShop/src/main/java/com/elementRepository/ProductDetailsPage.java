package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.BaseClass;
import com.basePackage.BasePage;

public class ProductDetailsPage extends BasePage{
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="giftcard_2_RecipientName")
	private WebElement recipientNameTextField;
	
	@FindBy(id="giftcard_2_RecipientEmail")
	private WebElement recipientEmailTextField;
	
	@FindBy(id="add-to-cart-button-2")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id = "topcartlink")
	private WebElement cartQuantity;
	
	@FindBy(id = "add-to-wishlist-button-2")
	private WebElement addToWishlist;
	
	@FindBy(className =  "wishlist-qty")
	private WebElement wishlistQuantity;
	
	@FindBy(className =  "bar-notification")
	private WebElement addToNotification;
	
	
	public WebElement getRecipientNameTextField() {
		return recipientNameTextField;
	}

	public WebElement getRecipientEmailTextField() {
		return recipientEmailTextField;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getCartQuantity() {
		return cartQuantity;
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public WebElement getWishlistQuantity() {
		return wishlistQuantity;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getAddToNotification() {
		return addToNotification;
	}
	
}
