package ru.solyankinas.autotest.pages;


import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    protected ChromeDriver driver;

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

    public PageLocation pageLocation(){
        return pageLocation;
    }
}
