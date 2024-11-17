package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage extends BasePage {
	public ServicePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@data-target='#Services']")
	private WebElement hoveronServices;

	public WebElement getHoveronServices() {
		return hoveronServices;
	}

	@FindBy(xpath = "//li[@aria-label='Painting services']")
	private WebElement paintingServices;

	public WebElement getPaintingServices() {
		return paintingServices;
	}
	@FindBy(xpath="(//a[contains(text(),'Wood paint product finder')])[2]")
	private WebElement  woodpaintproductfinder;
	public WebElement getwoodpaintproductfinder() {

		return woodpaintproductfinder;
	}
	@FindBy(xpath="(//li[@aria-label='Wall paint product finder'])[2]")
    private WebElement paintproductfinder;
	public WebElement getWallpaintproductfinder() {
		
		return paintproductfinder;
	}
	 @FindBy(xpath="//li[@aria-label='Interior design services']")
     private WebElement Interiordesignservices;
	public WebElement getInteriordesignservices() {
		
		return Interiordesignservices;
	}

	public BeautifulHomePage clickOnPaintingServices(WebDriver driver) {
		clickMethod(getPaintingServices());
		return new BeautifulHomePage(driver);
	}
	public WoodFinishSelectionPage clickOnWoodPaint(WebDriver driver) {
		clickMethod(getwoodpaintproductfinder());
		return new WoodFinishSelectionPage(driver);
	}
	
	public FindPerfectWallFinish clickOnWallpaintproductfinder(WebDriver driver) {
		clickMethod(getWallpaintproductfinder());
		return new FindPerfectWallFinish(driver);
	}

	public HomeInteriorDesigServicesPage clickOnInteriorDesignServices(WebDriver driver) {
		clickMethod(getInteriordesignservices());
		return new HomeInteriorDesigServicesPage(driver);
	}

}
