package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(className = "app_logo")
    WebElement homePageLogo;

    @FindBy(css = ".title")
    WebElement homePageTitle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> listOfProduct;



    public List<WebElement> getListOfProduct(){
        return listOfProduct;
    }


    public void verifyHomePage(){

        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from page");
        Assert.assertTrue(homePageTitle.isDisplayed(), "title is missing from hommepage");

    }

    public void clickOnBurgerMenu(){

        burgerMenu.click();
    }

    public void clickOnLogoutLink(){

        logoutLink.click();
    }

    public void verifyEachProductNavigation(){

    }
}
