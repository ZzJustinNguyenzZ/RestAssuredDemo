package apiVerifications;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import utility.ExtentReportListener;

public class APIVerification extends ExtentReportListener {
    public static void responseCodeValidation(Response response, int statusCode) {
        try {
            Assert.assertEquals(response.getStatusCode(), statusCode);
            test.log(LogStatus.PASS, "Successfully validated status code is :" + response.getStatusCode());
        } catch (AssertionError e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
            test.log(LogStatus.FAIL, "Expected status code is: " + statusCode + " , instead of getting: " +
                    response.getStatusCode());
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

    public static void responseKeyValidation(Response response, String key) {
        try {
            JSONArray array = new JSONArray(response.getBody().asString());
            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);

                test.log(LogStatus.INFO, "Validated values are " + obj.get(key));
            }
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

    public static void responseKeyValidationFromObject(Response response, String key) {
        try {
            JSONObject json = new JSONObject(response.getBody().asString());
            if (json.has(key) && json.get(key) != null) {
                test.log(LogStatus.PASS, "Successfully validated value of " + key + " It is " + json.get(key));
            } else {
                test.log(LogStatus.FAIL, "Key is not available");
            }
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

    public static void responseTimeValidation(Response response) {
        try {
            long time = response.time();
            test.log(LogStatus.INFO, "API response time: " + time);
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

    public static void verifyResponseValue(String Actual, String Expected) {
        try {
            Assert.assertEquals(Actual, Expected);
            test.log(LogStatus.PASS, "Successfully verified value of " + Actual + " It is " + Expected);
        } catch (AssertionError e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

    public static String countJsonObject(Response response, String key) {
        JSONObject json = new JSONObject(response.getBody().asString());
        System.out.println(json.getJSONObject(key).length());
        String value = String.valueOf(json.getJSONObject(key).length());
        test.log(LogStatus.INFO, "Value of object " + key + ":" + value);
        return value;
    }

    public static String countJsonArray(Response response, String objectKey, String arrayKey) {
        JSONObject json = new JSONObject(response.getBody().asString());
        System.out.println(json.getJSONObject(objectKey).getJSONArray(arrayKey).length());
        String value = String.valueOf(json.getJSONObject(objectKey).getJSONArray(arrayKey).length());
        test.log(LogStatus.INFO, "Value of array " + arrayKey + ":" + value);
        return value;

    }
}
