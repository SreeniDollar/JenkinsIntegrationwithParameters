package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test cases started : "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases Passed : "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test cases failed : "+result.getName());
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Test cases skipped : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
		
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
