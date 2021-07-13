package com.Flipkart.CucumberTest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"src\\test\\java\\com\\Flipkart\\CucumberTest\\featureFiles\\Login.feature"},
	glue={"com\\Flipkart\\CucumberTest\\StepDefinition"},
	monochrome= true,
	plugin= {"pretty","html:target/cucumber",
			"json:target/cucumber.json",
			"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}
)
public class MainRunner 
{

}
