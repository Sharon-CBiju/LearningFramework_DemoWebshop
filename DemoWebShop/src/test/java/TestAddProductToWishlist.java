

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;
import com.elementRepository.HomePage;
import com.elementRepository.ProductDetailsPage;

public class TestAddProductToWishlist extends BaseClass {
	@Test
	public void addToWishlist() throws InterruptedException {
		//	add a product to the wishlist

		String productDetailPageURL = "https://demowebshop.tricentis.com/25-virtual-gift-card";
		String recepientName = "L R Aditya";
		String recepientEmail = "pr@gmail.com";
		String wishlistURL = "https://demowebshop.tricentis.com/wishlist";
		Reporter.log("Starting addToWishlist test",true);

		//1.Login
		//Happens in the BaseClass

		HomePage home=new HomePage(driver);
		//click on the virtual gift card
		home.getVirtualGiftCardLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), productDetailPageURL,"Redirection to product detail page is not successful");
		Reporter.log("Clicked on the gift card. Redirected to the product detail page",true);

		ProductDetailsPage product=new ProductDetailsPage(driver);
		//enter recipient name 
		product.getRecipientNameTextField().sendKeys(recepientName);
		softAssert.assertEquals(product.getRecipientNameTextField().getAttribute("value"), recepientName,"Recipient name is not entered");
		Reporter.log("Recipient name is entered",true);
		//enter recipient email 
		product.getRecipientEmailTextField().sendKeys(recepientEmail);
		softAssert.assertEquals(product.getRecipientEmailTextField().getAttribute("value"), recepientEmail,"Recipient email is not entered");
		Reporter.log("Recipient email is entered",true);

		//click on add to wishlist
		product.getAddToWishlist().click();
		Thread.sleep(1000);
		//		softAssert.assertEquals(product.getWishlistQuantity().getText().contains("1"),true, "Did not add the product to the wishlist");
		softAssert.assertEquals(product.getAddToNotification().isDisplayed(),true, "Did not add the product to the wishlist");
		Reporter.log("Added the product to the wishlist ",true);

		//click on wishlist link in header
		product.getWishlistLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), wishlistURL,"Redirection to wishlist page is not successful");
		Reporter.log("Redirected to the wishlist page",true);

	}
}
