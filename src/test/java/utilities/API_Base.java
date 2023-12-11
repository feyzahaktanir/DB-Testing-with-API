package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
public class API_Base {

    protected RequestSpecification spec01;
    protected Map<String, String> bookingDatesMAP = new HashMap<>();
    protected Map<String, String> requestBodyMAP = new HashMap<>();
    protected JSONObject jsonBookingDatesBody = new JSONObject();
    protected JSONObject jsonRequestBody =  new JSONObject();

    @Before
    public void setSpec01(){
        spec01 =new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
    }

    protected Response createRequestBoduByJSONObject(){

        jsonBookingDatesBody.put("checkin","2022-06-22");
        jsonBookingDatesBody.put("checkout","2023-05-07");


        jsonRequestBody.put("firstname","Feyza");
        jsonRequestBody.put("lastname","Test");
        jsonRequestBody.put("totalprice",456);
        jsonRequestBody.put("depositpaid",true);
        jsonRequestBody.put("bookingdates",jsonBookingDatesBody);
        jsonRequestBody.put("additionalneeds","Ebook");

        Response response= given().
                contentType(ContentType.JSON).
                spec(spec01).
                auth().basic("admin", "password123").
                body(jsonRequestBody.toString()).when().post("/booking");

        return response;
    }
}
