package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteriorHomePage extends BasePage{

	public InteriorHomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@class='content-wp']")
	private WebElement royalGlitzLink;

	public WebElement getroyalGlitzLink() {

		return royalGlitzLink;
	}
	public RoyalGlitzPage clickOnRoyalGlitzLink(WebDriver driver) {
		clickMethod(getroyalGlitzLink());
		return new RoyalGlitzPage(driver);
	}

}
