package com.cydeo.tests.day_02.pac_01_multipleElements_checkbox_radio;

import com.cydeo.utils.BrowserUtils;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;

public class P04_checkbox_radio {


    @Test
    void test1() {


        Playwright playwright = Playwright.create();
        /*
       BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));

         */

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/checkboxes");

        Locator checkbox1 = page.locator("#box1");
    // Locator checkbox1=  page.getByRole(AriaRole.CHECKBOX,new Page.GetByRoleOptions().setChecked(false));


    //   Locator checkbox1= page.getByRole(AriaRole.CHECKBOX).nth(0);
        Locator checkbox2 = page.locator("#box2");


        System.out.println("default before clicking box1: "+checkbox1.isChecked());
        System.out.println("default before clicking box2: "+checkbox2.isChecked());


        BrowserUtils.sleepWithThread(3);


        //checkbox1.click();
        checkbox1.check();
        //checkbox2.click();
        checkbox2.uncheck();

        BrowserUtils.sleepWithThread(3);

        System.out.println("default before clicking box1: "+checkbox1.isChecked());
        System.out.println("default before clicking box2: "+checkbox2.isChecked());

        BrowserUtils.sleepWithThread(3);

        page.close();
        browser.close();
        playwright.close();

    }
}
