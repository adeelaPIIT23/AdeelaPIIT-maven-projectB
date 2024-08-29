package com.Hybrid_Framework_Bootcamp_Q1_Tests;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ALoginTest {
	
	public WebDriver driver;
	
	@Test
	public void loginTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'input-email')]")).sendKeys("adeela_piitbootcamp2@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("HybridF@123");
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
	
		driver.quit();
	}

}
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Hybrid_Framework_Bootcamp_Q1_Pages.ALoginPage;

public class ALoginTest {
    
    public WebDriver driver;
    public ALoginPage loginPage;
    
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        loginPage = new ALoginPage(driver);
    }
    
    @Test
    public void loginTN() {
        loginPage.clickMyAccount();
        loginPage.clickLogin();
        loginPage.enterEmail("adeela_piitbootcamp2@gmail.com");
        loginPage.enterPassword("HybridF@123");
        loginPage.clickLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

