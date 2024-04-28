package com.cydeo.tests.day_04.pac_01_upload_actions_js;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import com.microsoft.playwright.ElementHandle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P05_ScrollIntoView {


    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com");
    }

    @AfterEach
    void tearDown() {
        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }

    @Test
    void test1() {

        ElementHandle cydeoLink = Driver.getPage().querySelector("text=CYDEO");

        ElementHandle homeLink = Driver.getPage().querySelector("text=Home");


       BrowserUtils.sleepWithThread(3);
        cydeoLink.scrollIntoViewIfNeeded();
        BrowserUtils.sleepWithThread(3);
        homeLink.scrollIntoViewIfNeeded();


    }
}
