
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;
import com.elementRepository.HomePage;

public class TestLoginAndSubscribeNewsletter extends BaseClass{
	@Test
	public void loginAndSubscribe() throws InterruptedException {

		String email = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";
		Reporter.log("Starting loginAndSubscribe test",true);
		//1.Login
		//Happens in BaseClass				

		//2.Enter email 
		HomePage homePage = new HomePage(driver);
		homePage.getNewsletterEmailTextField().sendKeys(email);
		softAssert.assertEquals(homePage.getNewsletterEmailTextField().getAttribute("value"), email,"Email is not entered successfully");
		Reporter.log("Email is entered for subscription",true); 

		//3.Click on subscribe
		homePage.getSubscribe().click();
		softAssert.assertEquals(homePage.getNewsletterResult().isDisplayed(), true,"Subscribe button is not clicked.");
		Reporter.log("Subscribe button is clicked.",true); 

	}
}
