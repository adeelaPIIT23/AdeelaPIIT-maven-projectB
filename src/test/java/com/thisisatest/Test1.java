package com.thisisatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void searchGoogle() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
