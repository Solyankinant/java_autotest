package ru.solyankinas.task.three.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.solyankinas.task.three.pages.*;

import java.util.concurrent.TimeUnit;


public class TestBase {
    private PageYandexMarket pageYandexMarket;
    private PagePcLopTop pagePcLopTop;
    private YandexNavigationPage yandexNavigationPage;
    private YandexPage yandexPage;
    private PageCompariGoods pageCompariGoods;
    ChromeDriver driver;

    @BeforeMethod
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageYandexMarket = new PageYandexMarket(driver);
        pagePcLopTop = new PagePcLopTop(driver);
        yandexNavigationPage = new YandexNavigationPage(driver);
        yandexPage = new YandexPage(driver);
        pageCompariGoods = new PageCompariGoods(driver);
        getYandexPage().openYandex();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    public PageYandexMarket getPageYandexMarket() {
        return pageYandexMarket;
    }

    public PagePcLopTop getPagePcLopTop() {
        return pagePcLopTop;
    }

    public YandexNavigationPage getYandexNavigationPage(){
        return yandexNavigationPage;
    }
    public YandexPage getYandexPage(){
        return yandexPage;
    }
    public PageCompariGoods getPageCompariGoods(){
        return pageCompariGoods;
    }

}
