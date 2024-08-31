package com.BootcampQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage_Q32 {
    private WebDriver driver;
    private WebDriverWait wait;

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

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement accountHeader;

    public LoginPage_Q32(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Increased timeout to 30 seconds
        PageFactory.initElements(driver, this);
    }

    public void clickMyAccount() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(myAccountLink));
        if (element != null) {
            element.click();
        }
    }

    public void clickLogin() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        if (element != null) {
            element.click();
        }
    }

    public void enterEmail(String email) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(emailField));
        if (element != null) {
            element.sendKeys(email);
        }
    }

    public void enterPassword(String password) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(passwordField));
        if (element != null) {
            element.sendKeys(password);
        }
    }

    public void clickLoginButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        if (element != null) {
            element.click();
        }
    }

    public boolean isAccountHeaderDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(accountHeader));
        return element != null && element.isDisplayed();
    }
}
