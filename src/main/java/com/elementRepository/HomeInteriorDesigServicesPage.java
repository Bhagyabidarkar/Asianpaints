package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeInteriorDesigServicesPage extends BasePage {
		public HomeInteriorDesigServicesPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//a[@class=\"cmp-image__link\" ]//img[ @alt=\"idc-component\"]")
		private WebElement InteriorDesignCalculatorImageLink;
		public WebElement getInteriorDesignCalculatorImageLink() {
			
			return InteriorDesignCalculatorImageLink;
		}
		
		
		
		
		
		
		
		

//  public HomeinteriorDesignCostCalculatorPage clickOnCalculatorImg(WebDriver driver) {
//    	clickMethod(getInteriorDesignCalculatorImageLink());
//    	return  new HomeinteriorDesignCostCalculatorPage(driver);
//    
//  }



public HomeinteriorDesignCostCalculatorPage clickOnInteriorDesignCalculatorImageLink(WebDriver driver) {
	clickMethod(getInteriorDesignCalculatorImageLink());
	return  new  HomeinteriorDesignCostCalculatorPage(driver);

}
}
 
	


