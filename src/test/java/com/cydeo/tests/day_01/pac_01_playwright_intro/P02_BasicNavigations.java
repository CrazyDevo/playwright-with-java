package com.cydeo.tests.day_01.pac_01_playwright_intro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P02_BasicNavigations {


    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/");

        page.waitForTimeout(3000);

        page.navigate("https://google.com");
        page.waitForTimeout(2000);

        //go back to previous page
        page.goBack();

        //wait 2 seconds here
        page.waitForTimeout(2000);

        //go forward to next page
        page.goForward();

        page.waitForTimeout(3000);

        //refresh the page
        page.reload();


        page.close();
        browser.close();
        playwright.close();








    }
}
