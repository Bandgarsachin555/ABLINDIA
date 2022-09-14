package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportsSetup  {

	public static ExtentReports extent;
	
	public static ExtentReports reports()
	{
		ExtentSparkReporter sparks=new ExtentSparkReporter("C:\\Users\\vilaas\\eclipse-workspace\\Hybrid\\src\\main\\resorce");
		
		 extent=new ExtentReports();
		 
	      extent.attachReporter(sparks);
	      sparks.config().setDocumentTitle("sachin");
	      sparks.config().setTheme(Theme.DARK);
		return extent;
		
	}
	
	
}
