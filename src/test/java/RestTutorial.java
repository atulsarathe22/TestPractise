import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestTutorial {

   @Test
    public void firstTest(){
        RestAssured.baseURI="https://maps.googleapis.com";

        given().
                param("location","-33.8670522,151.1957362").
                param("radius","1500").
                param("key","AIzaSyD8UVaOWbAMye84vJOYffPG02Djp8XVc5E").
                when().get("/maps/api/place/nearbysearch/json").then().
                assertThat().statusCode(200).and().body("status",equalTo("OVER_QUERY_LIMIT"));
    }

    @Test
    public void getFileName(){
        RestAssured.config = RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames().relaxedHTTPSValidation());
       RestAssured.baseURI="https://lopescgc-dev.us-west-2.elasticbeanstalk.com";
        String a=given().contentType("application/json")
                .header("api-key", "demo-key")
                .pathParam("submissionId", "2ec3a699-abfe-4b03-bfc8-74106a7f1bd6").
                queryParam("tenantId",3)
                .when()
                .get("/webapi/v1.0/submissions/{submissionId}").path("originalFile");
        System.out.println(a);

    }

    @Test
    public void getFileName1(){
        RestAssured.config = RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames().relaxedHTTPSValidation());
        RestAssured.baseURI="https://lopescgc-dev.us-west-2.elasticbeanstalk.com";
        Response response=given().contentType("application/json")
                .header("api-key", "demo-key")
                .pathParam("submissionId", "2ec3a699-abfe-4b03-bfc8-74106a7f1bd6").
                        queryParam("tenantId",3)
                .when()
                .get("/webapi/v1.0/submissions/{submissionId}");
        JsonPath jsonpathEvaluator=response.jsonPath();
        String a= jsonpathEvaluator.get("originalFile").toString();
        System.out.println(a);

    }
}
