package com.cydeo.tests.day_03.pac_01_alerts_frames_windows;

import com.cydeo.utils.BrowserUtils;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class P03_WindowsHandle {


    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
               // .setSlowMo(1000) //do not use with window handle or use promise
        );
    }


    @AfterAll
    static void afterAll() {

        browser.close();
        playwright.close();
    }


    @BeforeEach
    void setUp() {
        page = browser.newContext().newPage();
        page.navigate("https://practice.cydeo.com/windows");
    }

    @AfterEach
    void tearDown() {
BrowserUtils.sleepWithThread(3);
page.close();
    }

    @Test
    void test1() {


       // page.pause();
        //get the title
        System.out.println("before clicking page title = " + page.title());

        //click Click Here button (it will open a new tab)



     //   search   it
        ElementHandle locator = page.querySelector("text=Click Here");


        locator.click();



        //get second window title
        BrowserUtils.sleepWithThread(3);
/*
        Page secondPage = page.waitForPopup(() -> {
            page.getByText("Click Here").click();
        });
*/

        Page secondPage = page.waitForPopup(() -> {});
        System.out.println("after clicking button second page title= " + secondPage.title());

        BrowserUtils.sleepWithThread(3);
        //go back to first page
        page.bringToFront();
        BrowserUtils.sleepWithThread(3);
        secondPage.bringToFront();
        BrowserUtils.sleepWithThread(3);

        page.bringToFront();

        //Click home

        page.click("text=Home");

        BrowserUtils.sleepWithThread(3);

        //get the title again

        System.out.println("practice title= "+page.title());


    }
}
