package com.Hybrid_Framework_Bootcamp_Q1_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DCheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By searchBar = By.cssSelector("input[name='search']");
    By searchButton = By.cssSelector("button[class='btn btn-default btn-lg']");
    By addToCartButton = By.cssSelector("button .fa-shopping-cart");
    By checkoutButtonTop = By.xpath("//span[contains(text(),'Checkout')]");
    By checkoutButtonBottom = By.cssSelector("a.btn.btn-primary[href*='checkout/checkout']");

    // Constructor
    public DCheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page
    public void enterSearchTerm(String searchTerm) {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonBottom));
    	driver.findElement(searchBar).sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonBottom));
    	driver.findElement(searchButton).click();
    }

    public void clickAddToCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonBottom));
        driver.findElement(addToCartButton).click();
    }

    public void clickCheckoutButtonTop() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonBottom));
        driver.findElement(checkoutButtonTop).click();
    }

    public void clickCheckoutButtonBottom() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonBottom));
        driver.findElement(checkoutButtonBottom).click();
    }
}
