package org.example.Pages;

import com.github.javafaker.Faker;
import org.example.Utils.Reusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SignUpPage extends Reusable {
    WebDriver driver;
    @FindBy(css = "#create_account_button")
    WebElement create_account_button;
    @FindBy(css = "#register_btn")
    WebElement register;
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public void newUser() throws IOException {
        waitForWebElement(driver, create_account_button).click();
        Faker faker = new Faker();

        String firstname = faker.name().firstName();
        waitForWebElement(driver, getLocators().getProperty("fieldname").replace("fieldname", "firstname")).sendKeys(firstname);
        String lastname = faker.name().lastName();
        waitForWebElement(driver, getLocators().getProperty("fieldname").replace("fieldname", "lastname")).sendKeys(lastname);

        String email = faker.internet().emailAddress();
        waitForWebElement(driver, getLocators().getProperty("fieldname").replace("fieldname", "email")).sendKeys(email);

        String password = "Mumzworld@1";
        waitForWebElement(driver, getLocators().getProperty("fieldname").replace("fieldname", "password")).sendKeys(password);
        register.click();


    }
}
