package ru.solyankinas.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageSearch {
    public WebDriver driver;
    private By buttonSearch = By.cssSelector("form[role='search'] button[type='submit']");
    private By fieldSearch = By.cssSelector("#text");
    @FindBy(css = "[data-statlog='head.region.setup']")
    public WebElement location;
    @FindBy(css = "[data-statlog='tabs.more']")
    public WebElement linkMore;
    @FindBy(css = ".home-tabs__more")
    public WebElement listMore;

    private static final String URL = "https://yandex.ru/";

    public PageSearch(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickMore() {
        linkMore.click();
    }

    public String getListMore() {
        return listMore.getText();
    }

    public String[] getStringMore() {
        return getListMore().split("(?=\\p{Lu})");
    }

    public void comparsionMore(String[] listMoreFirstCity, String[] listMoreSecondCity) {
        for (int i = 0; i < listMoreFirstCity.length; i++) {
            Assert.assertEquals(listMoreSecondCity[i], listMoreFirstCity[i]);
        }
    }

    public void openSearchPage() {
        driver.get(URL);
    }

    public void clickButtonSearch() {
        driver.findElement(buttonSearch).click();
    }

    public void clickLocation() {
        location.click();
    }

    public void inputTextSearch(String textSearch) {
        driver.findElement(fieldSearch).sendKeys(textSearch);
    }
}
