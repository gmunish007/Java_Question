package TestNg;

import org.testng.ITestResult;

public class IRetryAnalyzer implements org.testng.IRetryAnalyzer {

    int count =0;
    int maxTry=1;

    @Override
    public boolean retry(ITestResult result) {
        if(count<maxTry){
            count++;
            return true; //it will run till this true. Meansing as long as your test is failing it will return true.
        }
        return false;
    }
}

// now call the retry on method on which it failed.
//public class Test{
//
//    @Test(retryAnalyzer=IRetryAnalyzer.class)
//    public void reRun(){
//
//    }
//}
