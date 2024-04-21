package com.cydeo.tests.day_02.pac_01_multipleElements_checkbox_radio;

import com.cydeo.utils.BrowserUtils;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

public class P03_ClickWithIndex {

    @Test
    void test1() {

        Playwright playwright = Playwright.create();
        /*
       BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));

         */

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/");

        BrowserUtils.sleepWithThread(3);
        List<ElementHandle> elementHandles = page.querySelectorAll(".container li a");
        System.out.println("elementHandles.size() = " + elementHandles.size());

        BrowserUtils.sleepWithThread(3);
       page.locator(".container li a")
               // .first()
              //  .last()
                .nth(4)
                .click();




        for (int i = 0; i < elementHandles.size(); i++) {
            Locator locator = page.locator(".container li a").nth(i);

            if (locator.textContent().equals("A/B Testing")) {

                page.locator(".container li a")
                        // .first()
                      //    .last()
                      //  .nth(i)
                        .click();

                break;
            }


        }


        BrowserUtils.sleepWithThread(3);

        page.close();
        browser.close();
        playwright.close();


    }
}
