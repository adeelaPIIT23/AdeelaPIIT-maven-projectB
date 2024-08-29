package com.Hybrid_Framework_Bootcamp_Q1_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BRegisterPage {

    WebDriver driver;

    // Locators
    By myAccountLink = By.linkText("My Account");
    By registerLink = By.linkText("Register");
    By firstNameField = By.cssSelector("input#input-firstname");
    By lastNameField = By.cssSelector("input#input-lastname");
    By emailField = By.cssSelector("input#input-email");
    By telephoneField = By.cssSelector("input#input-telephone");
    By passwordField = By.cssSelector("input#input-password");
    By confirmPasswordField = By.cssSelector("input#input-confirm");
    By agreeCheckbox = By.cssSelector("input[name = agree]");
    By continueButton = By.cssSelector("input.btn.btn-primary");

    // Constructor
    public BRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the page
    public void clickMyAccount() {
        driver.findElement(myAccountLink).click();
    }

    public void clickRegister() {
        driver.findElement(registerLink).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickAgreeCheckbox() {
        driver.findElement(agreeCheckbox).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
