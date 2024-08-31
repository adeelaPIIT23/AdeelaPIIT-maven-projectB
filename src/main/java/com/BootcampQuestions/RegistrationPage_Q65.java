package com.BootcampQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage_Q65 {

    WebDriver driver;

    // Locators
    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(css = "input#input-firstname")
    WebElement firstNameField;

    @FindBy(css = "input#input-lastname")
    WebElement lastNameField;

    @FindBy(css = "input#input-email")
    WebElement emailField;

    @FindBy(css = "input#input-telephone")
    WebElement telephoneField;

    @FindBy(css = "input#input-password")
    WebElement passwordField;

    @FindBy(css = "input#input-confirm")
    WebElement confirmPasswordField;

    @FindBy(css = "input[name = agree]")
    WebElement agreeCheckbox;

    @FindBy(css = "input.btn.btn-primary")
    WebElement continueButton;

    // Constructor
    public RegistrationPage_Q65(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page
    public void clickMyAccount() {
        myAccountLink.click();
    }

    public void clickRegister() {
        registerLink.click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterTelephone(String telephone) {
        telephoneField.sendKeys(telephone);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickAgreeCheckbox() {
        agreeCheckbox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
