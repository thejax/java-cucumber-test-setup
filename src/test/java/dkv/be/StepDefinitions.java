package dkv.be;

import io.cucumber.core.internal.gherkin.deps.com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class StepDefinitions {

    private String URL = "https://jsonplaceholder.typicode.com/posts";
    private JsonObject quoteRequest = new JsonObject();
    private Response quoteResponse;


    @Given("I'm a private policy holder")
    public void i_m_a_private_policy_holder() {
        quoteRequest.addProperty("title","nicolas");
        quoteRequest.addProperty("body","gg");
    }

    @Given("I've selected a dental plan")
    public void i_ve_selected_a_dental_plan() {
        quoteRequest.addProperty("userId",1);
    }

    @When("I request a quote")
    public void i_request_a_quote() {
        quoteResponse = given().body(quoteRequest.toString()).when().post(URL);
    }

    @Then("I should receive the correct quote")
    public void i_should_receive_the_correct_quote() {
        quoteResponse.then().assertThat()
                .statusCode(201);
    }
}
