package com.cydeo.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class BrowserFactory {

    public  static Browser getBrowser(String browserFromConfig, Playwright playwright) {
        Browser browser=null;

        switch (browserFromConfig){
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                break;

            case  "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));

                break;
        }

  return browser;
    }
}
