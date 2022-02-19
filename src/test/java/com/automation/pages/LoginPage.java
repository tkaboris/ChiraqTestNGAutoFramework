package com.automation.pages;

import com.automation.test.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    @FindBy(id="user-name")
    WebElement userNameEle;

    @FindBy(id="password")
    WebElement passwordEle;

    @FindBy(id="login-button")
    WebElement loginBtn;

    WebDriver driver;
//create constructor take paramenter , this driver we get from test
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void doLogin(){
        userNameEle.sendKeys("standard_user");
        passwordEle.sendKeys("secret_sauce");
        loginBtn.click();
    }

    public void verifyLoginPage(){

        Assert.assertTrue(userNameEle.isDisplayed(), "Username input is missing from login page");
        Assert.assertTrue(passwordEle.isDisplayed(), "password input is missing from login page");
    }
}
