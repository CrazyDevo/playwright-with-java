package com.cydeo.tests.day_03.pac_03_using_singleton_with_playwright;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import org.junit.jupiter.api.Test;

public class P02_LoginFormWithSingleton {


    @Test
    void test1() {

        Driver.getPage().navigate("https://practice.cydeo.com/login");
        Driver.getPage().locator("input").first().fill("tomsmith");
        Driver.getPage().locator("input").last().fill("SuperSecretPassword");
        Driver.getPage().getByTestId("wooden_spoon").click();


        BrowserUtils.sleepWithThread(4);
        Driver.closeDriver();

    }
}
