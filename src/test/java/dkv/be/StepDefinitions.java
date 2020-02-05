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

    @When("I request a quote")
    public void i_request_a_quote() {
        quoteResponse = given().body(quoteRequest.toString()).when().post(URL);
    }

    @Then("I should receive the quote with a total value of {int}")
    public void i_should_receive_the_quote_with_a_total_value_of(Integer total) {
        // Write code here that turns the phrase above into concrete actions
        quoteResponse.then().assertThat()
                .statusCode(201);
        System.out.println(total);
    }

    @Given("I've selected the plan {string}")
    public void i_ve_selected_the_plan(String plan) {
        quoteRequest.addProperty("userId",1);

    }
}
