package com.automation.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    // we use constructor to deal with driver
    // to pass driver from test to page, pass driver

    @Test
    public void verifyUserCanLogin(){
        loginPage.doLogin();
        homePage.verifyPage();

    }




}
