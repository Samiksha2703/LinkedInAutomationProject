package com.bridgelabz.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Dashboard {
    @FindBy(xpath = "//span[text()='Photo']")
    WebElement photo;

    @FindBy(xpath = "//span[text()='Done']")
    WebElement done;

    @FindBy(xpath = "//span[text()='Post']")
    WebElement post;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p")
    WebElement caption;

    public Dashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void postPhoto() throws AWTException, InterruptedException {
        photo.click();
        StringSelection str = new StringSelection("C:\\Users\\kalam\\Screenshot\\amazon_Search.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Robot robot = new Robot();
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(5000);
        done.click();
        caption.sendKeys("This is test post");
        post.click();
        Thread.sleep(10000);
    }
}
