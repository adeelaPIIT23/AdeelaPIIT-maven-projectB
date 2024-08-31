package com.BootcampQuestions_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BootcampQuestions.LoginPage_Q32;

public class LoginPage_Q32_Test {
    private WebDriver driver;
    private LoginPage_Q32 loginPage;

    @BeforeMethod
    public void setUp() {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the browser window
        driver.get("http://tutorialsninja.com/demo"); // URL of the site to test
        loginPage = new LoginPage_Q32(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.clickMyAccount();
        loginPage.clickLogin();
        loginPage.enterEmail("adeela_piitbootcamp2@gmail.com"); // Replace with a valid email
        loginPage.enterPassword("HybridF@123"); // Replace with a valid password
        loginPage.clickLoginButton();
        
        // Verify successful login by checking the presence of the account header
        boolean isAccountHeaderDisplayed = loginPage.isAccountHeaderDisplayed();
        Assert.assertTrue(isAccountHeaderDisplayed, "Account header should be displayed after login.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
