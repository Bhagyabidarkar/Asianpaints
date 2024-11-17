package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WoodColourPage extends BasePage{

	public WoodColourPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//span[text()='gloss']")
	private WebElement gloss;
	
	public  WebElement getGloss() {
		return gloss;

	}
	@FindBy(xpath ="//span[text()='matt']")
	private WebElement Matt;
	
	public WebElement getMatt() {
		return Matt;
	}


	@FindBy(xpath = "//span[text()='satin']")
	private WebElement Satin;
	public WebElement getSatin() {

		return Satin;
	}
	
	

}
