package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {
    protected ChromeDriver driver;

    public FirstPage(ChromeDriver driver){
        this.driver = driver;
    }

    public String getTextFirstLink() {
        return driver.findElement(By.cssSelector("a[accesskey='1']")).getText();
    }
}
