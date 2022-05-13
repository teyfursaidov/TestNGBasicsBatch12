package class03;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case that failed is: "+result.getName());
    }

}
