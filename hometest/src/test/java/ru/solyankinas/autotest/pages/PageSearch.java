package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSearch {
    protected WebDriver driver;

    public PageSearch(ChromeDriver driver){
        this.driver = driver;
    }

    public void clickButtonSearch() {
        driver.findElement(By.cssSelector("form[role='search'] button[type='submit']")).click();
    }

    public void inputTextSearch(String textSearch) {
        driver.findElement(By.cssSelector(("#text"))).sendKeys(textSearch);
    }
}
