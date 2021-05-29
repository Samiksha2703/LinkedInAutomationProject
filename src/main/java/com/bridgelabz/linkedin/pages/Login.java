package com.bridgelabz.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='organic-div']/form/div[3]/button")
    WebElement signIn;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginIntoAccount() {
        try {
            username.sendKeys("samiksha@rediffmail.com");
            password.sendKeys("Sami@5698");
            signIn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
