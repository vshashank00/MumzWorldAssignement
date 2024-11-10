package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    Properties properties;
    HomePage homePage;
    public Properties property() throws IOException {
       properties=new Properties();
       properties.load(Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/main/java/org/example/Utils/Config.properties")));
        return properties;
    }
    public WebDriver initiliazeBrowser() throws IOException {
        if (property().getProperty("browser").contains("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (property().getProperty("browser").contains("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        } else if (property().getProperty("browser").contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }else {
            System.out.println("Browser is not configured");
        }
        driver.manage().window().maximize();
        return driver;
    }
    @BeforeTest
   public void setUp() throws IOException {
    initiliazeBrowser().get(property().getProperty("url"));
        homePage= new HomePage(driver);

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
