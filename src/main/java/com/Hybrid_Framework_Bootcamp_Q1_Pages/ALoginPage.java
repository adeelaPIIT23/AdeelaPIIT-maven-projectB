package com.Hybrid_Framework_Bootcamp_Q1_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ALoginPage {

    WebDriver driver;

    // Locators
    By myAccountLink = By.linkText("My Account");
    By loginLink = By.linkText("Login");
    By emailField = By.xpath("//input[contains(@id, 'input-email')]");
    By passwordField = By.xpath("//input[contains(@id, 'input-password')]");
    By loginButton = By.xpath("//input[contains(@class, 'btn btn-primary')]");

    // Constructor
    public ALoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the page
    public void clickMyAccount() {
        driver.findElement(myAccountLink).click();
    }

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
