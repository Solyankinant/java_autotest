package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSearch {
    By ButtonSearch = By.cssSelector("form[role='search'] button[type='submit']");
    By fieldSearch = By.cssSelector("#text");
    private static  final String URL  = "https://yandex.ru/";

    protected WebDriver driver;

    public PageSearch(ChromeDriver driver){
        this.driver = driver;
    }

    public void openSearchPage (){
        driver.get(URL);
    }

    public void clickButtonSearch() {
        driver.findElement(ButtonSearch).click();
    }

    public void inputTextSearch(String textSearch) {
        driver.findElement(fieldSearch).sendKeys(textSearch);
    }

}