package utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class ExtentReportListener implements ITestListener {
    protected static ExtentReports reports;
    protected static ExtentTest test;

    private String reportLocation = System.getProperty("user.dir") + File.separator + "test-output/Report/" + resultPath + "/";
    private static String resultPath = getResultPath();


    public static void deleteDirectory(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (null != files) {
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                    if (files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    } else {
                        files[i].delete();
                    }
                }
            }
        }
    }

    private static String getResultPath() {
        resultPath = "test";//new SimpleDateFormat("yyyy-MM-dd hh-mm.ss").format(new Date());
        if (!new File(resultPath).isDirectory()) {
            new File(resultPath);
        }
        return resultPath;
    }

    public void onTestStart(ITestResult result) {

        test = reports.startTest(result.getMethod().getMethodName());
        test.log(LogStatus.INFO, result.getMethod().getMethodName());
        System.out.println(result.getTestClass().getTestName());
        System.out.println(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(LogStatus.PASS, "Test is pass");

    }

    public void onTestFailure(ITestResult result) {
        test.log(LogStatus.FAIL, "Test is fail");

    }

    public void onTestSkipped(ITestResult result) {
        test.log(LogStatus.SKIP, "Test is skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        System.out.println(reportLocation + "ReportLocation");
        reports = new ExtentReports(reportLocation + "ExtentReport.html");
        test = reports.startTest("");
    }

    public void onFinish(ITestContext context) {
        reports.endTest(test);
        reports.flush();
    }
}

