package pages.APIpages;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    //Go to endpoint with get and check status code.
    @Test
    public void getMethod01(){
        given().when().get("https://restful-booker.herokuapp.com/booking").then().assertThat().statusCode(200);
    }


    //Printing the data received with get to the console.
    @Test
    public void getMethod02(){
        Response response = given().when().get("https://restful-booker.herokuapp.com/booking/10");

        //Print Response Body to console
        response.prettyPrint();
        //Print statuscode to console
        System.out.println("Statuscode: " + response.statusCode());
        System.out.println("Statuscode: " + response.getStatusCode());
        //Print statusline to console
        System.out.println("Statusline: " + response.statusLine());
        System.out.println("Statusline: " + response.getStatusLine());
        //Print content type in body to console
        System.out.println("Content Type: " + response.contentType());
        System.out.println("Content Type: " + response.getContentType());
        //Print all data in Header to console
        System.out.println(response.getHeaders());
        //Print specific data in Header to console
        System.out.println(response.getHeader("Date"));

        //Assert
        response.then().assertThat().statusCode(200).
                statusLine("HTTP/1.1 200 OK").
                contentType("application/json; charset=utf-8");
    }
}
