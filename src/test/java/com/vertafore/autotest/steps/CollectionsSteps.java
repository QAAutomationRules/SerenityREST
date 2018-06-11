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
        scenarioActions.ValidateStatusCode(statusCode);
    }

    @Then("^the response contains collections$")
    public void the_response_contains_collections() throws Exception {
        scenarioActions.ValidateCollections();
    }

    @Given("^I set the Content Type to \"([^\"]*)\"$")
    public void i_set_the_Content_Type_to(String contentType) throws Exception {
        scenarioActions.setContentType(contentType);
    }

    @Then("^the new collection is created in the POSTMAN System$")
    public void the_new_collection_is_created_in_the_POSTMAN_System() throws Exception {
        scenarioActions.ValidateCollectionCreated();
    }

    @Then("^the response is returned with the collection data associated with the ID$")
    public void the_response_is_returned_with_the_collection_data_associated_with_the_ID() throws Exception {
        scenarioActions.GetCollectionUID();
    }


    @Then("^I capture the created collections ID$")
    public void i_capture_the_created_collections_ID() throws Exception {
        scenarioActions.GetCollectionUID();
    }


    @When("^I execute a DELETE collection request$")
    public void i_execute_a_DELETE_collection_request() throws Exception {
        scenarioActions.DELETECollection();
    }

    @When("^I execute a PUT collection method request$")
    public void i_execute_a_PUT_collection_method_request() throws Exception {
        scenarioActions.PUTcollectionByID();
    }

    @When("^I execute the GET collection by ID request$")
    public void iExecuteTheGETCollectionByIDRequest() throws Throwable {
        scenarioActions.GETCollectionByID();
    }

    @When("^I execute the POST collection request$")
    public void iExecuteThePOSTCollectionRequest() throws Throwable {
        scenarioActions.POSTcollection();
    }

    @When("^I execute the POST collection request using an Immutable object$")
    public void i_execute_the_POST_collection_request_using_an_Immutable_object() throws Exception {
        scenarioActions.POSTcollectionDTO();
    }
}
