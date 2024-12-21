package com.example.ex_CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab270 {

    @Test
    public void getRequestNonBddStyle(){

        RequestSpecification rs = RestAssured.given();

        rs.baseUri("https://api.zippopotam.us/");
        rs.basePath("IN/560037");

        rs.when().get();

        rs.then().log().all().statusCode(200);

    }
}
