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

import java.util.concurrent.TimeUnit;

public class LogoutTest extends BaseTest {


    @Test
    public void userCanLogoutFromApp(){



        loginPage.doLogin();

        homePage.verifyHomePage();

        homePage.clickOnBurgerMenu();

        homePage.clickOnLogoutLink();

        loginPage.verifyLoginPage();

    }


}
