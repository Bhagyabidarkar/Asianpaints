package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoyalGlitzPage extends BasePage {

	public RoyalGlitzPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class='bannerTextDesc whiteColorText parallax-text-wp jsParallaxTextWp']")
	private WebElement royalGlitzText;

	public WebElement getRoyalGlitzText() {

		return royalGlitzText;
	}

}
