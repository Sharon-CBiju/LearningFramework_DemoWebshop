package com.elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.BasePage;

public class WelcomePage extends BasePage{
	public WelcomePage(WebDriver driver) {
		super(driver);
	}


	//@findBy annotation return webElement
	@FindBy(name = "q")
	private WebElement searchTextField;

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(xpath="//div[@class='listbox']/ul/li")
	private List<WebElement> categoryElements;

	@FindBy(id = "pollanswers-2")
	private WebElement pollGood;

	@FindBy(id = "vote-poll-1")
	private WebElement voteButton;
	
	@FindBy(className = "poll-total-votes")
	private WebElement totalVoteText;
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public List<WebElement> getCategoryElements() {
		return categoryElements;
	}
	public WebElement getPollGood() {
		return pollGood;
	}
	public WebElement getVoteButton() {
		return voteButton;
	}
	public WebElement getTotalVoteText() {
		return totalVoteText;
	}

}
