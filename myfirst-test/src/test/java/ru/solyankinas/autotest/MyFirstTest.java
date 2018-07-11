package ru.solyankinas.autotest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {

    private static WebDriver driver;

    @BeforeTest
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/AutoTest/first-test/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximaze();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru");
    }

    @Test
    public void fieldSeach() {
        WebElement seachField = driver.findElement(By.cssSelector(("#text")));
        String textSearch = "Погода Пенза";
        seachField.sendKeys(textSearch);
        WebElement searchButton = driver.findElement(By.cssSelector(".search2__button button"));
        searchButton.click();
        WebElement firstLink = driver.findElement(By.cssSelector("[href='https://yandex.ru/pogoda/penza?from=serp_title']"));
        String textFirstLink = firstLink.getText();
        System.out.println(textFirstLink);
        Assert.assertTrue(textFirstLink.contains("Погода"));
    }

    @AfterTest
    public static void exitBrowser() {
        driver.quit();
    }
}