import apiVerifications.APIVerification;
import base.BaseClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.groupItems.GroupItems;
import pojo.groupItems.Item;
import utility.*;

import java.util.ArrayList;
import java.util.Collections;

@Listeners(ExtentReportListener.class)

public class GetListStore extends ExtentReportListener {
    ObjectMapper objectMapper;
    Response response;
    String bearer_Token = Authn.getBearerToken();
    String cookie = Authn.getCookie();
    String appID = "742";
    String storeID = "1444_4878";

//    @Test
//    public void getListStore() {
//        RestFWLogger.initLogger();
//        RestFWLogger.startTestCase("Get List Store");
//        String endPoint = CreateUrl.getBaseURI("/v1/oa-shop/742/stores");
//        response = BaseClass.getRequest(endPoint, cookie);
//
//        APIVerification.verifyResponseValue(APIVerification.countJsonObject(response, "data"), "1");
//        APIVerification.verifyResponseValue(APIVerification.countJsonArray(response, "data", "stores"), "6");
//        RestFWLogger.endTestCase();
//
//    }

//    @Test
//    public void getListItems() throws JsonProcessingException {
//        RestFWLogger.initLogger();
//        RestFWLogger.startTestCase("Get List Items");
//        String endPointGetListItems = CreateUrl.getBaseURI("/v1/oa-shop/" + appID + "/food-items?promotion_status=1&page_index=1&page_size=50&store_id=" + storeID);
//        response = BaseClass.getRequest(endPointGetListItems, cookie);
//        JsonPath jsonRespons = response.jsonPath();
//        APIVerification.verifyResponseValue(APIVerification.countJsonArray(response, "data", "food_items"), "2");
//        String itemsID = jsonRespons.get("data.food_items[0].id");
//        RestFWLogger.initLogger();
//        RestFWLogger.startTestCase("Create Order");
//        String endPointCreateOrder = CreateUrl.getBaseURI("/v1/oa-shop/create-order");
//        String json = "{\r\n  \"items\": [\r\n    {\r\n      \"id\": \"" + itemsID + "\",\r\n      \"price\": \"39900\",\r\n      \"quantity\": 10\r\n    }\r\n  ],\r\n  \"appID\": \"742\",\r\n  \"address\": {\n    \"street\": \"363-365, 367 Hai Bà Trưng\",\n    \"wards\": \"Phường 09\",\n    \"district\": \"Quận 3\",\n    \"province\": \"Thành phố Hồ Chí Minh\"\n  },\r\n  \"name\": \"tamnguyen\",\r\n  \"phone\": \"84948357024\",\r\n  \"note\": \"\",\r\n  \"store_id\": \"1444_4878\",\r\n  \"orderType\": \"COD\"\r\n}";
//        response = BaseClass.oscPostRequest(endPointCreateOrder, json, cookie);
//
//    }

    @Test(priority = 1)
    public void importItems() throws JsonProcessingException {

        RestFWLogger.initLogger();
        RestFWLogger.startTestCase("Get List Items");

        Item item = new Item();
        item.setId("1");
        item.setName("Thịt");
        item.setBarcode("2601492");
        item.setSort(0);
        item.setCategoryRefIds(Collections.singletonList("1"));
        item.setCategoryIds(Collections.singletonList(""));
        item.setImage("https://sb-staticmep.zalopay.vn/sb/742/742_991-2601492_1000_2601492_00952732-1.png");
        item.setBasePrice(49000);
        item.setPrice(39000);
        item.setDescription("");
        item.setStock(100);
        item.setStatus(1);
        item.setIsDeleted(false);
        item.setAppId(appID);
        item.setSequenceId(1);
        item.setStoreId(storeID);
        item.setSectionId("");
        item.setNote("");
        item.setGoldCode("00952732");
        item.setLimitQuantity(99);
        item.setItemType(0);
        item.setSv(1);

        ArrayList list = new ArrayList();
        list.add(item);

        GroupItems example = new GroupItems();
        example.setAppId(appID);
        example.setItems(list);
        example.setIsUpdate(false);
        example.setStoreId(storeID);

        objectMapper = new ObjectMapper();


        objectMapper = new ObjectMapper();
        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(example);
        RestFWLogger.info("Request Payload - " + payload);
        String endPoint = CreateUrl.getBaseURI(Route.ImportItems());
        response = BaseClass.postRequest(endPoint, payload, bearer_Token);
        APIVerification.responseCodeValidation(response, 200);


    }

    @Test(priority = 2)
    public void getListItems() {
        objectMapper = new ObjectMapper();
        String endPoint = CreateUrl.getBaseURI(Route.GetListItems(appID, storeID));
        response = BaseClass.getRequest(endPoint, cookie);
        APIVerification.responseCodeValidation(response, 200);
    }

//    @Test
//    public void GetWeatherDetails() {
//        // Specify the base URL to the RESTful web service
//        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
//
//        // Get the RequestSpecification of the request that you want to sent
//        // to the server. The server is specified by the BaseURI that we have
//        // specified in the above step.
//        RequestSpecification httpRequest = RestAssured.given();
//
//        // Make a request to the server by specifying the method Type and the method URL.
//        // This will return the Response from the server. Store the response in a variable.
//        Response response = httpRequest.request(Method.GET, "/Hyderabad");
//
//        // Now let us print the body of the message to see what response
//        // we have recieved from the server
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is =>  " + responseBody);
//
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
//
//        String contentType = response.header("Content-Type");
//        System.out.println("Content-Type value: " + contentType);
//        Assert.assertEquals(contentType, "application/json; charset=utf-8");
//
//        String serverType = response.header("Server");
//        System.out.println("Server value: " + serverType);
//        Assert.assertEquals(serverType, "nginx/1.17.10 (Ubuntu)");
//
//    }
//
//    @Test
//    public void GetWeatherDetailsInvalidCity() {
//        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
//        RequestSpecification httpRequest = RestAssured.given();
//        Response response = httpRequest.get("/78789798798");
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is =>  " + responseBody);
//
//        String statusLine = response.getStatusLine();
//        System.out.printf(statusLine);
//        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
//
//
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
//
//        Headers allHeaders = response.headers();
//
//        for (Header header : allHeaders) {
//            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
//
//        }
//    }
//
//    @Test
//    public void WeatherMessageBody()
//    {
//        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
//        RequestSpecification httpRequest = RestAssured.given();
//        Response response = httpRequest.request(Method.GET, "/Hyderabad");
//
//        ResponseBody body = response.getBody();
//
//        System.out.println("Response Body is: " + body.asString());
//
//        String bodyAsString = body.asString();
//
//        Assert.assertEquals(bodyAsString.contains("Hyderabad"), true, "Response body contains Hyderabad");
//
//        JsonPath jsonPath = response.jsonPath();
//
//        String City =  jsonPath.get("City");
//
//        System.out.println(City);
//
//
//    }
//
//
}
