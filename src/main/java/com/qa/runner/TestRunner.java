package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\main\\java\\com\\qa\\features\\freecrm.feature"
	,glue = {"com/qa/stepdefinitions"}
	,format = {"pretty","junit:junit_output/Cucumber.xml"}
	,monochrome = true
	,strict = true
	,dryRun = false
	//,tags = {"@E2E"}
	)

	public class TestRunner {

}
