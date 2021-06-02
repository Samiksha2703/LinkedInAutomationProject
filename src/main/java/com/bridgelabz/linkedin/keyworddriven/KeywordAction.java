package com.bridgelabz.linkedin.keyworddriven;

import com.bridgelabz.linkedin.utility.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class KeywordAction {
    WebDriver driver;

    //open browser
    public WebDriver openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    // launch application
    public void navigate(WebDriver driver) {
        driver.get(Constant.URL);
    }

    public void enterEmail(WebDriver driver) {
        driver.findElement(By.id("username")).sendKeys(Constant.username);
    }

    public void enterPassword(WebDriver driver) {
        driver.findElement(By.id("password")).sendKeys(Constant.password);
    }

    public void clickSignln(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id='organic-div']/form/div[3]/button")).click();
    }

    public void closeBrowser(WebDriver driver){
        driver.close();
    }
}
