package com.vertafore.autotest.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.rest;

public class BaseRest {

    RequestSpecBuilder requestBuilder;
    RequestSpecification requestSpec;

    public BaseRest() {
        requestBuilder = new RequestSpecBuilder();
        Serenity.getCurrentSession().put("requestBuilder", requestBuilder);
    }

    public void storeBaseEndpoint(String baseEndpoint) {
        SerenityRest.setDefaultBasePath(baseEndpoint);
    }

    public void setContentType(String type) {
        requestBuilder = (RequestSpecBuilder) Serenity.getCurrentSession().get("requestBuilder");
        requestBuilder.setContentType(ContentType.JSON);
    }

    public void finalizeRequestSpecFromBuilder() {
        requestBuilder = (RequestSpecBuilder) Serenity.getCurrentSession().get("requestBuilder");
        requestSpec = requestBuilder.build();
        Serenity.getCurrentSession().put("requestSpec", requestSpec);
    }

    public void makeGetCall() {
        requestSpec = (RequestSpecification) Serenity.getCurrentSession().get("requestSpec");
        rest().given()
                .spec(requestSpec)
            .when()
                .get(SerenityRest.getDefaultBasePath());
    }
}
