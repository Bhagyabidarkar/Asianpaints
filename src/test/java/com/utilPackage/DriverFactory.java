package com.utilPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilityClasses.FileUtility;

public class DriverFactory {
	
//	public static ThreadLocal<WebDriver> driver = new ThreadLocal();
//
//	public static void setUpBrowser() throws Exception {
//		FileUtility fileUtility = new FileUtility();
//		String browserName = fileUtility.getDataFromPropertiesFiles("browser");
//
//		String url = fileUtility.getDataFromPropertiesFiles("url");
//		if (browserName.equals("chrome")) {
//			driver.set(new ChromeDriver());
//			
//		}
//		
//		else if (browserName.equals("edge")) {
//			driver.set(new EdgeDriver());
//			
//		} 
//		
//		else if (browserName.equals("firefox")) {
//			driver.set(new FirefoxDriver());
//			
//		} 
//		
//		else {
//			driver.set(new ChromeDriver());
//			
//		}
//
//		driver.get().manage().window().maximize();
//		driver.get().get(url);
//		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
////
//	}
//
//	public static WebDriver getDriver() {
//		return driver.get();
//	}
	
	public static WebDriver driver;

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility=new FileUtility();
		String browserName=fileUtility.getDataFromPropertiesFiles("browser");
//		String browserName=System.getProperty("browser","chrome");
		String url=fileUtility.getDataFromPropertiesFiles("url");
		if (browserName.equals("chrome")) {
			ChromeOptions opt = new ChromeOptions(); 
			opt.setBinary("C:\\Users\\dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe"); 
			driver = new ChromeDriver(opt);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void quitBrowser()
	{
//		if(driver!=null)
//		driver.quit();
	}
}

