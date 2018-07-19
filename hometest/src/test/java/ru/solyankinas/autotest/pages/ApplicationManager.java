package ru.solyankinas.autotest.pages;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    protected ChromeDriver driver;

    private ResultSearch resultSearch;
    private PageSearch pageSearch;

    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        pageSearch = new PageSearch(driver);
        resultSearch = new ResultSearch(driver);
        pageSearch.openSearchPage("https://yandex.ru/");
    }

    public void stopBrowser() {
        driver.quit();
    }

    public PageSearch getPageSearch() {
        return pageSearch;
    }

    public ResultSearch getResultSearch() {
        return resultSearch;
    }
}
