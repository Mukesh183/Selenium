package interviewQuestionsSelenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer  {
	int failedCount = 0;
	int maxCount = 4;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedCount<maxCount) {
			failedCount++;
			return true;
		}
		
		return false;
	}

}
