package ru.solyankinas.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    protected static WebDriver driver;

    @BeforeTest
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://yandex.ru");
    }

    @AfterTest
    public static void exitBrowser() {
        driver.quit();
    }

    protected String getTextFirstLink() {
        return driver.findElement(By.cssSelector("a[accesskey='1']")).getText();
    }

    protected void clickButtonSearch() {
        driver.findElement(By.cssSelector("form[role='search'] button[type='submit']")).click();
    }

    protected void inputTextSearch(String textSearch) {
        driver.findElement(By.cssSelector(("#text"))).sendKeys(textSearch);
    }
}
