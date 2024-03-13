package com.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage (WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Books')]")
	private WebElement booksHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Computers')]")
	private WebElement computersHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Electronics')]")
	private WebElement electronicsHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Apparel')]")
	private WebElement apparelShooesHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Digital')]")
	private WebElement digitalDownloadsHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Jewelry')]")
	private WebElement jewelryHeaderLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li/a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsHeaderLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerHeaderLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginHeaderLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartHeaderLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistHeaderLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchInputField;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutHeaderLink;
	
	public WebElement getBooksHeaderLink() {
		return booksHeaderLink;
	}
	
	public WebElement getComputersHeaderLink() {
		return computersHeaderLink;
	}
	
	public WebElement getElectronicsHeaderLink() {
		return electronicsHeaderLink;
	}
	
	public WebElement getApparelShooesHeaderLink() {
		return apparelShooesHeaderLink;
	}
	
	public WebElement getDigitalDownloadsHeaderLink() {
		return digitalDownloadsHeaderLink;
	}
	
	public WebElement getJewelryHeaderLink() {
		return jewelryHeaderLink;
	}
	
	public WebElement getGiftCardsHeaderLink() {
		return giftCardsHeaderLink;
	}

	public WebElement getRegisterHeaderLink() {
		return registerHeaderLink;
	}

	public WebElement getLoginHeaderLink() {
		return loginHeaderLink;
	}

	public WebElement getShoppingCartHeaderLink() {
		return shoppingCartHeaderLink;
	}

	public WebElement getWishlistHeaderLink() {
		return wishlistHeaderLink;
	}

	public WebElement getSearchInputField() {
		return searchInputField;
	}

	public WebElement getLogoutHeaderLink() {
		return logoutHeaderLink;
	}
	
}
