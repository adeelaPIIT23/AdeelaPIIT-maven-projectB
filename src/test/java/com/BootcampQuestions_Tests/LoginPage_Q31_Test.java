package com.BootcampQuestions_Tests;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootcampQuestions.LoginPage_Q31;

	public class LoginPage_Q31_Test {
	    private WebDriver driver;
	    private LoginPage_Q31 loginPage;

	    @BeforeMethod
	    public void setUp() {
	        // Set up ChromeDriver
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adeela\\Desktop\\Automation 2\\CHROME\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/");
	        
	        // Initialize the LoginPage object
	        loginPage = new LoginPage_Q31(driver);
	    }

	    @Test
	    public void loginTN() {
	        // Perform login using the LoginPage methods
	        loginPage.clickMyAccount();
	        loginPage.clickLogin();
	        loginPage.enterEmail("adeela_piitbootcamp2@gmail.com");
	        loginPage.enterPassword("HybridF@123");
	        loginPage.clickLoginButton();
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}
