package com.BootcampQuestions_Tests;

import com.BootcampQuestions.CheckoutPage_Q66;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutPage_Q66_Test {
    private WebDriver driver;
    private CheckoutPage_Q66 checkoutPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=33&search=samsung");
        checkoutPage = new CheckoutPage_Q66(driver);
    }

    @Test
    public void checkoutSamsung() {
        checkoutPage.addProductToCart();
        Assert.assertTrue(checkoutPage.isProductAddedToCart(), "Product was not added to the cart successfully.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
