package com.cydeo.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P05_GetText_GetAttribute {


    @Test
    void test() {

        Playwright playwright=Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/registration_form");

        String expectedTitle="Registration form";

        String actualTitle = page.getByRole(AriaRole.HEADING).textContent();

        Assertions.assertEquals(expectedTitle,actualTitle);


        String placeholder = page.querySelector("//input[@name='firstname']").getAttribute("placeholder");

        System.out.println("placeholder = " + placeholder);

        Assertions.assertEquals("first name",placeholder);


        page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();



    }
}
