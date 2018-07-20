package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSearch {

    By buttonSearch = By.cssSelector("form[role='search'] button[type='submit']");
    By fieldSearch = By.cssSelector("#text");
    @FindBy(css = "[data-statlog='head.region.setup']")
    private WebElement location;

    private static  final String URL  = "https://yandex.ru/";

    protected WebDriver driver;

    public PageSearch(ChromeDriver driver){
        PageFactory .initElements(driver, this);
        this.driver = driver;
    }

    public void openSearchPage (){
        driver.get(URL);
    }

    public void clickButtonSearch() {
        driver.findElement(buttonSearch).click();
    }

    public void clickLocation(){
        location.click();
    }

    public void inputTextSearch(String textSearch) {
        driver.findElement(fieldSearch).sendKeys(textSearch);
    }

}