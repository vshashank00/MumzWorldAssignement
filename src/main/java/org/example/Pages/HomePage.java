package org.example.Pages;

import org.example.Utils.Reusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends Reusable {
    WebDriver driver;
    String searchedProduct = "//div[@id=\"categoryPage\"]/descendant::li/descendant::a[@title=\"Little Story - Market Shopping Cart Toy Set - 56pcs - Green\"]/ancestor::div[contains(@class,'ProductCard_productCard')]/descendant::button[@id=\"add_cart_button\"]";
    @FindBy(css = "#search_textbox")
    WebElement searchBox;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductListingPage searchBox(String product) throws IOException {
        searchBox.sendKeys(product, Keys.ENTER);
        return new ProductListingPage(driver);


    }

}
