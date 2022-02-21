package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{

    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement itemName;



    public void verifyPage() {
        Assert.assertTrue(removeBtn.isDisplayed(), "Remove button is missing from cart page");
        Assert.assertTrue(itemName.isDisplayed(), "Item Name  is missing from cart page");
        Assert.assertTrue(checkoutBtn.isDisplayed(), "Checkout button is missing from cart page");

    }

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }
}
