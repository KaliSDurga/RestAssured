package com.example.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab262 {

    @Test(enabled = false)
    public void getRequest1(){
        System.out.println("TC1");
    }

    @Test
    public void getRequest2(){
        System.out.println("TC2");
    }

    @Test
    public void getRequest3(){
        System.out.println("TC3");
    }
}
