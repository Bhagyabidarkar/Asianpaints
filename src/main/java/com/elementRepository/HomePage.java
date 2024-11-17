
package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BeautifulHomePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnHomePage(WebElement element) {
		element.click();
	}

	@FindBy(xpath = "//a[@data-target='#Services']")
	private WebElement hoveronServices;

	public WebElement getHoveronServices() {
		return hoveronServices;
	}





	@FindBy(xpath = "//img[@alt=\"Best Home Painting Service - Asian Paints\"]")
	private WebElement ROYALESHYNE;

	public WebElement getROYALESHYNE() {
		return ROYALESHYNE;
	}

	@FindBy(xpath = "//div[@class='alignedImg']//img[@title=\"Royale Shyne luxury emulsion for interior walls - Asian Paints\"]")
	private WebElement RoyaleShyneLuxuryEmulsion;

	public WebElement getRoyaleShyneLuxuryEmulsion() {

		return RoyaleShyneLuxuryEmulsion;
	}

	@FindBy(xpath = "//img[@class='before-login'and @alt='profile-button']")
	private WebElement loginLogo;

	public WebElement getLoginLogo() {
		return loginLogo;
	}

	public LoginPage clickOnLoginIcon(WebDriver driver) {
		clickOnHomePage(getLoginLogo());
		return new LoginPage(driver);
	}

	public ServicePage clickOnServisesLink(WebDriver driver) {
		clickOnHomePage(getHoveronServices());
		return new ServicePage(driver);
	}

}
