package com.cydeo.pages;

import com.cydeo.utils.Driver;
import com.microsoft.playwright.Locator;
import lombok.Getter;

@Getter
public class DynamicPage {

    private final  Locator alertMessage;


    public DynamicPage() {
        this.alertMessage = Driver.getPage().getByTestId("alert");
    }

}
