package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeinteriorDesignCostCalculatorPage extends BasePage {

	public HomeinteriorDesignCostCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	//@FindBy(xpath="(//div[@class='option-wrapper_label']//child::label[@class='room-type-label-evt'])[1]")
	@FindBy(xpath = "//input[@id=\"check_living_room\"]")
	private WebElement LivingRoomcheckBox;
	
	public WebElement getLivingRoomcheckBox() {
		return LivingRoomcheckBox;
	}
     @FindBy(xpath="//button[@class='btn btn--primary btn__icon--right bhg-cal-evt step2-calc-btn-evt animated-arrow-btn yellow-gradient bhs-calculator-animation-btn']")
     private WebElement Nextbutton;
	public WebElement getNextbutton() {
		
		return Nextbutton;
	}
	@FindBy(xpath="(//button[@id='bh-select-btn'])[2]")
	private WebElement PremiumSelectbutton;

	public WebElement getPremiumSelectbutton() {
		
		return PremiumSelectbutton;
	}
     @FindBy(xpath="//button[@class='next-btn animated-arrow-btn yellow-gradient bhs-calculator-animation-btn']")
     private WebElement PremiumNextbutton;
	public WebElement getPremiumNextbutton() {
		return PremiumNextbutton;
	}
	@FindBy(xpath="//input[@name='ENQUIRE_NAME' and @placeholder='Your Full Name'][1]")
	private WebElement name;
	public WebElement getname() {		
		return name;
	}

	@FindBy(xpath="//input[@class='form-text-input__field' and @placeholder='Eg: myname@gmail.com']")
	private WebElement email;
	public WebElement getemail() {
		
		return email;
	}
	@FindBy(xpath="//input[@class='form-text-input__field telNum' and @placeholder='10 digits']")
	private WebElement MobileNumber;
	public WebElement getMobileNumber() {
		
		return MobileNumber;
	}
	@FindBy(xpath="//input[@class='form-text-input__field' and @placeholder='6 digit PIN code']")
	private WebElement Pincode;
	public WebElement getPincode() {
		return Pincode;
	}
	@FindBy(xpath="//button[@class='ctaText track_form_submit animated-arrow-btn yellow-gradient uploadPdfFiles']")
	private WebElement Submitbutton;
	public WebElement getSubmitbutton() {
		
		return Submitbutton;
	}
	
	
	

}

	
	


