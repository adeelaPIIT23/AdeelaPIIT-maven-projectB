package com.BootcampQuestions_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentPage_Q100_Test {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe"); 
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait with a duration
    }

    @Test
    public void testNavigationAndElementPresence() {
        driver.get("https://tutorialsninja.com/demo/");

        // Wait for the 'Shopping Cart' icon to be visible and clickable
        WebElement shoppingCartIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i.fa.fa-shopping-cart")));
        shoppingCartIcon.click();

        // Wait for and verify the presence of the Shopping Cart header
        WebElement cartHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
        Assert.assertTrue(cartHeader.isDisplayed(), "Shopping Cart header is not displayed");

        // Wait for and click on the 'Continue' button
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn.btn-primary")));
        continueButton.click();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
