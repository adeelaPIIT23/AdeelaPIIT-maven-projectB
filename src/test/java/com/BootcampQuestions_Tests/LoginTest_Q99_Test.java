package com.BootcampQuestions_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest_Q99_Test {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Adeela\\\\Desktop\\\\Automation 2\\\\CHROME\\\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("https://tutorialsninja.com/demo/");

        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        myAccountLink.click();

        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("input-email")); 
        WebElement passwordField = driver.findElement(By.id("input-password")); 
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']")); 

        emailField.sendKeys("adeela_piitbootcamp2@gmail.com"); 
        passwordField.sendKeys("HybridF@123"); 
        loginButton.click();

        // Verify successful login
        // Adjust the verification based on the website’s successful login indicator
        WebElement accountInfo = driver.findElement(By.linkText("Edit your account information")); // Example of a successful login element
        Assert.assertTrue(accountInfo.isDisplayed(), "Login was not successful");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
