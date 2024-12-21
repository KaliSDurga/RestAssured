package com.example.ex_CRUD.GET.BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab269 {

    //BDD Style
    @Test
    public void getRequest(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/560037")

                .when()
                .log().all().get()

                .then()
                .log().all()
                .statusCode(200);
    }

}
