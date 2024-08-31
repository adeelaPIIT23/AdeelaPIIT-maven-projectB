package com.Hybrid_Framework_Bootcamp_Q1_Tests;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BRegisterTest {



	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test
	public void registerTNUsingCss() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Adeela");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Bootcamp");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("adeela_piitbootcamp2@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("HybridF@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("HybridF@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hybrid_Framework_Bootcamp_Q1_Pages.BRegisterPage;

public class BRegisterTest {

    public WebDriver driver;
    public BRegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        registerPage = new BRegisterPage(driver);
    }
    
    @Test
    public void registerTNUsingCss() {
        registerPage.clickMyAccount();
        registerPage.clickRegister();
        registerPage.enterFirstName("Adeela");
        registerPage.enterLastName("Bootcamp");
        registerPage.enterEmail("adeela_piitbootcamp2325d4@gmail.com");
        registerPage.enterTelephone("473541240");
        registerPage.enterPassword("HybridF@123");
        registerPage.enterConfirmPassword("HybridF@123");
        registerPage.clickAgreeCheckbox();
        registerPage.clickContinueButton();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
