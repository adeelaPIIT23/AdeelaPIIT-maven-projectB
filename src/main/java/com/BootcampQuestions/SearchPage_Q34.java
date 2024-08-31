package com.BootcampQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage_Q34 {

    WebDriver driver;

    public SearchPage_Q34(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Targeting the product link using the CSS selector with partial text
    @FindBy(css = "a[href*='search=samsung']")
    WebElement productLink;

    public boolean isSearchResultDisplayed() {
        // Use the Duration class for specifying the wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            // Wait until the product link is visible on the page
            wait.until(ExpectedConditions.visibilityOf(productLink));
            return productLink.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
