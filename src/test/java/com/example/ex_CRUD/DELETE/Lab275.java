package com.example.ex_CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab275 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token ="fa4db2596f0efd5";
    String bookingid = "1879";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";

    @Test
    public void testDeleteRequestNonBDD(){
        String BASE_PATH_UPDATE = BASE_PATH + "/"+ bookingid;
        System.out.println(BASE_PATH_UPDATE);


        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH_UPDATE);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.log().all();

        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(201);


    }
}
