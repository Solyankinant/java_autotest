package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public static WebDriver driver;

    public static void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ApplicationManager.driver = new ChromeDriver();
        ApplicationManager.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ApplicationManager.driver.get("https://yandex.ru");
    }

    public static void stopBrowser() {
        ApplicationManager.driver.quit();
    }

    public String getTextFirstLink() {
        return ApplicationManager.driver.findElement(By.cssSelector("a[accesskey='1']")).getText();
    }

    public void clickButtonSearch() {
        ApplicationManager.driver.findElement(By.cssSelector("form[role='search'] button[type='submit']")).click();
    }

    public void inputTextSearch(String textSearch) {
        ApplicationManager.driver.findElement(By.cssSelector(("#text"))).sendKeys(textSearch);
    }
}
