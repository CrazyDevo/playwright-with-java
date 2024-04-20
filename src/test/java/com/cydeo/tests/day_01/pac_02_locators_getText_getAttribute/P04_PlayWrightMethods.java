package com.cydeo.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

public class P04_PlayWrightMethods {

    @Test
    void test() {

        Playwright playwright=Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();


        page.navigate("https://library2.cybertekschool.com/login.html");

        page.getByPlaceholder("Email address",new Page.GetByPlaceholderOptions().setExact(true)).fill("incorrectemail" +
                "@gmail.com");


       // page.getByLabel("Password").fill("incorectpassword");
       // page.getByPlaceholder("Password").fill("incorectpassword");
        page.querySelector("#inputPassword").fill("incorectpassword");

       // page.getByRole(AriaRole.BUTTON,                new Page.GetByRoleOptions().setName("Sign in").setExact(true)).click();

        page.getByRole(AriaRole.BUTTON).click();



        System.out.println(page.getByRole(AriaRole.ALERT).textContent());

        System.out.println(page.getByRole(AriaRole.ALERT).isVisible());
        page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();


    }
}
