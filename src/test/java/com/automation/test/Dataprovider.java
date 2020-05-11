package com.automation.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Dataprovider {

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "Cedric", new Integer(36) },
                { "Anne", new Integer(37)},
                { "Ansdsdne", new Integer(24)},
                { "Andsdne", new Integer(88)},

        };
    }

    //This test method declares that its data should be supplied by the Data Provider
//named "test1"
    @Test(dataProvider = "test1")
    public void verifyData1(String n1, Integer n2) {

        System.out.println(n1 + " " + n2

        );
    }

}
