import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RestAssuredPractise {


    @Test
    public void getWeatherDetails(){
       RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest= RestAssured.given();
        Response response=  httpRequest.request(Method.GET,"/hyderabad");
        String responseBody= response.getBody().asString();
        System.out.println("response body is -->"+responseBody);

        JsonPath jsonPathEvaluator=response.jsonPath();
        String City=jsonPathEvaluator.get("City");
        String Temperature=jsonPathEvaluator.get("Temperature");
        String WindSpeed=jsonPathEvaluator.get("WindSpeed");
        String WindDirectionDegree=jsonPathEvaluator.get("WindDirectionDegree");

        System.out.println("City is -->"+City);
        System.out.println("Temperature is -->"+Temperature);
        System.out.println("WindSpeed is -->"+WindSpeed);
        System.out.println("WindDirectionDegree is -->"+WindDirectionDegree);

        int status=response.getStatusCode();
        System.out.println("statusCode is -->"+status);

        //Map<String,String> resultMap= response.getCookies();
        Headers allHeaders= response.getHeaders();
        for(Header header: allHeaders){
            System.out.println(header.getName()+"-->"+ header.getValue());
        }

        String contentType=response.getHeader("Content-Type");
        System.out.println("contentType is-->"+contentType);
    }


    @Test
    public void postRequestTest(){

        RestAssured.baseURI= "http://restapi.demoqa.com/customer";
        RequestSpecification httpRequest= RestAssured.given();

        JSONObject js=new JSONObject();
        js.put("FirstName","Atul1");
        js.put("LastName","Sarathe");
        js.put("Password","password1");
        js.put("UserName", "sdimpleuser2dd2011");
        js.put("Email",  "atul@gmail.com");

        httpRequest.body(js.toJSONString());
        //httpRequest.header("Content-Type", "application/json");
        Map<String,String > map= new HashMap<String, String>();
        map.put("Content-Type", "application/json");
        httpRequest.headers(map);

        Response response = httpRequest.request(Method.POST,"/register");

        System.out.println("Status code is-->"+response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),200, "Status Mismatch");

        System.out.println("response body is-->"+response.getBody().asString());

    }


    @Test
    public void timeTaken(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest=RestAssured.given();
        long t=  httpRequest.request(Method.GET,"/hyderabad").timeIn(TimeUnit.MILLISECONDS);
        System.out.println("time taken is-->"+t);
    }

    @Test
    public void testLog(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RestAssured.basePath="/hyderabad";
        RequestSpecification httpRequest=RestAssured.given();
      //  Response response= httpRequest.request(Method.GET,"/hyderabad");
       Response response =httpRequest.request(Method.GET);
        response.then().log()
                .headers();
                //.body();
                //.all();
                //.cookies();

        /* if any error occurs then logged  */
        response.then().log().ifError();


        /* condition logging */

        response.then().log().ifStatusCodeIsEqualTo(200);
    }
}
