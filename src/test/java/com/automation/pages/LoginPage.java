package com.automation.pages;

import com.automation.test.LoginTest;
import com.automation.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    WebElement userNameEle;

    @FindBy(id="password")
    WebElement passwordEle;

    @FindBy(id="login-button")
    WebElement loginBtn;


//create constructor take paramenter , this driver we get from test

    public void doLogin(){
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));
        loginBtn.click();
    }

    public void verifyLoginPage(){

        Assert.assertTrue(userNameEle.isDisplayed(), "Username input is missing from login page");
        Assert.assertTrue(passwordEle.isDisplayed(), "password input is missing from login page");
    }
}
