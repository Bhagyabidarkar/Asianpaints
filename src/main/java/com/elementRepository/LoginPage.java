package com.elementRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilityClasses.FileUtility;

public class LoginPage  extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//img[@class='before-login'and @alt='profile-button']")
	private WebElement loginLogo;

	public WebElement getLoginLogo() {
		return loginLogo;
	}

	@FindBy(id = "phoneInput")
	private WebElement phoneNumberFeild;
	
	public WebElement getphoneNumberFeild() {
		return phoneNumberFeild;
	}

	@FindBy(id = "phoneSubmit")
	private WebElement proceedButton;
	public WebElement getProceedButton() {
		return proceedButton;
	}
	
	@FindBy(xpath="(//li[@aria-label='Wall paint product finder'])[2]")
    private WebElement paintproductfinder;
	public WebElement getWallpaintproductfinder() {
		
		return paintproductfinder;
	}
	public HomePage clickOnProceedButoon(WebDriver driver) {
		clickMethod(getProceedButton());
		return new HomePage(driver);
	}
	

	
	
	

}