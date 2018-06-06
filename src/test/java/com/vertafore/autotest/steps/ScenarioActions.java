package com.vertafore.autotest.steps;

import com.vertafore.autotest.Utilities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.client.methods.RequestBuilder;

import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.junit.Assert.assertThat;

public class ScenarioActions {

    Utilities utils;
    Response response;
    RequestSpecBuilder requestBuilder;
    RequestSpecification requestSpec;

    public ScenarioActions() throws IOException {
        utils = new Utilities();
        requestBuilder = new RequestSpecBuilder();
        Serenity.getCurrentSession().put("requestBuilder", requestBuilder);
    }

    @Step
    public void setContentType(String type) {
        requestBuilder.setContentType(type);
        requestSpec = requestBuilder.build();
    }

    @Step
    public void setBasePath()
    {
        SerenityRest.setDefaultBasePath(utils.getProperty("PostmanBaseURL"));
    }

    @Step
    public void setAPIKey()
    {
        requestBuilder.addParam("apikey", utils.getProperty("APIKey"));
        requestSpec = requestBuilder.build();
        Serenity.getCurrentSession().put("requestSpec", requestSpec);
    }

    @Step
    public void GETResponse()
    {
        response = given().spec(requestSpec)
                .when().get(SerenityRest.getDefaultBasePath())
                .then().extract().response();
    }

    @Step
    public void GETCollectionByID(String ID)
    {
        response = given().spec(requestSpec)
                .when().get(SerenityRest.getDefaultBasePath() + "/" + ID)
                .then().extract().response();
    }

    @Step
    public void Validate200Response(int statusCode)
    {
        then().statusCode(statusCode);
    }


    @Step
    public void ValidateCollections()
    {
        then().extract().response().body().prettyPrint();
    }

    @Step
    public void ValidateCollectionID()
    {
        then().extract().response().body().prettyPrint();
    }
}
