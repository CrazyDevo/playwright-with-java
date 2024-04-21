package com.cydeo.tests.day_02.pac_01_multipleElements_checkbox_radio;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class P01_xpath_css_ElementHandle {


    @Test
    public void test1(){
        Playwright playwright=Playwright.create();
        /*
       BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));

         */

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/forgot_password");


        ElementHandle homeLink = page.querySelector("a.nav-link");

        ElementHandle emailLabel = page.querySelector("div label");


        System.out.println(homeLink.textContent());
        System.out.println(emailLabel.textContent());
        System.out.println("homeLink.isVisible() = " + homeLink.isVisible());
        System.out.println("emailLabel.isVisible() = " + emailLabel.isVisible());


        page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();


    }


}
