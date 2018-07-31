package ru.solyankinas.autotest.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestOne {
    ChromeDriver driver;
    private static final String URL = "https://yandex.ru/";


    @Test
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        driver.findElementByCssSelector("[data-statlog='head.region.setup']").click();
        driver.findElementByCssSelector("#city__front-input").click();
        driver.findElementByCssSelector("#city__front-input").clear();
        driver.findElementByCssSelector("#city__front-input").sendKeys("Милан");
        clickLink(driver, 10);
        driver.quit();
    }



    public void clickLink(WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(By.xpath("//li[1]"))));
        driver.findElement(By.xpath("//li[1]")).click();
    }
}
