package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    LoginPage loginPage ; // we declare here
    HomePage homePage ;

    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();
        loginPage = new LoginPage(); // we initilize here
        homePage = new HomePage();

    }


    @AfterMethod
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }
}

// we use inheritance in our before and after methods
// we use abstract in our base test so no one can be able to create objects out of it
// selenium POM,