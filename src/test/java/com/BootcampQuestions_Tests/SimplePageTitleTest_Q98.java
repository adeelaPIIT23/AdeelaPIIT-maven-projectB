package com.BootcampQuestions_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimplePageTitleTest_Q98 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe"); // Update this path

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void checkPageTitle() {
        // Navigate to the website
        driver.get("https://tutorialsninja.com/demo/");

        // Verify the page title
        Assert.assertEquals(driver.getTitle(), "Your Store"); // Expected title for the website
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
