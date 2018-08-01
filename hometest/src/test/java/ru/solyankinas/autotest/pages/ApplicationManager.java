package ru.solyankinas.autotest.pages;


import org.openqa.selenium.chrome.ChromeDriver;
import ru.solyankinas.autotest.pages.PageLocation;
import ru.solyankinas.autotest.pages.PageSearch;
import ru.solyankinas.autotest.pages.ResultSearch;

public class ApplicationManager {
    public ChromeDriver driver;

    public ResultSearch resultSearch;
    public PageSearch pageSearch;
    public PageLocation pageLocation;

    public ApplicationManager(ChromeDriver driver) {
        this.driver = driver;
    }

    public PageSearch getPageSearch() {
        return pageSearch;
    }

    public ResultSearch getResultSearch() {
        return resultSearch;
    }

    public PageLocation getPageLocation() {
        return pageLocation;
    }

}
