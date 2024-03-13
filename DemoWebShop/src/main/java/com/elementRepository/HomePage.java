package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.BaseClass;
import com.basePackage.BasePage;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;

	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;


	@FindBy(id = "newsletter-email")
	private WebElement newsletterEmailTextField;

	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribe;

	@FindBy(xpath = "(//a[@class='account'])[1]")
	private WebElement emailIntheHeader;
	
	@FindBy(id =  "newsletter-result-block")
	private WebElement newsletterResult;
	
	@FindBy(partialLinkText = "Virtual Gift Card")
	private WebElement virtualGiftCardLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public WebElement getNewsletterEmailTextField() {
		return newsletterEmailTextField;
	}

	public WebElement getSubscribe() {
		return subscribe;
	}
	public WebElement getEmailIntheHeader() {
		return emailIntheHeader;
	}

	public WebElement getNewsletterResult() {
		return newsletterResult;
	}

	public WebElement getVirtualGiftCardLink() {
		return virtualGiftCardLink;
	}
	
}
