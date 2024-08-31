package com.BootcampQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Q67 {

    public WebDriver driver;

    @FindBy(css = "a[href='https://tutorialsninja.com/demo/index.php?route=common/home']")
    public WebElement homeLink;

    @FindBy(css = "i.fa.fa-shopping-cart")
    public WebElement shoppingCartIcon;

    @FindBy(css = "h1")
    public WebElement cartHeader;

    @FindBy(css = "a.btn.btn-primary")
    public WebElement continueButton;

    public HomePage_Q67(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickShoppingCartIcon() {
        shoppingCartIcon.click();
    }

    public boolean isCartHeaderDisplayed() {
        return cartHeader.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
