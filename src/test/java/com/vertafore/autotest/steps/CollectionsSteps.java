package com.vertafore.autotest.steps;

import com.vertafore.autotest.Utilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class CollectionsSteps {

    @Steps
    ScenarioActions scenarioActions;


    @Given("^I have a base service endpoint for the collections methods in the Postman API$")
    public void i_have_a_base_service_endpoint_for_the_collections_methods_in_the_Postman_API() throws Exception {
        scenarioActions.setBasePath();
    }


    @Given("^I have a valid API Key for the Postman Service$")
    public void i_have_a_valid_API_Key_for_the_Postman_Service() throws Exception {
        scenarioActions.setAPIKey();
    }

    @When("^I execute the GET All collections method$")
    public void i_execute_the_GET_All_collections_method() throws Exception {
        scenarioActions.GETResponse();
    }

    @Then("^the status code returned is '(\\d+)'$")
    public void the_status_code_returned_is(int statusCode) throws Exception {
        scenarioActions.Validate200Response(statusCode);
    }

    @Then("^the response contains collections$")
    public void the_response_contains_collections() throws Exception {
        scenarioActions.ValidateCollections();
    }

    @When("^I execute the GET collection by ID '(.*)' method$")
    public void i_execute_the_GET_collection_by_ID_method(String id) throws Exception {
        scenarioActions.GETCollectionByID(id);
    }

    @Then("^the response is returned with the collection associated with the ID$")
    public void the_response_is_returned_with_the_collection_associated_with_the_ID() throws Exception {
        scenarioActions.ValidateCollectionID();
    }

}
