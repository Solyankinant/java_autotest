package ru.solyankinas.autotest.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.solyankinas.autotest.pages.ApplicationManager;


public class BaseTest {

    protected  ApplicationManager appManager = new ApplicationManager();

    @BeforeTest
    public static void openBrowser() {
        ApplicationManager.startBrowser();
    }

    @AfterTest
    public static void exitBrowser() {
        ApplicationManager.stopBrowser();
    }

}
