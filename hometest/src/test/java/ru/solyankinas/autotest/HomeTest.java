package ru.solyankinas.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomeTest {

    private static WebDriver driver;

    @BeforeTest
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/andersen/java_autotest/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://yandex.ru");
    }

    @Test
    public void fieldSeach() {
        String textSearch = "Погода Пенза";
        driver.findElement(By.cssSelector(("#text"))).sendKeys(textSearch);
        driver.findElement(By.cssSelector(".search2__button button")).click();
        String textFirstLink = driver.findElement(By.cssSelector("[href='https://yandex.ru/pogoda/penza?from=serp_title']")).getText();
        String textComparison = "Погода";
        Assert.assertTrue(textFirstLink.contains(textComparison));
    }

    @AfterTest
    public static void exitBrowser() {
        driver.quit();
    }
}
