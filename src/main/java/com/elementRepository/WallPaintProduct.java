package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WallPaintProduct extends BasePage {
	public WallPaintProduct(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath="//input[@id=\"interior\"]")
	private WebElement Interiorradiobutton;
	public WebElement getInteriorradiobutton() {
		
		return Interiorradiobutton;
	}
	@FindBy(xpath = "//input[@id=\"yes\"]")
	private WebElement Yesradiobutton;
	public WebElement getYesradiobutton() {
		return Yesradiobutton;
	}
	@FindBy(xpath = "//input[@id=\"gloss\"]")
	private WebElement Gloss;
	public WebElement getGloss() {
		return Gloss;
	}
	@FindBy(xpath = "//button[@aria-label=\"Proceed\"]")
	private WebElement Proceed;
	public WebElement getProceed() {
		return Proceed;
}
}
