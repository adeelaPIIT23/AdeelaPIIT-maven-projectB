package com.BootcampQuestions_Tests;

import com.BootcampQuestions.ShoppingCartPage_Q33;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingCartPage_Q33_Test {
    private WebDriver driver;
    private ShoppingCartPage_Q33 shoppingCartPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49"); 
        shoppingCartPage = new ShoppingCartPage_Q33(driver);
    }

    @Test
    public void testAddProductToCart() {
        try {
            shoppingCartPage.addToCart();
            Assert.assertTrue(shoppingCartPage.isCartMessageDisplayed(), "Product was not added to the cart successfully.");
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
