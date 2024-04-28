package com.cydeo.tests.day_04.pac_01_upload_actions_js;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P03_ScrollPractice {

    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/");
    }

    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);

        Driver.closeDriver();
    }


    @Test
    void test1() {

        //first scroll with js
        BrowserUtils.sleepWithThread(2);
        //scroll down 500 pixel
       // Driver.getPage().evaluate("() => { window.scrollBy(0, 500);}");
        //BrowserUtils.sleepWithThread(2);
        //scroll up 500 pixel
      //  Driver.getPage().evaluate("() => { window.scrollBy(0, -500);}");


        //scroll bottom
       //  Driver.getPage().evaluate("() => { window.scrollBy(0, 3*window.innerHeight);}");

        //using mouse

        Driver.getPage().mouse().wheel(0,1000);

        BrowserUtils.sleepWithThread(2);
        Driver.getPage().mouse().wheel(0,-500);


    }
}
