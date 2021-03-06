package reusableComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @author: Akshat Rajvaidya
 * @LinkedIn: https://www.linkedin.com/in/akshat009
 */
public class TestRetryAnalyzer implements IRetryAnalyzer {

	int counter = 1;
	int retryMaxLimit  = Integer.valueOf(PropertiesOperations.getPropertyValueByKey("retryCount"));
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retryMaxLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
