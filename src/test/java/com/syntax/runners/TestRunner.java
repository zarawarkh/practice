package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}
				, glue= {"com/syntax/stepDefinitions"}
				, plugin = {"pretty", "html:target/cucumber-reports"}
				, dryRun=false,
						
				monochrome=true
				)
public class TestRunner extends AbstractTestNGCucumberTests{

}
