package com.vertafore.autotest.steps;

import com.github.javafaker.Faker;
import com.vertafore.autotest.Utilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.client.methods.RequestBuilder;
import org.hamcrest.Matchers;

import java.io.IOException;

import static io.restassured.config.EncoderConfig.encoderConfig;
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
        requestBuilder.addQueryParam("apikey", utils.getProperty("APIKey"));
        requestSpec = requestBuilder.build();
        Serenity.getCurrentSession().put("requestSpec", requestSpec);
    }

    @Step
    public void GETResponse()
    {
        response = given().spec(requestSpec)
                .when()
                    .get(SerenityRest.getDefaultBasePath())
                .then()
                    .extract().response();
    }

    @Step
    public void GETCollectionByID()
    {
        response = given().spec(requestSpec)
                .when()
                    .get(SerenityRest.getDefaultBasePath() + "/" + Serenity.getCurrentSession().get("CollectionUID"))
                .then()
                    .extract().response();
    }


    @Step
    public void PUTcollectionByID()
    {
        response = given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"collection\": {\n" +
                        "    \"info\": {\n" +
                        "      \"name\": \"Sample Collection "
                        + Faker.instance().number().randomNumber() +
                        "\",\n" +
                        "      \"description\": \"This is just a sample collection.\",\n" +
                        "      \"_postman_id\": \"174bad7c-07e3-45f3-914f-36cf84e5586f\",\n" +
                        "      \"schema\": \"https://schema.getpostman.com/json/collection/v2.1.0/collection.json\"\n" +
                        "    },\n" +
                        "    \"item\": [\n" +
                        "      {\n" +
                        "        \"name\": \"This is a folder\",\n" +
                        "        \"item\": [\n" +
                        "          {\n" +
                        "            \"name\": \"Sample POST Request\",\n" +
                        "            \"request\": {\n" +
                        "              \"url\": \"https://postman-echo.com/post\",\n" +
                        "              \"method\": \"POST\",\n" +
                        "              \"header\": [\n" +
                        "                {\n" +
                        "                  \"key\": \"Content-Type\",\n" +
                        "                  \"value\": \"application/json\"\n" +
                        "                }\n" +
                        "              ],\n" +
                        "              \"body\": {\n" +
                        "                \"mode\": \"raw\",\n" +
                        "                \"raw\": \"{\\\"data\\\": \\\"123\\\"}\"\n" +
                        "              },\n" +
                        "              \"description\": \"This is a sample POST Request\"\n" +
                        "            }\n" +
                        "          }\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      {\n" +
                        "        \"name\": \"Sample GET Request\",\n" +
                        "        \"request\": {\n" +
                        "          \"url\": \"https://postman-echo/get\",\n" +
                        "          \"method\": \"GET\",\n" +
                        "          \"description\": \"This is a sample GET Request\"\n" +
                        "        }\n" +
                        "      }\n" +
                        "    ]\n" +
                        "  }\n" +
                        "}")
                .when()
                    .put(SerenityRest.getDefaultBasePath() + "/" + Serenity.getCurrentSession().get("CollectionUID"))
                .then()
                    .extract().response();
    }


    @Step
    public void POSTcollection()
    {
        response = given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"collection\": {\n" +
                        "    \"info\": {\n" +
                        "      \"name\": \"Sample Collection "
                        + Faker.instance().number().randomNumber() +
                        "      \",\n" +
                        "      \"description\": \"This is just a sample collection.\",\n" +
                        "      \"schema\": \"https://schema.getpostman.com/json/collection/v2.1.0/collection.json\"\n" +
                        "    },\n" +
                        "    \"item\": [\n" +
                        "      {\n" +
                        "        \"name\": \"This is a folder\",\n" +
                        "        \"item\": [\n" +
                        "          {\n" +
                        "            \"name\": \"Sample POST Request\",\n" +
                        "            \"request\": {\n" +
                        "              \"url\": \"https://postman-echo.com/post\",\n" +
                        "              \"method\": \"POST\",\n" +
                        "              \"header\": [\n" +
                        "                {\n" +
                        "                  \"key\": \"Content-Type\",\n" +
                        "                  \"value\": \"application/json\"\n" +
                        "                }\n" +
                        "              ],\n" +
                        "              \"body\": {\n" +
                        "                \"mode\": \"raw\",\n" +
                        "                \"raw\": \"{\\\"data\\\": \\\"123\\\"}\"\n" +
                        "              },\n" +
                        "              \"description\": \"This is a sample POST Request\"\n" +
                        "            }\n" +
                        "          }\n" +
                        "        ]\n" +
                        "      }\n" +
                        "    ]\n" +
                        "  }\n" +
                        "}")
                .when()
                .post(SerenityRest.getDefaultBasePath())
                .then()
                .extract().response();

        response.prettyPrint();
    }

    @Step
    public void ValidateStatusCode(int statusCode)
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


    @Step
    public void ValidateCollectionCreated()
    {
        then().body("collection.name", Matchers.containsString("Sample Collection"));
    }

    @Step
    public void GetCollectionUID()
    {
        String id = then().extract().response().jsonPath().get("collection.uid");
        Serenity.getCurrentSession().put("CollectionUID", id);
    }

    @Step
    public void DELETECollection()
    {
        response =
             given()
                .spec(requestSpec)
                .delete(SerenityRest.getDefaultBasePath()
                        + "/" + Serenity.getCurrentSession().get("CollectionUID"))
            .then()
                .extract().response();
    }


}
