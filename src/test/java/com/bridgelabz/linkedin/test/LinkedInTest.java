/**
 * Description : LinkedInTest.java is file which is having code for test cases.
 * Author      : Samiksha Shende
 * Date        : 30/05/2021
 */

package com.bridgelabz.linkedin.test;

import com.bridgelabz.linkedin.base.Base;
import com.bridgelabz.linkedin.pages.Dashboard;
import org.testng.annotations.Test;

import java.awt.*;


public class LinkedInTest extends Base {
    public Dashboard dashboard;

    @Test(priority = 1)
    public void linkedIn_Login() throws InterruptedException, AWTException {
        dashboard = new Dashboard(driver);
        dashboard.postPhoto();
    }
}
