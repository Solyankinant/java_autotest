package ru.solyankinas.autotest.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.solyankinas.autotest.pages.ApplicationManager;
import ru.solyankinas.autotest.pages.PageLocation;
import ru.solyankinas.autotest.pages.PageSearch;
import ru.solyankinas.autotest.pages.ResultSearch;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    ChromeDriver driver;

    protected ApplicationManager appManager;

    @BeforeTest
    public void openBrowser() {
        startBrowser();
    }

    @AfterTest
    public void exitBrowser() {
        stopBrowser();
    }

    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        appManager = new ApplicationManager(driver);
        appManager.pageSearch = new PageSearch(driver);
        appManager.resultSearch = new ResultSearch(driver);
        appManager.pageLocation = new PageLocation(driver);
        appManager.pageSearch.openSearchPage();
    }


    public void stopBrowser() {
        //driver.quit();
    }

}