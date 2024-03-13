

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.basePackage.BaseClass;
import com.elementRepository.HomePage;
import com.elementRepository.ProductDetailsPage;

public class TestAddProductToCart extends BaseClass{
	@Test
	public void addProductToCart() throws InterruptedException {
		SoftAssert softAssert=new SoftAssert();
		
		String productDetailPageURL = "https://demowebshop.tricentis.com/25-virtual-gift-card";
		String recepientName = "L R Aditya";
		String recepientEmail = "pr@gmail.com";
		String shoppingCartURL = "https://demowebshop.tricentis.com/cart";

		Reporter.log("Starting addProductToCart test",true);
		//1.Login
		//Happens in the BaseClass

		HomePage home=new HomePage(driver);
		home.getVirtualGiftCardLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), productDetailPageURL,"Redirection to product detail page is not successful");
		Reporter.log("Clicked on the gift card. Redirected to the product detail page",true);

		ProductDetailsPage product=new ProductDetailsPage(driver);
		product.getRecipientNameTextField().sendKeys(recepientName);
		softAssert.assertEquals(product.getRecipientNameTextField().getAttribute("value"), recepientName,"Recipient name is not entered");
		Reporter.log("Recipient name is entered",true);
		
		product.getRecipientEmailTextField().sendKeys(recepientEmail);
		softAssert.assertEquals(product.getRecipientEmailTextField().getAttribute("value"), recepientEmail,"Recipient email is not entered");
		Reporter.log("Recipient email is entered",true);
		
		product.getAddToCartButton().click();
		Thread.sleep(1000);
		softAssert.assertEquals(product.getAddToNotification().isDisplayed(),true, "Did not add the product to the cart");
//		softAssert.assertEquals(product.getCartQuantity().getText().contains("1"),true, "Did not add the product to the cart");
		Reporter.log("Added the product to the cart ",true);
		
		product.getShoppingCartLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), shoppingCartURL,"Redirection to shopping cart page is not successful");
		Reporter.log("Redirected to the shopping cart page",true);
		
		/*
		 * ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		 * shoppingCartPage.getRemoveFromCartCheckBox().click();
		 * shoppingCartPage.getUpdateCartButton().click();
		 * softAssert.assertEquals(product.getCartQuantity().getText().contains("0"),
		 * true, "Did not remove the product to the cart");
		 * Reporter.log("Removed the product from the cart ",true);
		 */
		
	}
}
