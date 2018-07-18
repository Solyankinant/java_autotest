package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultSearch {
    By TextFirstLink = By.cssSelector("a[accesskey='1']");

    protected ChromeDriver driver;

    public ResultSearch(ChromeDriver driver){
        this.driver = driver;
    }

    public String getTextFirstLink() {
        return driver.findElement(TextFirstLink).getText();
    }
}
