package com.example.ex_CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import javax.print.attribute.standard.RequestingUserName;

public class Lab273 {


    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token ="eacadeef928f2aa";
    String bookingid = "3154";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";

    @Test
    public void testPutRequestNonBDD(){
        String BASE_PATH_UPDATE = BASE_PATH + "/"+ bookingid;
        System.out.println(BASE_PATH_UPDATE);

        String payLoad ="{\n" +
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
        r.basePath(BASE_PATH_UPDATE);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payLoad).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("Jim1"));
        vr.body("lastname", Matchers.equalTo("Brown"));

    }
}
