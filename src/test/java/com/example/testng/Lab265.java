package com.example.testng;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab265 {

        @Test
        public void testCase() {

            //Soft Assertion

//            SoftAssert s = new SoftAssert();
//            s.assertEquals("pramod", "pramod", "Not Equal");
//            System.out.println("End of the Test");
//            s.assertAll();
//
            //Hard Assertion
            Assert.assertEquals("pramod", "pramod");
            System.out.println("End of the Test");
                   }
    }
