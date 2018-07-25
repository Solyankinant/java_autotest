package ru.solyankinas.task.three;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.solyankinas.task.three.pages.PagePcLopTop;
import ru.solyankinas.task.three.pages.PageYandexMarket;

import java.util.concurrent.TimeUnit;


public class TestBase {
    public PageYandexMarket pageYandexMarket;
    public PagePcLopTop pagePcLopTop;
    ChromeDriver driver;

    @BeforeMethod
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageYandexMarket = new PageYandexMarket(driver);
        pagePcLopTop = new PagePcLopTop(driver);
        driver.get("https://yandex.ru/");
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.quit();
    }

    public PageYandexMarket getPageYandexMarket() {
        return pageYandexMarket;
    }

    public PagePcLopTop getPagePcLopTop() {
        return pagePcLopTop;
    }

}
