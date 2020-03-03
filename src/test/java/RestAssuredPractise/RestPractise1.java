package RestAssuredPractise;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.patch;

import Resource.payLoad;

import java.nio.file.Files;
import java.nio.file.Paths;

public class RestPractise1 {
    @Test (dataProvider = "booksData")
    public void addBook(String isbn, String aisle){
        RestAssured.baseURI="http://216.10.245.166";

        //Adding a book
        Response response= given().
                header("Content-Type","application/json").
               body(payLoad.addBook(isbn,aisle)).
                when().post("/Library/Addbook.php").then().
                statusCode(200).extract().response();
        System.out.println(response.getBody().asString());
        JsonPath jsonPath=response.jsonPath();
        String id= jsonPath.get("ID");
        System.out.println(id);
    }

    @DataProvider(name="booksData")
    public Object[][] getData(){
       return new Object[][]{{"12","34"},{"12","45"},{"12","56"}};
    }

    public static String GenerateStringFromResource(String path) throws Exception{
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
