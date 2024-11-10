package org.example;

import org.example.DataSets.Products;
import org.example.Pages.CartPage;
import org.example.Pages.ProductListingPage;
import org.example.Pages.SignUpPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class MumzworldTest extends BaseTest {
    @Test(dataProvider = "product", dataProviderClass = Products.class)
    void ProductCheckOut(String product) throws IOException {
        ProductListingPage productListingPage = homePage.searchBox(product);
        CartPage cartPage = productListingPage.addToCart(product);
        SignUpPage signUpPage = cartPage.addQuantity(product);
        signUpPage.newUser();


    }
}
