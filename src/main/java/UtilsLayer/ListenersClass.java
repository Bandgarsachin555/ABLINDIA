package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersClass extends ExtendReportsSetup implements ITestListener  {
	public static ExtentTest extenttest;
	
public void onStart(ITestContext context)
    {
	 extent=ExtendReportsSetup.reports();
		System.out.println("Suite is started");

    }

	public void onTestStart(ITestResult result) 
	{
		 extenttest= extent.createTest(result.getMethod().getMethodName());
		
		//System.out.println("Test case is started "+result.getMethod().getMethodName());
		
	}

	
	public void onTestSuccess(ITestResult result)
	{
		extenttest.log(Status.PASS, "Test case is success "+result.getMethod().getMethodName());
		//System.out.println("Test case is success "+result.getMethod().getMethodName());
	}

	
	public void onTestFailure(ITestResult result) 
	{
		extenttest.log(Status.FAIL, "Test case is Failure "+result.getMethod().getMethodName());
		//System.out.println("Test case is Failure "+result.getMethod().getMethodName());
	}

	
	public void onTestSkipped(ITestResult result) 
	{
		extenttest.log(Status.SKIP,"Test case is Skipped "+result.getMethod().getMethodName());
		//System.out.println("Test case is Skipped "+result.getMethod().getMethodName());
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	public void onTestFailedWithTimeout(ITestResult result)
	{
		

	}
	

	
	public void onFinish(ITestContext context) 
	{
		extent.flush();
		System.out.println("suite is completed");
	}

	
}
