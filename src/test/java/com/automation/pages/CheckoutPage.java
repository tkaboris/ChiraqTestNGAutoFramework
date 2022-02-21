package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutPage extends BasePage{

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zipCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public void fillCheckOutDetails() {
        firstName.sendKeys(PropertyReader.getProperty("checkout.firstname"));
        lastName.sendKeys(PropertyReader.getProperty("checkout.lastname"));
        zipCode.sendKeys(PropertyReader.getProperty("checkout.zipcode"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void verifyPage() {
        Assert.assertTrue(firstName.isDisplayed(), "first name is missing from checkout page");
        Assert.assertTrue(lastName.isDisplayed(), "last name  is missing from check out page");
        Assert.assertTrue(zipCode.isDisplayed(), "zipcode is missing from checkout page");

    }
}
