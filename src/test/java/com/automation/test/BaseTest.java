package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    WebDriver driver;

    LoginPage loginPage ; // we declare here
    HomePage homePage ;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver); // we initilize here
        homePage = new HomePage(driver);

    }


    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}

// we use inheritance in our before and after methods
// we use abstract in our base test so no one can be able to create objects out of it
// selenium POM,