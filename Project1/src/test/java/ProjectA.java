package stepdefinitionfiles;

import Tests.string;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.DataFile;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class ProjectA {

    @Test
    public void Frankfurt(){
        string endpoint = "https://api.citybik.es/v2/networks"
        var response = given().queryParam("id", "visa-frankfurt").
                when().get(endpoint).
                then().assertThat().
                body("country", equals("DE")).
                body("latitude", equals("50.1072")).
                body("longitude", equals("8.66375"))
                ;
        response.log().body();
    }


}
