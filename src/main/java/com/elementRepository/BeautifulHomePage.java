package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautifulHomePage extends BasePage  {

	public BeautifulHomePage( WebDriver driver) {
		super(driver);
		
		
	}

	@FindBy(xpath = "//img[@alt='Our-Services-Interior-Wall-Painting']")
	private WebElement InteriorWallPaintingImageLink;

	public WebElement getInteriorWallPaintingImageLink() {

		return InteriorWallPaintingImageLink;
	}
	
	public InteriorHomePage clickOnImage(WebDriver driver) {
		clickMethod(getInteriorWallPaintingImageLink());
		return new InteriorHomePage(driver);
		
	}

}
