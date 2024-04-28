package com.cydeo.tests.day_04.pac_02_pom_waits_actions;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P03_ExplicitWaitTask2 {

    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/dynamic_controls");
    }


    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);

        Driver.closeDriver();
    }


    @Test
    void test1() {


        Driver.getPage().getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Remove")).click();

       BrowserUtils.waitForInvisibilityOfElement(Driver.getPage().locator("#loading"));

        System.out.println(Driver.getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).isVisible());

    }
}
