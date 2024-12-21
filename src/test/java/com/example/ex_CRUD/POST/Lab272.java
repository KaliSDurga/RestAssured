package com.example.ex_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab272 {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;

    @Test
    public void testNonBDDStylePOSTPositive() {
        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String Payload = "{\n" +
                "    \"firstname\": \"Jim1\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2013-02-23\",\n" +
                "        \"checkout\": \"2014-10-23\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);

        r.contentType(ContentType.JSON).log().all();
        r.body(Payload);

        response = r.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);

         vr = response.then();
        vr.statusCode(200);
    }

    }
