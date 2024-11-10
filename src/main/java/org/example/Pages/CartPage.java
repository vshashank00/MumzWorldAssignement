package org.example.Pages;

import org.example.Utils.Reusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CartPage extends Reusable {
    WebDriver driver;
    @FindBy(css = "button[title=\"Proceed to Checkout\"]")
    WebElement Proceed_to_Checkout;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SignUpPage addQuantity(String product) throws IOException {
        WebElement element = waitForWebElement(driver, getLocators().getProperty("productOnCart").replace("productOnCart", product));
        for (int i = 0; i < 4; i++) {
            waitForWebElementToClickable(driver, element);
            element.click();
        }
        waitForWebElement(driver, Proceed_to_Checkout).click();


        return new SignUpPage(driver);
    }
}
