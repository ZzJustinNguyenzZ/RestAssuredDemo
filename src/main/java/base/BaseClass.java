package base;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.ExtentReportListener;
import utility.RestFWLogger;

public class BaseClass extends ExtentReportListener {

    // Basic Functions of Framework

    public static Response getRequest(String requestURI, String cookie) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie(cookie);
        Response response = requestSpecification.get(requestURI);
        RestFWLogger.info("Request Response is - " + response.getBody().asString());
        test.log(LogStatus.INFO, "Request Response is:" + response.getBody().asString());
        return response;
    }

    public static Response postRequest(String requestURI, String requestPayLoad, String auth) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RestFWLogger.info("Request Payload is - " + requestPayLoad);
        RequestSpecification requestSpecification = RestAssured.given().body(requestPayLoad);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.header("Authorization", "Bearer " + auth);
        Response response = requestSpecification.post(requestURI);
        RestFWLogger.info("Request Response is - " + response.getBody().asString());
        return response;
    }

    public static Response oscPostRequest(String requestURI, String requestPayLoad, String cookie) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RestFWLogger.info("Request Payload is - " + requestPayLoad);
        RequestSpecification requestSpecification = RestAssured.given().body(requestPayLoad);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("Authorization", "Bearer " + cookie);
        Response response = requestSpecification.post(requestURI);
        RestFWLogger.info("Request Response is - " + response.getBody().asString());
        return response;
    }

    public static Response putRequest(String requestURI, String requestPayLoad) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RestFWLogger.info("Request Payload is - " + requestPayLoad);
        RequestSpecification requestSpecification = RestAssured.given().body(requestPayLoad);
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.put(requestURI);
        RestFWLogger.info("Request Response is - " + response.getBody().asString());
        return response;
    }

    public static Response deleteRequest(String requestURI) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.delete(requestURI);
        RestFWLogger.info("Request Response Status Code is - " + response.getStatusCode());
        return response;
    }

    public static Response deleteRequest(String requestURI, String bearer_token) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.header("Content-Type", "application/json");
        requestSpecification.header("Authorization", "Bearer " + bearer_token);
        Response response = requestSpecification.delete(requestURI);
        RestFWLogger.info("Request Response Status Code is - " + response.getStatusCode());
        return response;
    }

    public static Response deleteRequestWithPayload(String requestURI, String requestPayLoad) {
        RestFWLogger.initLogger();
        RestFWLogger.info("Request URI is - " + requestURI);
        RestFWLogger.info("Request Payload is - " + requestPayLoad);
        RequestSpecification requestSpecification = RestAssured.given().body(requestPayLoad);
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.delete(requestURI);
        RestFWLogger.info("Request Response Status Code is - " + response.getStatusCode());
        return response;
    }

}
