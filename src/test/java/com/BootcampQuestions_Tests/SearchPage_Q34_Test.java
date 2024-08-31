package com.BootcampQuestions_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BootcampQuestions.SearchPage_Q34;

public class SearchPage_Q34_Test {

    WebDriver driver;
    SearchPage_Q34 searchPage;

    @BeforeMethod
    public void setUp() {
        // Set the path for your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/search&search=samsung");

        // Initialize the SearchPage object
        searchPage = new SearchPage_Q34(driver);
    }

    @Test
    public void testSearchProduct() {
        // Verify that the search result is displayed
        Assert.assertTrue(searchPage.isSearchResultDisplayed(), "Samsung product was not displayed in the search results!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
