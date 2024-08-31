package com.BootcampQuestions_Tests;

import com.BootcampQuestions.HomePage_Q67;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage_Q67_Test {

    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage_Q67 homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe"); 
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://tutorialsninja.com/demo/");
        homePage = new HomePage_Q67(driver);
    }

    @Test
    public void testHomePageElements() {
        // Wait for the 'Shopping Cart' icon to be visible and clickable
        wait.until(ExpectedConditions.visibilityOf(homePage.shoppingCartIcon));
        homePage.clickShoppingCartIcon();

        // Wait for and verify the presence of the Shopping Cart header
        wait.until(ExpectedConditions.visibilityOf(homePage.cartHeader));
        Assert.assertTrue(homePage.isCartHeaderDisplayed(), "Shopping Cart header is not displayed");

        // Wait for and click on the 'Continue' button
        wait.until(ExpectedConditions.elementToBeClickable(homePage.continueButton));
        homePage.clickContinueButton();

        // Verify that the user is redirected to the home page after clicking continue
        Assert.assertTrue(driver.getCurrentUrl().contains("common/home"), "Not navigated to the home page");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
