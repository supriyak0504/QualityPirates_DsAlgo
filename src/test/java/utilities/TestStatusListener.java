package utilities;

import baseDriverProperty.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestStatusListener extends BaseClass implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("Test case failed");

        try
        {
            FailedScreenshot(result.getName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
