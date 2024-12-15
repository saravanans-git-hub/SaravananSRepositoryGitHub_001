package com.OrangeHrm.genericScripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	public void onStart(ITestContext context)
	{
		System.out.println("Testcase Execution is Started");		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase Execution is Success "+result.getName());		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase Execution is Failed "+result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcase Execution is Skipped "+result.getName());
	}
	public void onFinish(ITestContext  context)
	{
		System.out.println("Testcase Execution is Completed");
	}
}