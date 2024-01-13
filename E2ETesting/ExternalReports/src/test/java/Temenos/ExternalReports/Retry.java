package Temenos.ExternalReports;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count = 0;
	int maxTry = 1;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxTry)
		{
		count++;
		if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Test failed, retrying....");
			return true;
		}
		}
		
		return false;
	}
}
