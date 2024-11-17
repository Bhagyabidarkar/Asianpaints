package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

// WebDriver driver;
	public BasePage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
//		this.driver =driver;
	}
	public void clickMethod(WebElement element) {
		element.click();
	}

}
