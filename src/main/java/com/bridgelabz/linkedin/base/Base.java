/**
 * Description : Base.java is file which is having code for initializing driver.
 * Author      : Samiksha Shende
 * Date        : 30/05/2021
 */

package com.bridgelabz.linkedin.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public Properties properties;

    /**
     * @purpose initialize browser
     * @return driver
     */

    @BeforeTest
    public static void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    /**
     * @purpose initialize properties file
     * @return properties
     */

    public Properties initializeProperties() {
        properties = new Properties();
        try{
            FileInputStream ip = new FileInputStream("C:\\Users\\kalam\\IdeaProjects\\LinkedInAutomation\\src\\main\\resources\\config.properties");
            properties.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
}
