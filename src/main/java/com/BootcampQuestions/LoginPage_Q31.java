/*package com.BootcampQuestions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_Q31 {
    private WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize WebDriver and PageFactory
    public LoginPage_Q31(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Define WebElements using @FindBy annotation
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(xpath = "//input[contains(@id, 'input-email')]")
    private WebElement emailField;

    @FindBy(xpath = "//input[contains(@id, 'input-password')]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[contains(@class, 'btn btn-primary')]")
    private WebElement loginButton;

    // Define methods to interact with the elements
    public void clickMyAccount() {
        myAccountLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
*/
package com.BootcampQuestions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_Q31 {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and PageFactory
    public LoginPage_Q31(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Define WebElements using @FindBy annotation
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(xpath = "//input[contains(@id, 'input-email')]")
    private WebElement emailField;

    @FindBy(xpath = "//input[contains(@id, 'input-password')]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[contains(@class, 'btn btn-primary')]")
    private WebElement loginButton;

    // Define methods to interact with the elements
    public void clickMyAccount() {
        wait.until(ExpectedConditions.visibilityOf(myAccountLink)); // Wait until the element is visible
        myAccountLink.click();
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.visibilityOf(loginLink)); // Wait until the element is visible
        loginLink.click();
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailField)); // Wait until the element is visible
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)); // Wait until the element is visible
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton)); // Wait until the element is visible
        loginButton.click();
    }
}
