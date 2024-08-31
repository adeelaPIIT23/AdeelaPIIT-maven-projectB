package com.BootcampQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage_Q33 {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(css = ".alert-success")
    private WebElement cartMessage;

    @FindBy(xpath = "//a[contains(@href, 'cart')]") 
    private WebElement cartLink;

    public ShoppingCartPage_Q33(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage());
        }
    }

    public boolean isCartMessageDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(cartMessage)).isDisplayed();
        } catch (Exception e) {
            System.out.println("Cart message not found: " + e.getMessage());
            return false;
        }
    }

    public void goToCart() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
        } catch (Exception e) {
            System.out.println("Error navigating to cart: " + e.getMessage());
        }
    }
}
