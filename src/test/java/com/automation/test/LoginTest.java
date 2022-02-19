package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    // we use constructor to deal with driver
    // to pass driver from test to page, pass driver

    @Test
    public void verifyUserCanLogin(){


        loginPage.doLogin();
        homePage.verifyHomePage();

    }




}
