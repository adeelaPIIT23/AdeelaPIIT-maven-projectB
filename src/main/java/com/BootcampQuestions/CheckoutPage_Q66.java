package com.BootcampQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage_Q66 {
    private WebDriver driver;
    private WebDriverWait wait;

    // Page Factory - Define web elements
    private By addToCartButton = By.id("button-cart");
    private By cartSuccessMessage = By.cssSelector(".alert-success");

    public CheckoutPage_Q66(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart() {
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCart.click();
    }

    public boolean isProductAddedToCart() {
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(cartSuccessMessage));
        return successMessage.isDisplayed();
    }
}
