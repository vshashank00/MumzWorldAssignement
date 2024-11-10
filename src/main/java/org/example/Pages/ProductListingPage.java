package org.example.Pages;

import org.example.Utils.Reusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductListingPage extends Reusable {
    WebDriver driver;
    @FindBy(css = "#cart_button")
    WebElement cart;
    @FindBy(xpath = "//div[@class='relative']/child::div")
    WebElement cartValidate;
    @FindBy(xpath = "//div[@aria-label=\"Notifications (F8)\"]/following-sibling::div/img[@title='Loading']")
    WebElement loader;
    public ProductListingPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public CartPage addToCart(String product) throws IOException {
        waitForWebElement(driver, getLocators().getProperty("searchedProduct").replace("searchedProduct", product)).click();
        waitForWebElement(driver, cartValidate);
        cart.click();
        waitForWebElement(driver, loader);
        waitForWebElementToInvisible(driver, loader);
        return new CartPage(driver);


    }
}
