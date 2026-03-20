package TestNg;

import org.testng.ITest;
import org.testng.ITestResult;

public class IRetryAnalyzer implements org.testng.IRetryAnalyzer {

    int count = 0;
    int maxTry = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            if (count < maxTry) {
                count++;
                result.setStatus(ITestResult.FAILURE); // mark that test as failure
                return true; //it will run till this true. Meaning as long as your test is failing it will return true.
            }
            else{
                result.setStatus(ITestResult.FAILURE); //if test still fails then mark it as failure
            }
        }
        else{
            result.setStatus(ITestResult.SUCCESS); //if tests pass then mark it as success
        }
        return false;
    }
}

// now call the retry on method on which it failed.
//public class Test{
//
//    @Test(retryAnalyzer=IRetryAnalyzer.class)
//    public void reRun(){
//    }
//}
