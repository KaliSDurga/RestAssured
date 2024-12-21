package com.example.ex_CRUD.FULL;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab276 {

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingId(){
        System.out.println("2");
    }

    @Test
    public void t3(){
        System.out.println("3");
    }
}
