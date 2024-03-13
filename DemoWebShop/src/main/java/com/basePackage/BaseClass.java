package com.basePackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.UtilityClasses.DataUtility;
import com.UtilityClasses.FrameworkConstants;
import com.elementRepository.LoginPage;

public class BaseClass implements FrameworkConstants{
	public WebDriver driver;
	String emailId = "er.pallavi207@gmail.com";
	String password = "Password@123";
	BasePage basePage;
	LoginPage loginPage;

	public SoftAssert softAssert;

	@BeforeSuite
	public void dataBaseStart() {
		Reporter.log("Database connection is started", true);
		Reporter.log("Extend report formation", true);
	}

	@BeforeClass
	@Parameters("browserName")
	public void browserSetUp(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			Reporter.log("invalid browser input", true);
		}

		driver.manage().window().maximize();
		Reporter.log("user is able to maximize the  browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		softAssert = new SoftAssert();
	}
	
	@BeforeMethod
	public void login() throws IOException {

		DataUtility data = new DataUtility();
		basePage = new BasePage(driver);
		loginPage = new LoginPage(driver);
		
		basePage.getLoginHeaderLink().click();

		loginPage.getEmailTextField().sendKeys(data.readingDataFromPropertyFile(loginPath, "email"));
		loginPage.getPasswordTextField().sendKeys(data.readingDataFromPropertyFile(loginPath, "password"));
		loginPage.getLoginButton().click();
		Reporter.log("user is able to login", true);
	}

	@AfterMethod
	public void logout() {
		basePage.getLogoutHeaderLink().click();
		Reporter.log("user is able to logout", true);
		softAssert.assertAll();
	}
	
	@AfterClass
	public void tearDownBroswer() {
		driver.quit();
		Reporter.log("user is able to close the browser", true);
		
	}
	
	@AfterSuite
	public void dataeBaseClosed() {
		Reporter.log("Database connection is stopped", true);
		Reporter.log("Extend report formation end", true);
	}
	
}
