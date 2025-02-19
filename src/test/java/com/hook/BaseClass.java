package com.hook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.utilPackage.DriverFactory;
import com.utilityClasses.JavaUtility;

import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class BaseClass {

	  WebDriver driver;
	
	@Before
	public void beforeScenario() throws Exception
	
	{
		DriverFactory.setUpBrowser();
		driver=DriverFactory.getDriver();
	}
	
	@After
	public void afterScenario(Scenario scenario) throws IOException
	{	
		DriverFactory.quitBrowser();
	}
}
