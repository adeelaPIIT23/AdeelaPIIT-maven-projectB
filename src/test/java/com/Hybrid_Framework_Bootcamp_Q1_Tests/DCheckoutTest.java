package com.Hybrid_Framework_Bootcamp_Q1_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hybrid_Framework_Bootcamp_Q1_Pages.DCheckoutPage;

public class DCheckoutTest {

    public WebDriver driver;
    public DCheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        checkoutPage = new DCheckoutPage(driver);
    }
    
    @Test
    public void checkoutSamsung() {
        checkoutPage.enterSearchTerm("Samsung");
        checkoutPage.clickSearchButton();
        checkoutPage.clickAddToCartButton();
        checkoutPage.clickCheckoutButtonTop();
        checkoutPage.clickCheckoutButtonBottom();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
