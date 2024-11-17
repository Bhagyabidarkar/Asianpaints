package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;
import com.elementRepository.BeautifulHomePage;
import com.elementRepository.DesignPage;
import com.elementRepository.FindPerfectWallFinish;
import com.elementRepository.HomeInteriorDesigServicesPage;
import com.elementRepository.HomePage;
import com.elementRepository.HomeinteriorDesignCostCalculatorPage;
import com.elementRepository.InteriorHomePage;
import com.elementRepository.LoginPage;
//import com.elementRepository.OneLastStepPage;
import com.elementRepository.WoodFinishSelectionPage;
//import com.elementRepository.ProductPage;
import com.elementRepository.RoyalGlitzPage;
import com.elementRepository.ServicePage;
import com.elementRepository.WallPaintProduct;
import com.elementRepository.WoodColourPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.JavaUtility;
import com.utilityClasses.WebDriverUtility;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class AsianPaint {
	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	FileUtility fileUtility = new FileUtility();
	Actions actions=new Actions(driver);
	HomePage homePage=new HomePage(driver);
	LoginPage loginPage;
//	ProductPage productPage;
	FindPerfectWallFinish  findperfectWallFinish;
	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	DesignPage designPage;
	WoodFinishSelectionPage paintPage;
	ServicePage servicePage;
	BeautifulHomePage beautifulHomePage;
	InteriorHomePage interiorHomePage;
	RoyalGlitzPage royalGlitzPage;
	WoodFinishSelectionPage woodFinishSelectionPage;
	WoodColourPage woodColourPage;
	HomeInteriorDesigServicesPage homeInteriorDesigServicesPage;
	HomeinteriorDesignCostCalculatorPage homeinteriorDesignCostCalculatorPage;
	

	@Given("open the Browser and url shoud be navigated")
	public void open_the_browser_and_url_shoud_be_navigated() throws Exception {
		webDriverUtility.handlePopups(driver);
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("url"));
		Reporter.log("Browser is launched and url is navigated", true);
	}

	@Given("Click on Login icon")
	public void click_on_login_icon() throws Exception {
	
		webDriverUtility.waitForElementClickable(driver, homePage.getLoginLogo());
		loginPage = homePage.clickOnLoginIcon(driver);
		String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("loginurl");
		webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
		Reporter.log("LoginPage is successfully displayed");

	}

	@When("Enter Phonenumber of ten Digits")
	public void enter_phonenumber_of_ten_digits() throws Exception {
		//webDriverUtility.waitForElementPresent(driver, loginPage.getphoneNumberFeild());
//		loginPage.getphoneNumberFeild().click();
		loginPage.clickMethod(loginPage.getphoneNumberFeild());
		Thread.sleep(3000);
		String Mob = fileUtility.getDataFromPropertiesFiles("MobileNumber");
		loginPage.getphoneNumberFeild().sendKeys(Mob);
		Reporter.log("Successfully Entered the number", true);

	}

	@When("Click on proceed")
	public void click_on_proceed() throws InterruptedException {
		webDriverUtility.waitForElementClickable(driver, loginPage.getProceedButton());
		homePage = loginPage.clickOnProceedButoon(driver);
		Thread.sleep(15000);
		Reporter.log("Successfully logged in", true);
	}


	@When("user mouse hover on Services")
	public void user_mouse_over_on_services() {
//		webDriverUtility.mouseHover(driver, homePage.getHoveronServices());
		servicePage = homePage.clickOnServisesLink(driver);
		actions.moveToElement(servicePage.getHoveronServices());
		Reporter.log("Successfully Clicked on Services Link", true);
	}

	@Then("Subfeatures should be Displayed")
	public void subfeatures_should_be_displayed() {
		Assert.assertTrue(servicePage.getHoveronServices().isDisplayed());
		Reporter.log("Yes options are displayed");
	}

	@Then("click on Painting Services link")
	public void click_on_painting_services_link() {
		actions.moveToElement(servicePage.getHoveronServices());
		beautifulHomePage = servicePage.clickOnPaintingServices(driver);
	}

	@Then("ScrollDown The WebPage until Interior Wall Painting ImageLink")
	public void scroll_down_the_web_page_until_interior_wall_painting_image_link() {

		webDriverUtility.scrollToElementTop(driver, beautifulHomePage.getInteriorWallPaintingImageLink());
	}
	@Then("Click on Interior Wall Painting ImageLink")
	public void click_on_interior_wall_painting_image_link() {
		interiorHomePage = beautifulHomePage.clickOnImage(driver);
	}

	@When("Click on ROYALE GLITZ")
	public void click_on_royale_glitz() throws InterruptedException {
		actions.scrollToElement(interiorHomePage.getroyalGlitzLink());
		royalGlitzPage = interiorHomePage.clickOnRoyalGlitzLink(driver);
		Thread.sleep(3000);
	}


	@Then("Royale Glitz Page should be Displayed")
	public void royale_glitz_page_should_be_displayed() {
		Assert.assertTrue(royalGlitzPage.getRoyalGlitzText().isDisplayed());
		Reporter.log("Royale Glitz Page should be Displayed",true);
	}


	@When("click on Wood paint product finder")
	public void click_on_wood_paint_product_finder() {
		woodFinishSelectionPage=servicePage.clickOnWoodPaint(driver);
		Reporter.log("hii",true);
	}

	@When("ScrollDown the WebPage until the Premium range wood finish explore button")
	public void scroll_down_the_web_page_until_the_premium_range_wood_finish_explore_button()
		throws InterruptedException {
		webDriverUtility.scrollToElementTop(driver, woodFinishSelectionPage.getPremiumrangewoodfinishexplore());
		Thread.sleep(3000);
	}

	@When("click on Premium range wood finish explore button")
	public void click_on_premium_range_wood_finish_explore_button() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		woodColourPage=woodFinishSelectionPage.clickOnWoodPaint(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webDriverUtility.switchToTabOnTitle(driver,"Wood Paints & Wood Colour Paints with Smooth Finish - Asian Paintss");	
	}

	@Then("the user selects the {int} checkbox in the filter")
	public void the_user_selects_the_checkbox_in_the_filter(Integer rowNum) throws Exception {
		String data = fileUtility.getDataFromExcel("Sheet1", rowNum, 0);
		Thread.sleep(3000);
		
		
		switch (data) {
		case "gloss":
			woodColourPage.clickMethod(woodColourPage.getGloss());
			Thread.sleep(5000);
			break;

		case "matt":
			
			woodColourPage.clickMethod(woodColourPage.getMatt());
			Thread.sleep(5000);
			break;
			
		case "satin":
			
			woodColourPage.clickMethod(woodColourPage.getSatin());
			Thread.sleep(5000);
			break;
		}
	}
	
	@When("click on Wall paint product finder")
	public void click_on_wall_paint_product_finder() {
		webDriverUtility.waitForElementClickable(driver, servicePage.getWallpaintproductfinder());
	    findperfectWallFinish=servicePage.clickOnWallpaintproductfinder(driver);
	}
	@When("click on Interior radio button")
	public void click_on_interior_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		findperfectWallFinish.getInteriorradiobutton().click();
	}

	@When("click on Yes radio button")
	public void click_on_yes_radio_button() {
		findperfectWallFinish.getYesradiobutton().click();
	}

	@When("click on Gloss")
	public void click_on_gloss() {
		findperfectWallFinish.getGloss().click();
	}
	
	@When("click on  Wall proceed")
	public void click_on_wall_proceed() {
	webDriverUtility.scrollToElementTop(driver, findperfectWallFinish.getProceed());
	findperfectWallFinish.clickMethod(findperfectWallFinish.getProceed());
	}
	
	@Then("enter the valid creadential")
	public void enter_the_valid_creadential() throws Exception 
	{
	
		findperfectWallFinish.getname().clear();
	    findperfectWallFinish.getname().sendKeys(fileUtility.getDataFromPropertiesFiles("name"));
	    findperfectWallFinish.getemail().sendKeys(fileUtility.getDataFromPropertiesFiles("Email"));
	    findperfectWallFinish.getMobileNumber().sendKeys(fileUtility.getDataFromPropertiesFiles("MobileNumber"));
	    findperfectWallFinish.getPincode().sendKeys(fileUtility.getDataFromPropertiesFiles("PINCode"));
	    Reporter.log("Done",true);
	}

	@Then("click on View Recommendations button")
	public void click_on_view_recommendations() {
		findperfectWallFinish.clickMethod(findperfectWallFinish.getViewRecommendations());
	}


	@When("ScrollDown The WebPage until Interior Design Calculator ImageLink")
	public void scroll_down_the_web_page_until_interior_design_calculator_image_link() {
		actions.scrollToElement(homeInteriorDesigServicesPage.getInteriorDesignCalculatorImageLink());

	}
	
	@When("click on Interior Design Calculator ImageLink")
	public void click_on_interior_design_calculator_image_link() throws InterruptedException {
	webDriverUtility.scrollToElementTop(driver,homeInteriorDesigServicesPage.getInteriorDesignCalculatorImageLink() );
	homeInteriorDesigServicesPage.clickMethod(homeInteriorDesigServicesPage.getInteriorDesignCalculatorImageLink());
	Thread.sleep(3000);
	
	}

}