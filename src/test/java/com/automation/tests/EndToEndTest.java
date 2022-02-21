package com.automation.tests;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {
    @Test
    public void verifyUserCanPlaceOrder(){
        loginPage.doLogin(); // create object
        homePage.verifyPage();
        homePage.clickOnItem();    //3
        productDetailPage.verifyPage();//5
        productDetailPage.clickOnAddToCartBtn();
        productDetailPage.clickOnCartIcon();
        cartPage.verifyPage();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.verifyPage();
        checkoutPage.fillCheckOutDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.verifyPage();
        reviewPage.clickOnFinishBtn();
        orderConfirmationPage.verifyPage();
    }

}

//1 Open website saucedemo
//2do login and verify homepage
//3click on item sauce labs backpacek
//4verify product detail page
//5click on add to cart button
//6click on cart icon
//7verify cart page
//8click on checkout
//9filll checkout detail s and click continue
//10verify review page
//11click on finish
//12verify order confirmation page