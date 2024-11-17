package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPerfectWallFinish extends BasePage{
		public FindPerfectWallFinish(WebDriver driver) {
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
		}@FindBy(xpath="//input[@name='ENQUIRE_NAME' and @placeholder='Your Full Name'][1]")
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
		@FindBy(xpath = " //div[@class=\"cta ctaComp baseBtn ctaRevampYellow\"]")
		private WebElement ViewRecommendations;
		public WebElement getViewRecommendations() {
			
			return ViewRecommendations;
		}
		
		}
		
		
		

