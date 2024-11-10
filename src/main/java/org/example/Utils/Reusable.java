package org.example.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class Reusable {
    FluentWait<WebDriver> webDriverWait;
    public WebElement waitForWebElement(WebDriver driver, String locator){
        webDriverWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
       return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

    }
    public WebElement waitForWebElement(WebDriver driver, WebElement locator){
        webDriverWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
        return webDriverWait.until(ExpectedConditions.visibilityOf(locator));

    }
    public void waitForWebElementToInvisible(WebDriver driver, WebElement locator){
        webDriverWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
         webDriverWait.until(ExpectedConditions.invisibilityOf(locator));

    }
    public  void waitForListOfElement(WebDriver driver, List<WebElement> webElementList){
        webDriverWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
         webDriverWait.until(ExpectedConditions.visibilityOfAllElements(webElementList));
    }
    public void waitForWebElementToClickable(WebDriver driver,WebElement locator){
        webDriverWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));

    }
    public Properties getLocators() throws IOException {
        Properties properties=new Properties();
        properties.load(Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/main/java/org/example/Utils/Locator.properties")));
        return properties;
    }
}
