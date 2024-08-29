package com.Hybrid_Framework_Bootcamp_Q1_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hybrid_Framework_Bootcamp_Q1_Pages.CSearchPage;

public class CSearchTest {

    public WebDriver driver;
    public CSearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        searchPage = new CSearchPage(driver);
    }
    
    @Test
    public void searchProduct() {
        searchPage.enterSearchTerm("Samsung");
        searchPage.clickSearchButton();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
