package com.Hybrid_Framework_Bootcamp_Q1_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSearchPage {

    WebDriver driver;

    // Locator for the search bar
    By searchBar = By.cssSelector("input[name='search']");

    // Locator for the search button
    By searchButton = By.cssSelector("button[class='btn btn-default btn-lg']");

    // Constructor
    public CSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter text into the search bar
    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBar).sendKeys(searchTerm);
    }

    // Method to click the search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}
