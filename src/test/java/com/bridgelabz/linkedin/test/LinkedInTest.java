package com.bridgelabz.linkedin.test;

import com.bridgelabz.linkedin.base.Base;
import com.bridgelabz.linkedin.pages.Dashboard;
import com.bridgelabz.linkedin.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class LinkedInTest extends Base {
    public Login login;
    public Dashboard photo;

    @Test(priority = 1)
    public void linkedIn_Login() {
        login = new Login(driver);
        login.loginIntoAccount();
        Assert.assertEquals(driver.getTitle(), "(58) Feed | LinkedIn");
    }

    @Test(priority = 2)
    public void post_Photo() throws AWTException, InterruptedException {
        photo = new Dashboard(driver);
        photo.postPhoto();
    }

}
