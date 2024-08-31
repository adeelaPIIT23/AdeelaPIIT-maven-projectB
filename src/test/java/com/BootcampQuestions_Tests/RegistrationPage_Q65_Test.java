package com.BootcampQuestions_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BootcampQuestions.RegistrationPage_Q65;

public class RegistrationPage_Q65_Test {

    public WebDriver driver;
    public RegistrationPage_Q65 registrationPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        registrationPage = new RegistrationPage_Q65(driver);
    }

    @Test
    public void verifySuccessfulRegistration() {
        registrationPage.clickMyAccount();
        registrationPage.clickRegister();
        registrationPage.enterFirstName("Adeela");
        registrationPage.enterLastName("Bootcamp");
        registrationPage.enterEmail("adeela_piitbootcamp2325d4@gmail.com");
        registrationPage.enterTelephone("473541240");
        registrationPage.enterPassword("HybridF@123");
        registrationPage.enterConfirmPassword("HybridF@123");
        registrationPage.clickAgreeCheckbox();
        registrationPage.clickContinueButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
