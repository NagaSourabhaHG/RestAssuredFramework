package com.api.listeners;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public static final Logger Logger = LogManager.getLogger(TestListener.class);
	
	public void onStart(ITestContext context) {
	    Logger.info("Test Suite Started !!");
	  }


	public void onTestStart(ITestResult result) {
		
		Logger.info("Started !!!"+result.getMethod().getMethodName());
		Logger.info("Description !!!"+result.getMethod().getDescription());

	}

	public void onTestSuccess(ITestResult result) {
		
		Logger.info("Passed !!!"+result.getMethod().getMethodName());
		Logger.info("Description !!!"+result.getMethod().getDescription());

		
	}

	public void onTestFailure(ITestResult result) {
		Logger.error("Failed !!!"+result.getMethod().getMethodName());
		Logger.error("Description !!!"+result.getMethod().getDescription());

	}

	public void onTestSkipped(ITestResult result) {
		
		Logger.info("Skipped!!!"+result.getMethod().getMethodName());

	}

	public void onFinish(ITestContext context) {
		Logger.info("Test Suite got Completed !! ");
	}

}
