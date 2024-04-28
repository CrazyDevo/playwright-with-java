package com.cydeo.pages;

import com.cydeo.utils.Driver;
import com.microsoft.playwright.Locator;
import lombok.Getter;



@Getter
public class LibraryLoginPage {



    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator signInButton;
    private final Locator errorMessage;

    public LibraryLoginPage() {
        this.emailInput = Driver.getPage().locator("#inputEmail");
        this.passwordInput = Driver.getPage().locator("#inputPassword");
        this.signInButton = Driver.getPage().locator("//button[contains(text(),'Sign in')]");
        this.errorMessage = Driver.getPage().locator("div[role='alert']");
    }


    public void login(String email, String password) {
        emailInput.fill(email);
        passwordInput.fill(password);
        signInButton.click();

    }


/*
    public Locator getPasswordInput() {
        return passwordInput;
    }

    public Locator getEmailInput() {
        return emailInput;
    }

    public Locator getSignInButton() {
        return signInButton;
    }

 */
}
