package com.cydeo.tests.day_01.pac_03_css_xpath;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class P01_Locators {

    @Test
    void test() {

        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://login1.nextbasecrm.com/");

        page.querySelector("[name=USER_LOGIN]").fill("incorrectuser");
        page.querySelector("[name='USER_PASSWORD']").fill("incorrectpassword");
        page.querySelector(".login-btn").click();

        String errorMessage = page.querySelector(".errortext").textContent();


        System.out.println("errorMessage = " + errorMessage);



        //  page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();


    }
}
