package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    LoginPage loginPage ; // we declare here
    HomePage homePage ;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    ReviewPage reviewPage;
    OrderConfirmationPage orderConfirmationPage;
    CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();
        loginPage = new LoginPage(); // we initilize here
        homePage = new HomePage();
        checkoutPage = new CheckoutPage();
        reviewPage = new ReviewPage();
        orderConfirmationPage = new OrderConfirmationPage();
        cartPage = new CartPage();
        productDetailPage = new ProductDetailPage();

    }


    @AfterMethod
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }
}

// we use inheritance in our before and after methods
// we use abstract in our base test so no one can be able to create objects out of it
// selenium POM,