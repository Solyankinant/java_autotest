package ru.solyankinas.autotest.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.solyankinas.autotest.pages.*;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    ChromeDriver driver;

    protected ApplicationManager appManager;

    @BeforeTest
    public void openBrowser() {
        startChromeBrowser();
    }

    @AfterTest
    public void exitBrowser() {
        stopBrowser();
    }

    private void startChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        appManager = new ApplicationManager(driver);
        appManager.pageSearch = new PageSearch(driver);
        appManager.resultSearch = new ResultSearch(driver);
        appManager.pageLocation = new PageLocation(driver);
        appManager.pageSearch.openSearchPage();
    }


    private void stopBrowser() {
        driver.quit();
    }

}