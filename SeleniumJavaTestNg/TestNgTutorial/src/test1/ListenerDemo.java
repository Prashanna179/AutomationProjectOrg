package test1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
	
	//	System.out.println("Test case successed");
		//System.out.println(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
		System.out.println(result.getName() + " is  failed testcase name");
	}
	
	
	



	
	
}
