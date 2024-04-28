package com.cydeo.tests.day_04.pac_01_upload_actions_js;

import com.cydeo.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class P02_Hover {

    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/hovers");
    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }



}
