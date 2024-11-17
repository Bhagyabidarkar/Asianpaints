package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"stepDefination","hook"},
features= {"./src/test/resources/feature"},
plugin={"rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:Reports/Cucumber.xml"})
public class ParallelRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount", "3");
		return super.scenarios();
	}

}








