package com.Hybrid_Framework_Bootcamp_Q1_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DCheckoutPage {

    WebDriver driver;

    // Locators
    By searchBar = By.cssSelector("input[name='search']");
    By searchButton = By.cssSelector("button[class='btn btn-default btn-lg']");
    By addToCartButton = By.xpath("//span[contains(text(),'Add to Cart')]");
    By checkoutButtonTop = By.xpath("//span[contains(text(),'Checkout')]");
    By checkoutButtonBottom = By.cssSelector("a.btn.btn-primary[href*='checkout/checkout']");

    // Constructor
    public DCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the page
    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBar).sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCheckoutButtonTop() {
        driver.findElement(checkoutButtonTop).click();
    }

    public void clickCheckoutButtonBottom() {
        driver.findElement(checkoutButtonBottom).click();
    }
}
