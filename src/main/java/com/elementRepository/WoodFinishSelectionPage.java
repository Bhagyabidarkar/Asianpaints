
package com.elementRepository;

import java.lang.annotation.ElementType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class PaintPage {
//	public PaintPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	public void clickElement(WebElement element) {
//		element.click();
//	}
//	@FindBy(xpath="(//a[contains(text(),'Wood paint product finder')])[2]")
//	private WebElement  woodpaintproductfinder;
//	public WebElement getwoodpaintproductfinder() {
//
//		return woodpaintproductfinder;
//	}
//	
//	@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wood-finish/wood-listing.html?f=price%3Apremium']")
//	private WebElement Premiumrangewoodfinishexplore;
//	public WebElement getPremiumrangewoodfinishexplore() {
//		return Premiumrangewoodfinishexplore;
//	}
//
//	@FindBy(xpath="//span[text()='gloss']")
//	private WebElement gloss;
//	
//	public  WebElement getGloss() {
//		return gloss;
//
//	}
//	@FindBy(xpath ="//span[text()='matt']")
//	private WebElement Matt;
//	
//	public WebElement getMatt() {
//		return Matt;
//	}
//
//	@FindBy(xpath = "//span[text()='satin']")
//	private WebElement Satin;
//	public WebElement getSatin() {
//
//		return Satin;
//	}
//	
////	public void clickOnPaintPage(WebElement element) {
////		element.click();
////		}
////	public Premiumrange clickOnPremiumrangewoodfinishbutton(WebDriver driver) {
////		clickOnPaintPage(getPremiumrangewoodfinishexplore());
////		return new Premiumrange();
////	}
//	
//	
//	}
//   
//
public class WoodFinishSelectionPage extends BasePage{
	public WoodFinishSelectionPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wood-finish/wood-listing.html?f=price%3Apremium']")
	private WebElement Premiumrangewoodfinishexplore;
	public WebElement getPremiumrangewoodfinishexplore() {
		return Premiumrangewoodfinishexplore;
	}
	public WoodColourPage clickOnWoodPaint(WebDriver driver) {
		clickMethod(getPremiumrangewoodfinishexplore());
		return new WoodColourPage(driver);
	}
}
